package com.iluwatar.abstractfactory;

public class GiantCastle implements Castle {

  static final String DESCRIPTION = "This is the giant castle!";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
