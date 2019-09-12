package game_objects.continents;

import game_objects.Constants;

import java.util.ArrayList;

public class SouthAmerica extends Continent {


    @Override
    public void setUpContainingTerritories() {
        containingTerritories.add(Constants.territoriesArrayList.get(34));
        containingTerritories.add(Constants.territoriesArrayList.get(35));
        containingTerritories.add(Constants.territoriesArrayList.get(36));
        containingTerritories.add(Constants.territoriesArrayList.get(37));
    }

    @Override
    public void init() {
        bonusArmiesGiven = 2;
        /*setUpContainingTerritories();*/
    }

}
