package game_objects.territories;
/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 7/13/2019 2019 @ 9:52 PM
 */

import game_objects.Constants;
import game_objects.continents.Africa;
import game_objects.continents.Asia;

import java.awt.*;
import java.util.ArrayList;

public class Congo extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(1354, 555);
        polygon.addPoint(1349, 566);
        polygon.addPoint(1328, 589);
        polygon.addPoint(1331, 604);
        polygon.addPoint(1324, 610);
        polygon.addPoint(1326, 622);
        polygon.addPoint(1322, 622);
        polygon.addPoint(1310, 621);
        polygon.addPoint(1297, 615);
        polygon.addPoint(1293, 601);
        polygon.addPoint(1272, 598);
        polygon.addPoint(1271, 594);
        polygon.addPoint(1243, 590);
        polygon.addPoint(1231, 575);
        polygon.addPoint(1235, 565);
        polygon.addPoint(1268, 560);
        polygon.addPoint(1271, 537);
        polygon.addPoint(1297, 522);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {
        connectedTerritories.add(Constants.territoriesArrayList.get(31));   //NA
        connectedTerritories.add(Constants.territoriesArrayList.get(29));   //EA
        connectedTerritories.add(Constants.territoriesArrayList.get(32));   //SA

    }

    @Override
    public Polygon getPolygon() {
        return polygon;
    }

    @Override
    public void setContinent() {
        homeContinent = Constants.continentArrayList.get(0/*Constants.continentArrayList.indexOf()*/);
    }
}
