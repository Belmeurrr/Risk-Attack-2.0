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

public class NewGuinea extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(1803, 501);
        polygon.addPoint(1816, 515);
        polygon.addPoint(1828, 516);
        polygon.addPoint(1829, 524);
        polygon.addPoint(1841, 531);
        polygon.addPoint(1839, 538);
        polygon.addPoint(1849, 559);
        polygon.addPoint(1842, 563);
        polygon.addPoint(1828, 562);
        polygon.addPoint(1826, 556);
        polygon.addPoint(1815, 552);
        polygon.addPoint(1813, 556);
        polygon.addPoint(1791, 556);
        polygon.addPoint(1789, 553);
        polygon.addPoint(1769, 550);
        polygon.addPoint(1772, 531);
        polygon.addPoint(1749, 525);
        polygon.addPoint(1738, 508);
        polygon.addPoint(1748, 495);
        polygon.addPoint(1767, 509);
        polygon.addPoint(1772, 510);
        polygon.addPoint(1772, 501);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {
        connectedTerritories.add(Constants.territoriesArrayList.get(39));   //Indonisia
        connectedTerritories.add(Constants.territoriesArrayList.get(40));   //WA
        connectedTerritories.add(Constants.territoriesArrayList.get(41));   //EA

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
