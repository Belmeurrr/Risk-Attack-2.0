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

public class Irkutsk extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(1683, 142);
        polygon.addPoint(1683, 175);
        polygon.addPoint(1703, 196);
        polygon.addPoint(1720, 194);
        polygon.addPoint(1731, 207);
        polygon.addPoint(1729, 232);
        polygon.addPoint(1721, 232);
        polygon.addPoint(1706, 217);
        polygon.addPoint(1702, 214);
        polygon.addPoint(1703, 207);
        polygon.addPoint(1682, 209);
        polygon.addPoint(1682, 219);
        polygon.addPoint(1678, 223);
        polygon.addPoint(1680, 232);
        polygon.addPoint(1676, 237);
        polygon.addPoint(1672, 237);
        polygon.addPoint(1668, 233);
        polygon.addPoint(1664, 235);
        polygon.addPoint(1649, 240);
        polygon.addPoint(1629, 237);
        polygon.addPoint(1621, 237);
        polygon.addPoint(1615, 237);
        polygon.addPoint(1603, 233);
        polygon.addPoint(1600, 235);
        polygon.addPoint(1594, 229);
        polygon.addPoint(1590, 228);
        polygon.addPoint(1591, 214);
        polygon.addPoint(1589, 209);
        polygon.addPoint(1604, 189);
        polygon.addPoint(1613, 186);
        polygon.addPoint(1619, 194);
        polygon.addPoint(1625, 194);
        polygon.addPoint(1631, 189);
        polygon.addPoint(1634, 158);
        polygon.addPoint(1649, 153);
        polygon.addPoint(1649, 144);
        polygon.addPoint(1653, 145);
        polygon.addPoint(1659, 147);
        polygon.addPoint(1662, 142);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {
        connectedTerritories.add(Constants.territoriesArrayList.get(18));   //Yakuskt
        connectedTerritories.add(Constants.territoriesArrayList.get(19));   //Kamchatka
        connectedTerritories.add(Constants.territoriesArrayList.get(22));   //Mongolia
        connectedTerritories.add(Constants.territoriesArrayList.get(16));   //Siberia

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
