package com.iluwatar.abstractfactory;

public class GiantArmy implements Army {

  static final String DESCRIPTION = "This is the giant army!";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
