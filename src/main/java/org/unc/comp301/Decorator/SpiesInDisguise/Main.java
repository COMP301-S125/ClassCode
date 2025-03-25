package org.unc.comp301.Decorator.SpiesInDisguise;

public class Main {
  public static void main(String[] args) {
    Spy perry = new Perry();

    perry.putOnDisguise();
    // perry.takeOffDisguise();

    perry = new HotDogSpy(perry);
    perry = new GoldScar(perry);
    perry = new Inator(perry);

    System.out.println(perry.getDescription());

    System.out.println("Perry puts on his hat!");
    perry.takeOffDisguise();

    System.out.println(perry.getDescription());

    System.out.println("Perry takes off his hat again");
    perry.putOnDisguise();
    System.out.println(perry.getDescription());
  }
}
