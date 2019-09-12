package game_objects.continents;

import game_objects.Constants;
import game_objects.Player;

import java.util.ArrayList;

public class Australia extends Continent {

    public Australia() {

    }

    @Override
    public void setUpContainingTerritories() {
        containingTerritories.add(Constants.territoriesArrayList.get(38));
        containingTerritories.add(Constants.territoriesArrayList.get(39));
        containingTerritories.add(Constants.territoriesArrayList.get(40));
        containingTerritories.add(Constants.territoriesArrayList.get(41));
    }

    @Override
    public void init() {
        bonusArmiesGiven = 2;
        /*containingTerritories = new ArrayList<>();*/
        /*setUpContainingTerritories();*/
    }


}
