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

public class Yakutska extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(1643, 54);
        polygon.addPoint(1659, 68);
        polygon.addPoint(1690, 66);
        polygon.addPoint(1690, 60);
        polygon.addPoint(1711, 57);
        polygon.addPoint(1728, 60);
        polygon.addPoint(1741, 71);
        polygon.addPoint(1739, 77);
        polygon.addPoint(1722, 88);
        polygon.addPoint(1721, 103);
        polygon.addPoint(1729, 123);
        polygon.addPoint(1714, 124);
        polygon.addPoint(1693, 124);
        polygon.addPoint(1682, 141);
        polygon.addPoint(1660, 142);
        polygon.addPoint(1659, 145);
        polygon.addPoint(1654, 145);
        polygon.addPoint(1653, 141);
        polygon.addPoint(1648, 142);
        polygon.addPoint(1646, 150);
        polygon.addPoint(1634, 157);
        polygon.addPoint(1627, 140);
        polygon.addPoint(1625, 118);
        polygon.addPoint(1613, 111);
        polygon.addPoint(1618, 103);
        polygon.addPoint(1629, 104);
        polygon.addPoint(1638, 103);
        polygon.addPoint(1639, 87);
        polygon.addPoint(1642, 82);
        polygon.addPoint(1643, 74);
        polygon.addPoint(1637, 70);
        polygon.addPoint(1635, 63);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {

        connectedTerritories.add(Constants.territoriesArrayList.get(16));   //Siberia
        connectedTerritories.add(Constants.territoriesArrayList.get(21));   //Irkutska
        connectedTerritories.add(Constants.territoriesArrayList.get(19));   //Kamchatka

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
