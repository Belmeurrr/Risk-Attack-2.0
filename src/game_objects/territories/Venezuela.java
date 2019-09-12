package game_objects.territories;
/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 7/13/2019 2019 @ 9:52 PM
 */

import game_objects.Constants;
import game_objects.continents.NorthAmerica;
import game_objects.continents.SouthAmerica;

import java.awt.*;
import java.util.ArrayList;

public class Venezuela extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(966, 435);
        polygon.addPoint(975, 447);
        polygon.addPoint(938, 452);
        polygon.addPoint(933, 448);
        polygon.addPoint(932, 438);
        polygon.addPoint(918, 444);
        polygon.addPoint(909, 442);
        polygon.addPoint(907, 452);
        polygon.addPoint(900, 456);
        polygon.addPoint(889, 450);
        polygon.addPoint(879, 455);
        polygon.addPoint(883, 467);
        polygon.addPoint(877, 472);
        polygon.addPoint(871, 473);
        polygon.addPoint(871, 469);
        polygon.addPoint(857, 466);
        polygon.addPoint(852, 463);
        polygon.addPoint(836, 460);
        polygon.addPoint(831, 449);
        polygon.addPoint(834, 446);
        polygon.addPoint(834, 428);
        polygon.addPoint(849, 419);
        polygon.addPoint(871, 402);
        polygon.addPoint(880, 404);
        polygon.addPoint(889, 409);
        polygon.addPoint(892, 413);
        polygon.addPoint(917, 410);
        polygon.addPoint(924, 418);
        polygon.addPoint(931, 419);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {

        connectedTerritories.add(Constants.territoriesArrayList.get(4));   //CA
        connectedTerritories.add(Constants.territoriesArrayList.get(36));   //Peru
        connectedTerritories.add(Constants.territoriesArrayList.get(34));   //Brazil

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
