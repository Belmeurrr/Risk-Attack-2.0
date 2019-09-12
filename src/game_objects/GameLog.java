package game_objects;/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 8/2/2019 2019 @ 1:23 AM
 */

import game_objects.territories.Territory;

import java.util.ArrayList;

public class GameLog {

    private ArrayList<String> gameLogArrayList;

    public GameLog() {
        gameLogArrayList = new ArrayList<>();
    }

    public ArrayList<String> getGameLogArrayList() {
        return gameLogArrayList;
    }

    public void playerClaimedTerritory(Territory territory) {
        String input = territory.getOwner().getName() + " has claimed " + territory.getName();
        gameLogArrayList.add(input + "\n");
    }

    public void setInitialArmies(int value) {
        String input = "Initial armies everyone gets to place will be " + value;
        gameLogArrayList.add(input + "\n");
    }

    public void armyAddedToTerritory(Territory territory) {
        String input = territory.getOwner().getName() + " has placed 1 army in " + territory.getName();
        gameLogArrayList.add(input + "\n");
    }

    public void fortifiedTerritories(Territory givingTerritory, Territory recievingTerritory, int value) {
        String input = givingTerritory.getOwner().getName() + " has moved " + value + "  armies from " +
                givingTerritory.getName() + " to " + recievingTerritory.getName();
        gameLogArrayList.add(input + "\n");
    }

    public void resultOfBattle(Territory attackingTerritory, Territory defendingTerritory) {
        String input = attackingTerritory.getName() + " has attacked " + defendingTerritory.getName();
        gameLogArrayList.add(input + "\n");
    }

    public void playerConquoredTerritory(Territory attackingTerritory, Territory defendingTerritory) {
        String input = attackingTerritory.getOwner().getName() + " has conquered  " + defendingTerritory.getName();
        gameLogArrayList.add(input + "\n");
    }
}
