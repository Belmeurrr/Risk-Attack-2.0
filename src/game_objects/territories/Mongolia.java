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

public class Mongolia extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(1697, 308);
        polygon.addPoint(1684, 311);
        polygon.addPoint(1680, 306);
        polygon.addPoint(1667, 310);
        polygon.addPoint(1663, 306);
        polygon.addPoint(1655, 307);
        polygon.addPoint(1654, 304);
        polygon.addPoint(1636, 304);
        polygon.addPoint(1616, 295);
        polygon.addPoint(1604, 277);
        polygon.addPoint(1604, 273);
        polygon.addPoint(1595, 267);
        polygon.addPoint(1602, 266);
        polygon.addPoint(1603, 235);
        polygon.addPoint(1616, 237);
        polygon.addPoint(1629, 238);
        polygon.addPoint(1652, 241);
        polygon.addPoint(1659, 238);
        polygon.addPoint(1663, 238);
        polygon.addPoint(1667, 233);
        polygon.addPoint(1673, 238);
        polygon.addPoint(1681, 232);
        polygon.addPoint(1680, 225);
        polygon.addPoint(1682, 220);
        polygon.addPoint(1683, 210);
        polygon.addPoint(1702, 209);
        polygon.addPoint(1703, 214);
        polygon.addPoint(1720, 231);
        polygon.addPoint(1728, 232);
        polygon.addPoint(1726, 242);
        polygon.addPoint(1748, 261);
        polygon.addPoint(1744, 282);
        polygon.addPoint(1758, 297);
        polygon.addPoint(1744, 310);
        polygon.addPoint(1744, 300);
        polygon.addPoint(1735, 300);
        polygon.addPoint(1721, 315);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {
        connectedTerritories.add(Constants.territoriesArrayList.get(23));   //China
        connectedTerritories.add(Constants.territoriesArrayList.get(16));   //Siberia
        connectedTerritories.add(Constants.territoriesArrayList.get(21));   //Irkutsk
        connectedTerritories.add(Constants.territoriesArrayList.get(19));   //Kamchatka
        connectedTerritories.add(Constants.territoriesArrayList.get(20));   //Japan

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
