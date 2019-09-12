package game_objects.continents;

import game_objects.Player;
import game_objects.territories.Territory;

import java.util.ArrayList;

public abstract class Continent {
    private String colorRepresentaion;
    int bonusArmiesGiven;
    private boolean isOwnedByOnePlayer;

    ArrayList<Territory> containingTerritories = new ArrayList<>();

    public ArrayList<Territory> getContainingTerritories() {
        return containingTerritories;
    }

    public int getBonusArmiesGiven() {
        return bonusArmiesGiven;
    }

    public abstract void setUpContainingTerritories();

    public abstract void init();

    public boolean isOwnedByOnePlayer() {
        ArrayList<Player> owners = new ArrayList();
        owners.add(containingTerritories.get(0).getOwner());
        for (int index = 1; index < containingTerritories.size(); index++) {
            if (!(owners.get(0).equals(containingTerritories.get(index).getOwner()))) {
                owners.add(containingTerritories.get(index).getOwner());
            }
        }
        return owners.size() == 1;
    }


}
