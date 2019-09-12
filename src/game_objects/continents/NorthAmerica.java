package game_objects.continents;

import game_objects.Constants;

import java.util.ArrayList;

public class NorthAmerica extends Continent {

    public NorthAmerica() {

    }

    @Override
    public void setUpContainingTerritories() {
        containingTerritories.add(Constants.territoriesArrayList.get(0));
        containingTerritories.add(Constants.territoriesArrayList.get(1));
        containingTerritories.add(Constants.territoriesArrayList.get(2));
        containingTerritories.add(Constants.territoriesArrayList.get(3));
        containingTerritories.add(Constants.territoriesArrayList.get(4));
        containingTerritories.add(Constants.territoriesArrayList.get(5));
        containingTerritories.add(Constants.territoriesArrayList.get(6));
        containingTerritories.add(Constants.territoriesArrayList.get(7));
        containingTerritories.add(Constants.territoriesArrayList.get(8));
    }

    @Override
    public void init() {
        bonusArmiesGiven = 5;

        /*setUpContainingTerritories();*/
    }

}
