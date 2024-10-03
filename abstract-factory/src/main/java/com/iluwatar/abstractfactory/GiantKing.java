package com.iluwatar.abstractfactory;

public class GiantKing implements King {

  static final String DESCRIPTION = "This is the Giant king!";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
