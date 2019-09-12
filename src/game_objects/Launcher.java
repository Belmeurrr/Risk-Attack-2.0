package game_objects;/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 7/15/2019 2019 @ 12:39 AM
 */

public class Launcher {
    public static void main(String[] args) {

        Constants constants = new Constants();
        Menu menu = new Menu();

        if (args.length != 0) {
            Game.gamestate = Game.GAMESTATE.RANDOM_INITIALIZATION_PHASE;
        }
    }
}
