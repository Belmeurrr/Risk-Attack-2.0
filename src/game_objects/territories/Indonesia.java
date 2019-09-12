package game_objects.territories;
/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 7/13/2019 2019 @ 9:52 PM
 */

import game_objects.Constants;
import game_objects.continents.Asia;
import game_objects.continents.Australia;

import java.awt.*;
import java.util.ArrayList;

public class Indonesia extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(1599, 530);
        polygon.addPoint(1608, 524);
        polygon.addPoint(1657, 545);
        polygon.addPoint(1662, 538);
        polygon.addPoint(1671, 536);
        polygon.addPoint(1694, 507);
        polygon.addPoint(1713, 515);
        polygon.addPoint(1714, 525);
        polygon.addPoint(1709, 530);
        polygon.addPoint(1712, 544);
        polygon.addPoint(1742, 544);
        polygon.addPoint(1740, 550);
        polygon.addPoint(1727, 591);
        polygon.addPoint(1720, 605);
        polygon.addPoint(1670, 604);
        polygon.addPoint(1654, 598);
        polygon.addPoint(1633, 571);
        polygon.addPoint(1624, 568);
        polygon.addPoint(1624, 561);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {
        connectedTerritories.add(Constants.territoriesArrayList.get(24));   //Siam
        connectedTerritories.add(Constants.territoriesArrayList.get(38));   //NG
        connectedTerritories.add(Constants.territoriesArrayList.get(40));   //WA

    }

    @Override
    public Polygon getPolygon() {
        return polygon;
    }

    @Override
    public void setContinent() {
        homeContinent = Constants.continentArrayList.get(2);
    }
}
