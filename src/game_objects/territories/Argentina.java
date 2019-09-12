package game_objects.territories;
/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 7/13/2019 2019 @ 9:52 PM
 */

import game_objects.Constants;
import game_objects.continents.Asia;
import game_objects.continents.SouthAmerica;

import java.awt.*;
import java.util.ArrayList;

public class Argentina extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(980, 611);
        polygon.addPoint(976, 625);
        polygon.addPoint(959, 625);
        polygon.addPoint(965, 637);
        polygon.addPoint(959, 646);
        polygon.addPoint(938, 647);
        polygon.addPoint(937, 661);
        polygon.addPoint(925, 661);
        polygon.addPoint(928, 668);
        polygon.addPoint(925, 679);
        polygon.addPoint(918, 685);
        polygon.addPoint(919, 689);
        polygon.addPoint(926, 696);
        polygon.addPoint(934, 733);
        polygon.addPoint(904, 734);
        polygon.addPoint(892, 717);
        polygon.addPoint(884, 694);
        polygon.addPoint(877, 692);
        polygon.addPoint(877, 686);
        polygon.addPoint(886, 681);
        polygon.addPoint(886, 661);
        polygon.addPoint(880, 663);
        polygon.addPoint(880, 617);
        polygon.addPoint(880, 548);
        polygon.addPoint(897, 562);
        polygon.addPoint(903, 562);
        polygon.addPoint(904, 556);
        polygon.addPoint(910, 562);
        polygon.addPoint(927, 562);
        polygon.addPoint(931, 567);
        polygon.addPoint(950, 571);
        polygon.addPoint(947, 586);
        polygon.addPoint(954, 586);
        polygon.addPoint(969, 576);
        polygon.addPoint(972, 580);
        polygon.addPoint(958, 592);
        polygon.addPoint(966, 600);
        polygon.addPoint(972, 603);
        polygon.addPoint(972, 610);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {
        connectedTerritories.add(Constants.territoriesArrayList.get(36));   //peru
        connectedTerritories.add(Constants.territoriesArrayList.get(34));   //brazil
    }

    @Override
    public Polygon getPolygon() {
        return polygon;
    }

    @Override
    public void setContinent() {
        homeContinent = Constants.continentArrayList.get(5);
    }
}
