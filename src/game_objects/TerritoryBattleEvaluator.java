package game_objects;/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 8/2/2019 2019 @ 2:44 AM
 */

import game_objects.territories.Territory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class TerritoryBattleEvaluator {

    private ArrayList<Integer> defenderDiceArrayList;
    private ArrayList<Integer> attackerDiceArrayList;

    public TerritoryBattleEvaluator() {
    }

    public void getResultOfBattle(Territory attackingTerritory, Territory defendingTerritory, int attackerDiceNumber) {
        int attackerWins = 0;
        int defenderWins = 0;


        setUpDice(attackerDiceNumber, attackingTerritory, defendingTerritory);
        for (int index = 0; index < defenderDiceArrayList.size(); index++) {
            if (attackerDiceArrayList.get(index) > defenderDiceArrayList.get(index)) {
                attackerWins++;
            } else {
                //tie or defender > attack
                defenderWins++;
            }
        }

        attackingTerritory.setArmies(attackingTerritory.getArmies() - defenderWins);
        defendingTerritory.setArmies(defendingTerritory.getArmies() - attackerWins);

        if (defendingTerritory.getArmies() <= 0) {
            defendingTerritory.setOwner(attackingTerritory.getOwner());
            defendingTerritory.incrimentArmy(); //should probably change this to make it so the user moves armies from
            //their own armies from winning territory
            attackingTerritory.decrementArmy();

        }

        defenderDiceArrayList.clear();
        attackerDiceArrayList.clear();
    }

    boolean isValidBattle(Territory attackingTerritory, Territory defendingTerritory, int attackerDiceNumber) {
        return attackingTerritory.getOwner() == Constants.currentPlayer && attackingTerritory.getArmies() > 1
                && attackerDiceNumber > 0 && attackerDiceNumber < 4
                && !(attackingTerritory.getOwner().equals(defendingTerritory.getOwner()))
                && attackingTerritory.getConnectedTerritories().contains(defendingTerritory);
    }

    private void setUpDice(int attackerDiceNumber, Territory attackingTerritory, Territory defendingTerritory) {
        attackerDiceArrayList = new ArrayList<>();
        defenderDiceArrayList = new ArrayList<>();
        Random diceMaker = new Random(System.currentTimeMillis());                  //could split this into two diceMakers for more randomness

        if (attackingTerritory.getArmies() == 3) {
            if (attackerDiceNumber == 3) {
                attackerDiceNumber = 2;
            }
        }

        if (attackingTerritory.getArmies() == 2) {
            if (attackerDiceNumber == 3 || attackerDiceNumber == 2) {
                attackerDiceNumber = 1;
            }
        }

        int defenderDiceNumber;
        if (attackerDiceNumber == 1 || defendingTerritory.getArmies() == 1) {
            defenderDiceNumber = 1;
        } else {
            defenderDiceNumber = attackerDiceNumber - 1;
        }
        for (int index = 0; index < attackerDiceNumber; index++) {
            int diceResult = diceMaker.nextInt(5) + 1;
            attackerDiceArrayList.add(diceResult);
        }
        for (int index = 0; index < defenderDiceNumber; index++) {
            int diceResult = diceMaker.nextInt(5) + 1;
            defenderDiceArrayList.add(diceResult);
        }

        sortArrayLists();

    }

    private void sortArrayLists() {
        attackerDiceArrayList.sort(Collections.reverseOrder());
        defenderDiceArrayList.sort(Collections.reverseOrder());
    }
}
