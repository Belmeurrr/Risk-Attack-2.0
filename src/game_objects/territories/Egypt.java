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

public class Egypt extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(1361, 465);
        polygon.addPoint(1343, 441);
        polygon.addPoint(1352, 440);
        polygon.addPoint(1338, 421);
        polygon.addPoint(1327, 427);
        polygon.addPoint(1304, 421);
        polygon.addPoint(1305, 417);
        polygon.addPoint(1295, 415);
        polygon.addPoint(1285, 419);
        polygon.addPoint(1289, 428);
        polygon.addPoint(1285, 428);
        polygon.addPoint(1272, 423);
        polygon.addPoint(1272, 419);
        polygon.addPoint(1250, 413);
        polygon.addPoint(1236, 427);
        polygon.addPoint(1246, 456);
        polygon.addPoint(1271, 467);
        polygon.addPoint(1291, 477);
        polygon.addPoint(1298, 487);
        polygon.addPoint(1314, 464);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {
        connectedTerritories.add(Constants.territoriesArrayList.get(31));   //NA
        connectedTerritories.add(Constants.territoriesArrayList.get(29));   //EA
        connectedTerritories.add(Constants.territoriesArrayList.get(27));   //Middle East
        connectedTerritories.add(Constants.territoriesArrayList.get(13));   //SE
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
