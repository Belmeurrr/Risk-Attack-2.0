package game_objects.continents;

import game_objects.Constants;
import game_objects.territories.Territory;

import java.util.ArrayList;

public class Asia extends Continent {

    public void init() {
        bonusArmiesGiven = 7;
        /*containingTerritories = new ArrayList<>();*/
        /*setUpContainingTerritories();*/
    }

    public void setUpContainingTerritories() {
        containingTerritories.add(Constants.territoriesArrayList.get(16));
        containingTerritories.add(Constants.territoriesArrayList.get(17));
        containingTerritories.add(Constants.territoriesArrayList.get(18));
        containingTerritories.add(Constants.territoriesArrayList.get(19));
        containingTerritories.add(Constants.territoriesArrayList.get(20));
        containingTerritories.add(Constants.territoriesArrayList.get(21));
        containingTerritories.add(Constants.territoriesArrayList.get(22));
        containingTerritories.add(Constants.territoriesArrayList.get(23));
        containingTerritories.add(Constants.territoriesArrayList.get(24));
        containingTerritories.add(Constants.territoriesArrayList.get(25));
        containingTerritories.add(Constants.territoriesArrayList.get(26));
        containingTerritories.add(Constants.territoriesArrayList.get(27));
    }


}
