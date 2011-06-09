package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.InterfaceRealization</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class InterfaceRealizationBuilder {
  // features and builders
  private org.eclipse.uml2.uml.Interface m_contract;
  private org.eclipse.uml2.uml.util.builder.InterfaceBuilder m_featureContractBuilder;
  private org.eclipse.uml2.uml.BehavioredClassifier m_implementingClassifier;
  private org.eclipse.uml2.uml.OpaqueExpression m_mapping;
  private org.eclipse.uml2.uml.util.builder.OpaqueExpressionBuilder m_featureMappingBuilder;
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.StringExpressionBuilder m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.TemplateParameter m_owningTemplateParameter;
  private org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder m_featureOwningTemplateParameterBuilder;
  private org.eclipse.uml2.uml.TemplateParameter m_templateParameter;
  private org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder m_featureTemplateParameterBuilder;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.NamedElement> m_client = new java.util.LinkedList<org.eclipse.uml2.uml.NamedElement>();
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.DependencyBuilder> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.DependencyBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.NamedElement> m_supplier = new java.util.LinkedList<org.eclipse.uml2.uml.NamedElement>();
  // helper attributes
  private boolean m_featureClientSet = false;
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureContractSet = false;
  private boolean m_featureImplementingClassifierSet = false;
  private boolean m_featureMappingSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureOwningTemplateParameterSet = false;
  private boolean m_featureSupplierSet = false;
  private boolean m_featureTemplateParameterSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newInterfaceRealizationBuilder()
   */
  private InterfaceRealizationBuilder() {
  }

  /**
   * This method creates a new instance of the InterfaceRealizationBuilder.
   * @return new instance of the InterfaceRealizationBuilder
   */
  public static InterfaceRealizationBuilder newInterfaceRealizationBuilder() {
    return new InterfaceRealizationBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public InterfaceRealizationBuilder but() {
    InterfaceRealizationBuilder _builder = newInterfaceRealizationBuilder();
    _builder.m_featureClientSet = m_featureClientSet;
    _builder.m_client = m_client;
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureContractSet = m_featureContractSet;
    _builder.m_contract = m_contract;
    _builder.m_featureContractBuilder = m_featureContractBuilder;
    _builder.m_featureImplementingClassifierSet = m_featureImplementingClassifierSet;
    _builder.m_implementingClassifier = m_implementingClassifier;
    _builder.m_featureMappingSet = m_featureMappingSet;
    _builder.m_mapping = m_mapping;
    _builder.m_featureMappingBuilder = m_featureMappingBuilder;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureNameExpressionSet = m_featureNameExpressionSet;
    _builder.m_nameExpression = m_nameExpression;
    _builder.m_featureNameExpressionBuilder = m_featureNameExpressionBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureOwningTemplateParameterSet = m_featureOwningTemplateParameterSet;
    _builder.m_owningTemplateParameter = m_owningTemplateParameter;
    _builder.m_featureOwningTemplateParameterBuilder = m_featureOwningTemplateParameterBuilder;
    _builder.m_featureSupplierSet = m_featureSupplierSet;
    _builder.m_supplier = m_supplier;
    _builder.m_featureTemplateParameterSet = m_featureTemplateParameterSet;
    _builder.m_templateParameter = m_templateParameter;
    _builder.m_featureTemplateParameterBuilder = m_featureTemplateParameterBuilder;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.InterfaceRealization type.
   * @return new instance of the org.eclipse.uml2.uml.InterfaceRealization type
   */
  public org.eclipse.uml2.uml.InterfaceRealization build() {
    final org.eclipse.uml2.uml.InterfaceRealization _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createInterfaceRealization();
    if (m_featureContractSet) {
      _newInstance.setContract(m_contract);
    } else {
      if (m_featureContractBuilder != null) {
        _newInstance.setContract(m_featureContractBuilder.build());
      }
    }
    if (m_featureImplementingClassifierSet) {
      _newInstance.setImplementingClassifier(m_implementingClassifier);
    }
    if (m_featureMappingSet) {
      _newInstance.setMapping(m_mapping);
    } else {
      if (m_featureMappingBuilder != null) {
        _newInstance.setMapping(m_featureMappingBuilder.build());
      }
    }
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    if (m_featureNameExpressionSet) {
      _newInstance.setNameExpression(m_nameExpression);
    } else {
      if (m_featureNameExpressionBuilder != null) {
        _newInstance.setNameExpression(m_featureNameExpressionBuilder.build());
      }
    }
    if (m_featureOwningTemplateParameterSet) {
      _newInstance.setOwningTemplateParameter(m_owningTemplateParameter);
    } else {
      if (m_featureOwningTemplateParameterBuilder != null) {
        _newInstance.setOwningTemplateParameter(m_featureOwningTemplateParameterBuilder.build());
      }
    }
    if (m_featureTemplateParameterSet) {
      _newInstance.setTemplateParameter(m_templateParameter);
    } else {
      if (m_featureTemplateParameterBuilder != null) {
        _newInstance.setTemplateParameter(m_featureTemplateParameterBuilder.build());
      }
    }
    if (m_featureVisibilitySet) {
      _newInstance.setVisibility(m_visibility);
    }
    if (m_featureClientSet) {
      _newInstance.getClients().addAll(m_client);
    }
    if (m_featureClientDependencySet) {
      _newInstance.getClientDependencies().addAll(m_clientDependency);
    } else {
      if (!m_featureClientDependencyBuilder.isEmpty()) {
        for (DependencyBuilder builder : m_featureClientDependencyBuilder) {
          _newInstance.getClientDependencies().add(builder.build());
        }
      }
    }
    if (m_featureOwnedCommentSet) {
      _newInstance.getOwnedComments().addAll(m_ownedComment);
    } else {
      if (!m_featureOwnedCommentBuilder.isEmpty()) {
        for (CommentBuilder builder : m_featureOwnedCommentBuilder) {
          _newInstance.getOwnedComments().add(builder.build());
        }
      }
    }
    if (m_featureSupplierSet) {
      _newInstance.getSuppliers().addAll(m_supplier);
    }
    return _newInstance;
  }

  public InterfaceRealizationBuilder withContract(org.eclipse.uml2.uml.Interface p_contract) {
    m_contract = p_contract;
    m_featureContractSet = true;
    return this;
  }

  public InterfaceRealizationBuilder withContract(org.eclipse.uml2.uml.util.builder.InterfaceBuilder p_interfaceBuilder) {
    m_featureContractBuilder = p_interfaceBuilder;
    return this;
  }

  public InterfaceRealizationBuilder withImplementingClassifier(org.eclipse.uml2.uml.BehavioredClassifier p_implementingClassifier) {
    m_implementingClassifier = p_implementingClassifier;
    m_featureImplementingClassifierSet = true;
    return this;
  }

  public InterfaceRealizationBuilder withMapping(org.eclipse.uml2.uml.OpaqueExpression p_mapping) {
    m_mapping = p_mapping;
    m_featureMappingSet = true;
    return this;
  }

  public InterfaceRealizationBuilder withMapping(org.eclipse.uml2.uml.util.builder.OpaqueExpressionBuilder p_opaqueExpressionBuilder) {
    m_featureMappingBuilder = p_opaqueExpressionBuilder;
    return this;
  }

  public InterfaceRealizationBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public InterfaceRealizationBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public InterfaceRealizationBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.StringExpressionBuilder p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public InterfaceRealizationBuilder withOwningTemplateParameter(org.eclipse.uml2.uml.TemplateParameter p_owningTemplateParameter) {
    m_owningTemplateParameter = p_owningTemplateParameter;
    m_featureOwningTemplateParameterSet = true;
    return this;
  }

  public InterfaceRealizationBuilder withOwningTemplateParameter(org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder p_templateParameterBuilder) {
    m_featureOwningTemplateParameterBuilder = p_templateParameterBuilder;
    return this;
  }

  public InterfaceRealizationBuilder withTemplateParameter(org.eclipse.uml2.uml.TemplateParameter p_templateParameter) {
    m_templateParameter = p_templateParameter;
    m_featureTemplateParameterSet = true;
    return this;
  }

  public InterfaceRealizationBuilder withTemplateParameter(org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder p_templateParameterBuilder) {
    m_featureTemplateParameterBuilder = p_templateParameterBuilder;
    return this;
  }

  public InterfaceRealizationBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public InterfaceRealizationBuilder withClient(org.eclipse.uml2.uml.NamedElement p_client) {
    m_client.add(p_client);
    m_featureClientSet = true;
    return this;
  }

  public InterfaceRealizationBuilder withClient(java.util.Collection<? extends org.eclipse.uml2.uml.NamedElement> p_client) {
    m_client.addAll(p_client);
    m_featureClientSet = true;
    return this;
  }

  public InterfaceRealizationBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public InterfaceRealizationBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public InterfaceRealizationBuilder withClientDependency(DependencyBuilder p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public InterfaceRealizationBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public InterfaceRealizationBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public InterfaceRealizationBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public InterfaceRealizationBuilder withSupplier(org.eclipse.uml2.uml.NamedElement p_supplier) {
    m_supplier.add(p_supplier);
    m_featureSupplierSet = true;
    return this;
  }

  public InterfaceRealizationBuilder withSupplier(java.util.Collection<? extends org.eclipse.uml2.uml.NamedElement> p_supplier) {
    m_supplier.addAll(p_supplier);
    m_featureSupplierSet = true;
    return this;
  }
}