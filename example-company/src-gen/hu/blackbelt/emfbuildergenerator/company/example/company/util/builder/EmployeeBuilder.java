package hu.blackbelt.emfbuildergenerator.company.example.company.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>hu.blackbelt.emfbuildergenerator.company.example.company.Employee</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class EmployeeBuilder implements hu.blackbelt.emfbuildergenerator.company.example.company.util.builder.ICompanyBuilder<hu.blackbelt.emfbuildergenerator.company.example.company.Employee> {
  // features and builders
  private java.lang.String m_name;
  // helper attributes
  private boolean m_featureNameSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newEmployeeBuilder()
   */
  private EmployeeBuilder() {
  }

  /**
   * This method creates a new instance of the EmployeeBuilder.
   * @return new instance of the EmployeeBuilder
   */
  public static EmployeeBuilder create() {
    return new EmployeeBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public EmployeeBuilder but() {
    EmployeeBuilder _builder = create();
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    return _builder;
  }

  /**
   * This method constructs the final hu.blackbelt.emfbuildergenerator.company.example.company.Employee type.
   * @return new instance of the hu.blackbelt.emfbuildergenerator.company.example.company.Employee type
   */
  public hu.blackbelt.emfbuildergenerator.company.example.company.Employee build() {
    final hu.blackbelt.emfbuildergenerator.company.example.company.Employee _newInstance = hu.blackbelt.emfbuildergenerator.company.example.company.CompanyFactory.eINSTANCE.createEmployee();
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    return _newInstance;
  }

  public EmployeeBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }
}
