package game_objects.continents;

import game_objects.Constants;


import java.util.ArrayList;

public class Africa extends Continent {

    public void init() {
        bonusArmiesGiven = 3;
        /*containingTerritories = new ArrayList<>();*/
        /*setUpContainingTerritories();*/
    }

    @Override
    public void setUpContainingTerritories() {
        containingTerritories.add(Constants.territoriesArrayList.get(28));
        containingTerritories.add(Constants.territoriesArrayList.get(29));
        containingTerritories.add(Constants.territoriesArrayList.get(30));
        containingTerritories.add(Constants.territoriesArrayList.get(31));
        containingTerritories.add(Constants.territoriesArrayList.get(32));
        containingTerritories.add(Constants.territoriesArrayList.get(33));
    }

}
