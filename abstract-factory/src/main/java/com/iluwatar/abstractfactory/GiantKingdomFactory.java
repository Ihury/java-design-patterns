package com.iluwatar.abstractfactory;

public class GiantKingdomFactory implements KingdomFactory {

  public Castle createCastle() {
    return new GiantCastle();
  }

  public King createKing() {
    return new GiantKing();
  }

  public Army createArmy() {
    return new GiantArmy();
  }

  public Wizard createWizard() {
    return new OrcWizard();
  }
}
