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

public class Siberia extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(1582, 33);
        polygon.addPoint(1553, 38);
        polygon.addPoint(1534, 45);
        polygon.addPoint(1520, 52);
        polygon.addPoint(1506, 59);
        polygon.addPoint(1498, 68);
        polygon.addPoint(1490, 78);
        polygon.addPoint(1484, 84);
        polygon.addPoint(1487, 93);
        polygon.addPoint(1489, 102);
        polygon.addPoint(1504, 106);
        polygon.addPoint(1511, 121);
        polygon.addPoint(1512, 125);
        polygon.addPoint(1519, 136);
        polygon.addPoint(1521, 146);
        polygon.addPoint(1525, 152);
        polygon.addPoint(1534, 163);
        polygon.addPoint(1537, 172);
        polygon.addPoint(1537, 176);
        polygon.addPoint(1544, 189);
        polygon.addPoint(1537, 199);
        polygon.addPoint(1533, 208);
        polygon.addPoint(1543, 210);
        polygon.addPoint(1548, 220);
        polygon.addPoint(1556, 228);
        polygon.addPoint(1564, 234);
        polygon.addPoint(1563, 245);
        polygon.addPoint(1570, 251);
        polygon.addPoint(1580, 250);
        polygon.addPoint(1588, 258);
        polygon.addPoint(1588, 265);
        polygon.addPoint(1600, 267);
        polygon.addPoint(1601, 256);
        polygon.addPoint(1600, 234);
        polygon.addPoint(1588, 228);
        polygon.addPoint(1590, 213);
        polygon.addPoint(1587, 210);
        polygon.addPoint(1593, 198);
        polygon.addPoint(1605, 186);
        polygon.addPoint(1613, 185);
        polygon.addPoint(1623, 195);
        polygon.addPoint(1631, 188);
        polygon.addPoint(1627, 175);
        polygon.addPoint(1626, 131);
        polygon.addPoint(1624, 128);
        polygon.addPoint(1624, 119);
        polygon.addPoint(1612, 113);
        polygon.addPoint(1619, 101);
        polygon.addPoint(1637, 102);
        polygon.addPoint(1638, 87);
        polygon.addPoint(1642, 81);
        polygon.addPoint(1640, 73);
        polygon.addPoint(1635, 71);
        polygon.addPoint(1636, 64);
        polygon.addPoint(1615, 60);
        polygon.addPoint(1604, 57);
        polygon.addPoint(1603, 44);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {

        connectedTerritories.add(Constants.territoriesArrayList.get(17));   //Ural
        connectedTerritories.add(Constants.territoriesArrayList.get(23));   //China
        connectedTerritories.add(Constants.territoriesArrayList.get(21));   //Irutsk
        connectedTerritories.add(Constants.territoriesArrayList.get(18));   //Yakutsa
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
