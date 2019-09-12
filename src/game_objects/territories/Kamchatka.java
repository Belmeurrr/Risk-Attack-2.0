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

public class Kamchatka extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(1759, 70);
        polygon.addPoint(1766, 75);
        polygon.addPoint(1795, 78);
        polygon.addPoint(1794, 70);
        polygon.addPoint(1814, 69);
        polygon.addPoint(1846, 85);
        polygon.addPoint(1850, 92);
        polygon.addPoint(1852, 89);
        polygon.addPoint(1871, 112);
        polygon.addPoint(1853, 114);
        polygon.addPoint(1852, 108);
        polygon.addPoint(1840, 102);
        polygon.addPoint(1846, 118);
        polygon.addPoint(1810, 145);
        polygon.addPoint(1813, 196);
        polygon.addPoint(1807, 201);
        polygon.addPoint(1791, 187);
        polygon.addPoint(1787, 163);
        polygon.addPoint(1800, 141);
        polygon.addPoint(1770, 153);
        polygon.addPoint(1760, 152);
        polygon.addPoint(1735, 153);
        polygon.addPoint(1725, 172);
        polygon.addPoint(1749, 181);
        polygon.addPoint(1760, 208);
        polygon.addPoint(1758, 246);
        polygon.addPoint(1738, 249);
        polygon.addPoint(1726, 244);
        polygon.addPoint(1729, 239);
        polygon.addPoint(1733, 208);
        polygon.addPoint(1722, 195);
        polygon.addPoint(1711, 193);
        polygon.addPoint(1703, 195);
        polygon.addPoint(1701, 188);
        polygon.addPoint(1684, 173);
        polygon.addPoint(1682, 141);
        polygon.addPoint(1691, 134);
        polygon.addPoint(1694, 125);
        polygon.addPoint(1729, 125);
        polygon.addPoint(1731, 118);
        polygon.addPoint(1736, 113);
        polygon.addPoint(1736, 109);
        polygon.addPoint(1723, 102);
        polygon.addPoint(1723, 91);
        polygon.addPoint(1740, 82);
        polygon.addPoint(1741, 71);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {

        connectedTerritories.add(Constants.territoriesArrayList.get(18));    //Yakutsa
        connectedTerritories.add(Constants.territoriesArrayList.get(21));   //Irkitska
        connectedTerritories.add(Constants.territoriesArrayList.get(22));   //Mongolia
        connectedTerritories.add(Constants.territoriesArrayList.get(20));   //Japan
        connectedTerritories.add(Constants.territoriesArrayList.get(0));   //Alaska

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
