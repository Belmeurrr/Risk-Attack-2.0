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

public class Brazil extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(994, 452);
        polygon.addPoint(990, 461);
        polygon.addPoint(1023, 464);
        polygon.addPoint(1023, 470);
        polygon.addPoint(1058, 478);
        polygon.addPoint(1074, 495);
        polygon.addPoint(1049, 513);
        polygon.addPoint(1047, 533);
        polygon.addPoint(1042, 539);
        polygon.addPoint(1029, 559);
        polygon.addPoint(1013, 562);
        polygon.addPoint(1001, 574);
        polygon.addPoint(999, 586);
        polygon.addPoint(979, 610);
        polygon.addPoint(974, 610);
        polygon.addPoint(974, 603);
        polygon.addPoint(969, 603);
        polygon.addPoint(966, 596);
        polygon.addPoint(958, 595);
        polygon.addPoint(965, 590);
        polygon.addPoint(972, 580);
        polygon.addPoint(964, 562);
        polygon.addPoint(953, 557);
        polygon.addPoint(950, 550);
        polygon.addPoint(953, 548);
        polygon.addPoint(947, 534);
        polygon.addPoint(941, 532);
        polygon.addPoint(941, 529);
        polygon.addPoint(937, 523);
        polygon.addPoint(932, 519);
        polygon.addPoint(918, 517);
        polygon.addPoint(905, 504);
        polygon.addPoint(880, 511);
        polygon.addPoint(872, 510);
        polygon.addPoint(877, 501);
        polygon.addPoint(870, 499);
        polygon.addPoint(869, 502);
        polygon.addPoint(851, 490);
        polygon.addPoint(858, 484);
        polygon.addPoint(862, 478);
        polygon.addPoint(869, 473);
        polygon.addPoint(880, 473);
        polygon.addPoint(883, 468);
        polygon.addPoint(881, 460);
        polygon.addPoint(881, 456);
        polygon.addPoint(888, 453);
        polygon.addPoint(899, 457);
        polygon.addPoint(907, 454);
        polygon.addPoint(909, 444);
        polygon.addPoint(917, 444);
        polygon.addPoint(932, 440);
        polygon.addPoint(932, 447);
        polygon.addPoint(938, 452);
        polygon.addPoint(975, 448);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {
        connectedTerritories.add(Constants.territoriesArrayList.get(36));   //peru
        connectedTerritories.add(Constants.territoriesArrayList.get(35));   //argentina
        connectedTerritories.add(Constants.territoriesArrayList.get(37));   //venezual
        connectedTerritories.add(Constants.territoriesArrayList.get(31));   //Northafrica
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
