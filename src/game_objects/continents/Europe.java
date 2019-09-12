package game_objects.continents;

import game_objects.Constants;

import java.util.ArrayList;

public class Europe extends Continent {


    @Override
    public void setUpContainingTerritories() {
        containingTerritories.add(Constants.territoriesArrayList.get(9));
        containingTerritories.add(Constants.territoriesArrayList.get(10));
        containingTerritories.add(Constants.territoriesArrayList.get(11));
        containingTerritories.add(Constants.territoriesArrayList.get(12));
        containingTerritories.add(Constants.territoriesArrayList.get(13));
        containingTerritories.add(Constants.territoriesArrayList.get(14));
        containingTerritories.add(Constants.territoriesArrayList.get(15));
    }

    @Override
    public void init() {
        bonusArmiesGiven = 5;
        /*containingTerritories = new ArrayList<>();*/
        /*setUpContainingTerritories();*/
    }

}
