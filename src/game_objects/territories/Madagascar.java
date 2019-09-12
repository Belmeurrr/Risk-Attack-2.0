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

public class Madagascar extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(1453, 628);
        polygon.addPoint(1449, 624);
        polygon.addPoint(1443, 621);
        polygon.addPoint(1437, 629);
        polygon.addPoint(1432, 629);
        polygon.addPoint(1428, 638);
        polygon.addPoint(1421, 644);
        polygon.addPoint(1402, 648);
        polygon.addPoint(1399, 663);
        polygon.addPoint(1402, 670);
        polygon.addPoint(1400, 676);
        polygon.addPoint(1389, 684);
        polygon.addPoint(1389, 690);
        polygon.addPoint(1391, 694);
        polygon.addPoint(1390, 700);
        polygon.addPoint(1398, 710);
        polygon.addPoint(1409, 708);
        polygon.addPoint(1416, 710);
        polygon.addPoint(1424, 698);
        polygon.addPoint(1445, 661);
        polygon.addPoint(1447, 649);
        polygon.addPoint(1453, 649);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {
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
