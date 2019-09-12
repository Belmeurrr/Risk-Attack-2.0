package game_objects;/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 7/25/2019 2019 @ 6:29 PM
 */

import game_objects.continents.Continent;
import game_objects.territories.Territory;
import game_objects.territories.territory_setup.TerritoryTable;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.TreeMap;


public class Constants {
    public static final String title = "Risk Attack 2.0";
    public static final int width = 1920;
    public static final int height = 1080;
    static int matchTurnInCount = 0;

    public static int playerCount;
    public static TerritoryTable territoryTable;
    public static ArrayList<Territory> territoriesArrayList;
    public static ArrayList<Continent> continentArrayList;
    public static ArrayList<Player> playerArrayList;
    static JFrame gameFrame = new JFrame(title);
    static Canvas canvas = new Canvas();

    static JPanel gamePanel;

    public static GameLog gameLog;

    public static Player currentPlayer;


    Constants() {
        territoryTable = new TerritoryTable();


        territoriesArrayList = (ArrayList<Territory>) territoryTable.getTerritory().clone();
        continentArrayList = (ArrayList<Continent>) territoryTable.getContinents().clone();

        for (int index = 0; index < continentArrayList.size(); index++) {
            continentArrayList.get(index).setUpContainingTerritories();
        }

        playerArrayList = new ArrayList<>();


        for (Territory territory : territoriesArrayList) {
            territory.setReigon();
            territory.setConnectedTerritories();
            territory.setContinent();
            territory.setCentroid();
        }
        gameLog = new GameLog();
        currentPlayer = null;

        gameFrame.setPreferredSize(new Dimension(width, height));
        gameFrame.setMaximumSize(new Dimension(width, height));
        gameFrame.setMinimumSize(new Dimension(width, height));
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setResizable(false);
        gameFrame.setLocationRelativeTo(null);
        gameFrame.setVisible(true);

        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setMaximumSize(new Dimension(width, height));
        canvas.setMinimumSize(new Dimension(width, height));

        gamePanel = new JPanel();
        gamePanel.setPreferredSize(new Dimension(width, height));
        gamePanel.setMaximumSize(new Dimension(width, height));
        gamePanel.setMinimumSize(new Dimension(width, height));


        for (int i = 0; i < territoryTable.getTerritory().size(); i++) {
            territoriesArrayList.set(i, (Territory) territoryTable.getTerritory().get(i));
        }

    }

    public static boolean areAllTerritoriesOwned() {
        boolean flag = false;
        for (int index = 0; index < territoriesArrayList.size(); index++) {

            if (territoriesArrayList.get(index).getOwner() != null) {

                flag = true;
            } else {
                flag = false;
                return flag;
            }
        }
        return flag;
    }

    public static boolean areAllTerritoriesOwnedByOnePlayer() {
        Player winnner = territoriesArrayList.get(0).getOwner();

        boolean finalFlag = false;
        for (int index = 0; index < territoriesArrayList.size(); index++) {

            if (territoriesArrayList.get(index).getOwner() == winnner) {

                finalFlag = true;
            } else {
                finalFlag = false;
                return finalFlag;
            }
        }
        return finalFlag;
    }

    public static boolean territoryArrayListContainsClickedPoint(Point p) {
        for (int index = 0; index < Constants.territoriesArrayList.size(); index++) {

            if (Constants.territoriesArrayList.get(index).getPolygon().contains(p)) {
                return true;
            }
        }
        return false;
    }

    /*public static void setPlayerCount(){
        playerCount = playerArrayList.size();
    }*/

}