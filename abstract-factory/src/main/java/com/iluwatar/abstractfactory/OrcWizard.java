package com.iluwatar.abstractfactory;

public class OrcWizard implements Wizard {

  static final String DESCRIPTION = "This is the Orc wizard!";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
