package game_objects.territories;
/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 7/13/2019 2019 @ 9:52 PM
 */

import game_objects.Constants;
import game_objects.continents.Asia;
import game_objects.continents.NorthAmerica;

import java.awt.*;
import java.util.ArrayList;

public class Ural extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(1510, 258);
        polygon.addPoint(1531, 259);
        polygon.addPoint(1544, 270);
        polygon.addPoint(1558, 247);
        polygon.addPoint(1563, 244);
        polygon.addPoint(1562, 232);
        polygon.addPoint(1543, 210);
        polygon.addPoint(1530, 205);
        polygon.addPoint(1542, 189);
        polygon.addPoint(1536, 170);
        polygon.addPoint(1521, 148);
        polygon.addPoint(1511, 125);
        polygon.addPoint(1499, 108);
        polygon.addPoint(1488, 103);
        polygon.addPoint(1478, 92);
        polygon.addPoint(1481, 81);
        polygon.addPoint(1461, 69);
        polygon.addPoint(1453, 92);
        polygon.addPoint(1467, 107);
        polygon.addPoint(1466, 126);
        polygon.addPoint(1456, 136);
        polygon.addPoint(1457, 191);
        polygon.addPoint(1466, 199);
        polygon.addPoint(1466, 223);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {
        connectedTerritories.add(Constants.territoriesArrayList.get(16));   //Siberia
        connectedTerritories.add(Constants.territoriesArrayList.get(23));   //China
        connectedTerritories.add(Constants.territoriesArrayList.get(26));   //Afghanistan
        connectedTerritories.add(Constants.territoriesArrayList.get(11));   //Ukraine

    }

    @Override
    public Polygon getPolygon() {
        return polygon;
    }

    @Override
    public void setContinent() {
        homeContinent = Constants.continentArrayList.get(1);
    }
}
