package game_objects;/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 8/2/2019 2019 @ 2:44 AM
 */

import game_objects.territories.Territory;

public class TerritoryFortifier {
    /*private Territory givingTerritory, receivingTerritory;
    private int value;*/

    public TerritoryFortifier() {

    }

    public void fortifyTerritory(Territory givingTerritory, Territory receivingTerritory, int value) {
        givingTerritory.setArmies(givingTerritory.getArmies() - value);
        receivingTerritory.setArmies(receivingTerritory.getArmies() + value);
    }

    public boolean isValidFortification(Territory givingTerritory, Territory receivingTerritory, int value) {
        return givingTerritory.getArmies() > receivingTerritory.getArmies()
                && value > 0
                && value < givingTerritory.getArmies()
                && (givingTerritory.getOwner().equals(receivingTerritory.getOwner()))
                && (givingTerritory.getConnectedTerritories().contains(receivingTerritory));
    }
}
