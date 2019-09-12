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

public class Peru extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(878, 542);
        polygon.addPoint(881, 549);
        polygon.addPoint(890, 552);
        polygon.addPoint(902, 562);
        polygon.addPoint(904, 556);
        polygon.addPoint(911, 559);
        polygon.addPoint(917, 559);
        polygon.addPoint(929, 562);
        polygon.addPoint(950, 572);
        polygon.addPoint(948, 582);
        polygon.addPoint(968, 576);
        polygon.addPoint(964, 562);
        polygon.addPoint(953, 558);
        polygon.addPoint(950, 550);
        polygon.addPoint(952, 549);
        polygon.addPoint(947, 537);
        polygon.addPoint(935, 522);
        polygon.addPoint(916, 517);
        polygon.addPoint(907, 507);
        polygon.addPoint(876, 512);
        polygon.addPoint(871, 510);
        polygon.addPoint(875, 501);
        polygon.addPoint(872, 501);
        polygon.addPoint(851, 491);
        polygon.addPoint(864, 474);
        polygon.addPoint(871, 472);
        polygon.addPoint(871, 470);
        polygon.addPoint(861, 468);
        polygon.addPoint(857, 469);
        polygon.addPoint(852, 466);
        polygon.addPoint(838, 461);
        polygon.addPoint(830, 451);
        polygon.addPoint(820, 456);
        polygon.addPoint(817, 471);
        polygon.addPoint(812, 478);
        polygon.addPoint(813, 489);
        polygon.addPoint(822, 495);
        polygon.addPoint(844, 525);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {

        connectedTerritories.add(Constants.territoriesArrayList.get(37));    //Venezuela
        connectedTerritories.add(Constants.territoriesArrayList.get(34));   //Brazil
        connectedTerritories.add(Constants.territoriesArrayList.get(35));   //Argentina

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
