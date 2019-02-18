/*******************************************************************************
 * Copyright (c) 2010 - 2010 EMF Builder Generator project.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * EMF Builder Generator project committers - initial API and implementation
 * Contact : siamak AT haschemi.org
 *******************************************************************************/
package templates;

import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class JavaExtensions {
  private static List<GenModel> s_genModels;

  public static String fqGenJavaPackage(final EClassifier p_eClassifier) {
    final GenPackage genPackage = findGenPackageFor(p_eClassifier);
    return fqGenJavaPackage(genPackage);
  }

  public static String fqGenJavaPackage(final EPackage p_package) {
    final GenPackage genPackage = findGenPackageFor(p_package);
    return fqGenJavaPackage(genPackage);
  }

  private static String fqGenJavaPackage(final GenPackage genPackage) {
    final StringBuilder sb = new StringBuilder();
    if (genPackage.getBasePackage() != null && genPackage.getBasePackage().trim().length() > 0) {
      sb.append(genPackage.getBasePackage());
      sb.append(".");
    }
    sb.append(genPackage.getEcorePackage().getName());
    return sb.toString();
  }

  public static String factoryInstance(final EClassifier p_eClassifier) {
    final GenPackage genPackage = findGenPackageFor(p_eClassifier);
    final StringBuilder sb = new StringBuilder();
    sb.append(genPackage.getFactoryName());
    sb.append(".");
    sb.append(genPackage.getFactoryInstanceName());
    return sb.toString();
  }

  public static final String safeName(final EStructuralFeature p_structuralFeature) {
    return CodeGenUtil.safeName(p_structuralFeature.getName());
  }

  public static final String safeSetterName(final EStructuralFeature p_structuralFeature) {
    return p_structuralFeature.getName().equals("class") ? p_structuralFeature.getName() + "_" : p_structuralFeature.getName();
  }

  public static String potentiallyPluralizedName(final EStructuralFeature p_structuralFeature) {
    final GenPackage genPackage = findGenPackageFor(p_structuralFeature.getEContainingClass());
    return p_structuralFeature.getName();
  }

  public static void throwRuntimeException(final String p_message) {
    throw new RuntimeException(p_message);
  }

  private static final GenPackage findGenPackageFor(final EPackage p_package) {
    return findGenPackageFor(p_package, p_package);
  }
  
  private static final GenPackage findGenPackageFor(final EClassifier p_classifier) {
    return findGenPackageFor(p_classifier, p_classifier.getEPackage());
  }
  
  private static final GenPackage findGenPackageFor(final EObject p_element, final EPackage p_package) {
    final StringBuilder sb = new StringBuilder();
    for (final GenModel genModel : s_genModels) {

      List<GenPackage> listGenPkgs = getPackagesRecursively(genModel.getGenPackages());
      for (final GenPackage genPackage : listGenPkgs) {
        sb.append(genPackage.getNSURI()).append(",");
        if (p_element.eIsProxy()) {
          EcoreUtil.resolveAll(p_element);
          if (p_element.eIsProxy()) {
            throw new RuntimeException("Could not resolve proxy object " + p_element);
          }
        }
        if (ePackageEquals(p_package, genPackage.getEcorePackage())) {
          return genPackage;
        }
      }
    }
    throw new RuntimeException("Did not find genpackage for '" + p_element + " using genmodels " + sb.toString() + ".");
  }
  

  private static final List<GenPackage> getPackagesRecursively(List<GenPackage> list) {
    List<GenPackage> resultList = new BasicEList<GenPackage>();
    resultList.addAll(list);

    for (final GenPackage genPackage : list) {
      resultList.addAll(getPackagesRecursively(genPackage.getNestedGenPackages()));
    }
    return resultList;
  }

  private static boolean ePackageEquals(final EPackage p_this, final EPackage p_other) {
    return p_this.getName().equals(p_other.getName()) && p_this.getNsPrefix().equals(p_other.getNsPrefix()) && p_this.getNsURI().equals(p_other.getNsURI());
  }

  public static void setGenmodels(final List<GenModel> p_genModels) {
    s_genModels = p_genModels;
  }
}
