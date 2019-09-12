package game_objects.territories;
/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 7/13/2019 2019 @ 9:52 PM
 */

import game_objects.Constants;
import game_objects.continents.Asia;

import java.awt.*;
import java.util.ArrayList;

public class Japan extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(1812, 211);
        polygon.addPoint(1832, 207);
        polygon.addPoint(1839, 215);
        polygon.addPoint(1828, 224);
        polygon.addPoint(1827, 229);
        polygon.addPoint(1810, 233);
        polygon.addPoint(1828, 246);
        polygon.addPoint(1831, 284);
        polygon.addPoint(1810, 299);
        polygon.addPoint(1805, 307);
        polygon.addPoint(1795, 308);
        polygon.addPoint(1759, 318);
        polygon.addPoint(1776, 292);
        polygon.addPoint(1784, 291);
        polygon.addPoint(1799, 271);
        polygon.addPoint(1801, 258);
        polygon.addPoint(1795, 253);
        polygon.addPoint(1802, 244);
        polygon.addPoint(1796, 237);
        polygon.addPoint(1796, 226);
        polygon.addPoint(1800, 225);
        polygon.addPoint(1793, 206);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {
        connectedTerritories.add(Constants.territoriesArrayList.get(19));   //Kamchatka
        connectedTerritories.add(Constants.territoriesArrayList.get(22));   //Mongolia
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
