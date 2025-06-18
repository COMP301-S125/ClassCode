package org.unc.comp301.Observer.ex2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Create observable game objects
    Game[] games = new Game[3];
    games[0] = new GameImpl("Basketball", "Duke", "UNC");
    games[1] = new GameImpl("Baseball", "UNC", "NCState");
    games[2] = new GameImpl("Lacrosse", "Duke", "Georgetown");

    // Create fan objects (observers)
    UNCFan tar_heel = new UNCFan();
    DukeFan dookie = new DukeFan();
    Fan prof = new Fan(){

      @Override
      public void update(Game g) {
        if(g.whoIsWinning().equals("UNC")){
          cheerForUNC();
        }else if(g.whoIsWinning().equals("NCState")){
          cheerForNCState();
        }
      }
      private void cheerForUNC(){
        System.out.println("Go Heels!");
      }
      private void cheerForNCState(){
        System.out.println("Go WolfPack!");
      }
    };

//    Fan prof = (Game g) -> {
//      if (g.whoIsWinning().equals("UNC")) {
//        System.out.println("UNC Fan: Go Heels!");
//      } else if(g.whoIsWinning().equals("NC State")){
//        System.out.println("NC State Fan: Go Wolfpack!");
//      }
//    };


    // Register observers
    for (Game g : games) {
      g.addObserver(tar_heel);
      g.addObserver(dookie);
      g.addObserver(prof);
    }





    // Allow the program user to score points
    Scanner s = new Scanner(System.in);
    while (s.hasNext()) {
      int game_index = s.nextInt();
      String team = s.next();
      int points_to_add = s.nextInt();

      games[game_index].scorePoints(team, points_to_add);
      games[game_index].printScore();
    }

    // Shut down
    s.close();
  }
}
