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

public class MiddleEast extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(1329, 341);
        polygon.addPoint(1351, 338);
        polygon.addPoint(1364, 347);
        polygon.addPoint(1416, 336);
        polygon.addPoint(1419, 344);
        polygon.addPoint(1443, 346);
        polygon.addPoint(1443, 339);
        polygon.addPoint(1451, 339);
        polygon.addPoint(1465, 348);
        polygon.addPoint(1474, 371);
        polygon.addPoint(1484, 399);
        polygon.addPoint(1488, 411);
        polygon.addPoint(1476, 421);
        polygon.addPoint(1482, 447);
        polygon.addPoint(1460, 486);
        polygon.addPoint(1438, 495);
        polygon.addPoint(1400, 499);
        polygon.addPoint(1381, 467);
        polygon.addPoint(1374, 461);
        polygon.addPoint(1364, 443);
        polygon.addPoint(1350, 439);
        polygon.addPoint(1339, 419);
        polygon.addPoint(1348, 410);
        polygon.addPoint(1347, 386);
        polygon.addPoint(1312, 383);
        polygon.addPoint(1294, 373);
        polygon.addPoint(1291, 360);
        polygon.addPoint(1300, 335);
        polygon.addPoint(1312, 344);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {
        connectedTerritories.add(Constants.territoriesArrayList.get(26));   //Afghanistan
        connectedTerritories.add(Constants.territoriesArrayList.get(25));   //India
        connectedTerritories.add(Constants.territoriesArrayList.get(30));   //Egypt
        connectedTerritories.add(Constants.territoriesArrayList.get(13));   //SE
        connectedTerritories.add(Constants.territoriesArrayList.get(11));   //Ukraine

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
