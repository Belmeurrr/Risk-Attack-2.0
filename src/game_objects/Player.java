package game_objects;

import game_objects.cards.ArtilaryCard;
import game_objects.cards.CalvaryCard;
import game_objects.cards.Card;
import game_objects.cards.InfintryCard;
import game_objects.continents.*;
import game_objects.territories.NorthAfrica;
import game_objects.territories.Territory;

import java.awt.*;
import java.util.ArrayList;

public class Player {

    private ArrayList<Territory> ownedTerritories;
    private ArrayList<Continent> ownedContinents;
    private ArrayList<Card> ownedCards;
    private String name;
    /*private String color;*/
    private Color color;
    private Color colorRepresentation;
    private int armiesToPlace;
    private boolean endTurnFlag;
    private int initialArmiesToPlace;
    int bonusArmies = 0;


    public Player(String name, Color color) {
        this.name = name;
        this.color = color;
        ownedTerritories = new ArrayList<>();
        ownedCards = new ArrayList<>();
        ownedContinents = new ArrayList<>();
        /*colorRepresentation = Color.getColor(color);*/
    }

    public ArrayList<Territory> getOwnedTerritories() {
        return ownedTerritories;
    }

    public void removeFromOwnedTerritories(Territory territory/*, Player player*/) {
        /*player.*/
        ownedTerritories.remove(territory);
    }

    public ArrayList<Continent> getOwnedContinents() {
        return ownedContinents;
    }

    public ArrayList<Card> getOwnedCards() {
        return ownedCards;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public int getArmiesToPlace() {
        return armiesToPlace;
    }

    public boolean isEndTurnFlag() {
        return endTurnFlag;
    }

    public int addRoundlyArmies(/*int additionalArmies*/) {

        int thirdOfOwnedTerritories = ownedTerritories.size() / 3;
        int continentBonus = 0;
        int cardBonus = 0;

        if (ownedContinents.size() > 0) {
            for (int index = 0; index < ownedContinents.size(); index++) {
                continentBonus += ownedContinents.get(index).getBonusArmiesGiven();
            }
        }

        armiesToPlace = thirdOfOwnedTerritories + continentBonus + bonusArmies;
        bonusArmies = 0;
        return armiesToPlace;
    }

    public int getInitialArmiesToPlace() {
        return initialArmiesToPlace;
    }

    public void setArmiesPerRound(int val) {

        this.armiesToPlace = val;
    }


    public void decrementArmiesToPlace() {
        armiesToPlace--;
    }

    public void decrementInitialArmiesToPlace() {
        initialArmiesToPlace--;
    }

    public void setInitialArmies() {
        switch (Constants.playerArrayList.size()) {
            case 3:
                initialArmiesToPlace = 35;
                break;
            case 4:
                initialArmiesToPlace = 30;
                break;
            case 5:
                initialArmiesToPlace = 25;
                break;
            case 6:
                initialArmiesToPlace = 20;
                break;
            default:
                initialArmiesToPlace = 40;
                break;

        }
    }


    @Override
    public String toString() {
        return "\nPlayer Name: " + name + " \nPlayer Color: " + color;
    }

    public void checkIfHasContinent() {
        if (Constants.currentPlayer.ownedTerritories.containsAll(Constants.continentArrayList.get(0).getContainingTerritories())
                && !ownedContinents.contains(Constants.continentArrayList.get(0))) {
            ownedContinents.add(Constants.continentArrayList.get(0));
        } else if (ownedContinents.contains(Constants.continentArrayList.get(0))
                && !Constants.currentPlayer.ownedTerritories.containsAll(Constants.continentArrayList.get(0).getContainingTerritories())) {
            ownedContinents.remove(Constants.continentArrayList.get(0));
        }
        if (Constants.currentPlayer.ownedTerritories.containsAll(Constants.continentArrayList.get(1).getContainingTerritories())
                && !ownedContinents.contains(Constants.continentArrayList.get(1))) {
            ownedContinents.add(Constants.continentArrayList.get(1));
        } else if (ownedContinents.contains(Constants.continentArrayList.get(1))
                && !Constants.currentPlayer.ownedTerritories.containsAll(Constants.continentArrayList.get(1).getContainingTerritories())) {
            ownedContinents.remove(Constants.continentArrayList.get(1));
        }
        if (Constants.currentPlayer.ownedTerritories.containsAll(Constants.continentArrayList.get(2).getContainingTerritories())
                && !ownedContinents.contains(Constants.continentArrayList.get(2))) {
            ownedContinents.add(Constants.continentArrayList.get(2));
        } else if (ownedContinents.contains(Constants.continentArrayList.get(2))
                && !Constants.currentPlayer.ownedTerritories.containsAll(Constants.continentArrayList.get(2).getContainingTerritories())) {
            ownedContinents.remove(Constants.continentArrayList.get(2));
        }
        if (Constants.currentPlayer.ownedTerritories.containsAll(Constants.continentArrayList.get(3).getContainingTerritories())
                && !ownedContinents.contains(Constants.continentArrayList.get(3))) {
            ownedContinents.add(Constants.continentArrayList.get(3));
        } else if (ownedContinents.contains(Constants.continentArrayList.get(3))
                && !Constants.currentPlayer.ownedTerritories.containsAll(Constants.continentArrayList.get(3).getContainingTerritories())) {
            ownedContinents.remove(Constants.continentArrayList.get(3));
        }
        if (Constants.currentPlayer.ownedTerritories.containsAll(Constants.continentArrayList.get(4).getContainingTerritories())
                && !ownedContinents.contains(Constants.continentArrayList.get(4))) {
            ownedContinents.add(Constants.continentArrayList.get(4));
        } else if (ownedContinents.contains(Constants.continentArrayList.get(4))
                && !Constants.currentPlayer.ownedTerritories.containsAll(Constants.continentArrayList.get(4).getContainingTerritories())) {
            ownedContinents.remove(Constants.continentArrayList.get(4));
        }
        if (Constants.currentPlayer.ownedTerritories.containsAll(Constants.continentArrayList.get(5).getContainingTerritories())
                && !ownedContinents.contains(Constants.continentArrayList.get(5))) {
            ownedContinents.add(Constants.continentArrayList.get(5));
        } else if (ownedContinents.contains(Constants.continentArrayList.get(5))
                && !Constants.currentPlayer.ownedTerritories.containsAll(Constants.continentArrayList.get(5).getContainingTerritories())) {
            ownedContinents.remove(Constants.continentArrayList.get(5));
        }


    }

    public boolean hasMatch() {
        int infantryCardIndex = 0;
        int calvaryCardIndex = 0;
        int artilleryCardIndex = 0;
/*
        is valid if 3 cards are selected, the 3 cards are not the same card
        the 3 cards are one of each type of card
        or the 3 cards are the same type of card
*/
        if (getOwnedCards().size() < 3) {
            return false;
        }

        for (Card card : getOwnedCards()) {
            if (card instanceof InfintryCard) {
                infantryCardIndex++;
            }
            if (card instanceof CalvaryCard) {
                calvaryCardIndex++;
            }
            if (card instanceof ArtilaryCard) {
                artilleryCardIndex++;
            }
        }
        if (infantryCardIndex == 3 || calvaryCardIndex == 3 || artilleryCardIndex == 3) {
            return true;
        } else return infantryCardIndex == 1 && calvaryCardIndex == 1 && artilleryCardIndex == 1;
    }


    public int getBonusArmies() {
        incrementMatchTurnInCount();
        return doBonusArmyCalculation();
    }

    private int doBonusArmyCalculation() {
        if (Constants.matchTurnInCount <= 5) {
            bonusArmies += 3;
        } else {
            bonusArmies += 5;
        }
        return bonusArmies;
    }

    private void incrementMatchTurnInCount() {
        Constants.matchTurnInCount++;
    }
}
