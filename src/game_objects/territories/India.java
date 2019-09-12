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

public class India extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(1607, 420);
        polygon.addPoint(1594, 429);
        polygon.addPoint(1566, 508);
        polygon.addPoint(1555, 511);
        polygon.addPoint(1527, 460);
        polygon.addPoint(1526, 438);
        polygon.addPoint(1499, 409);
        polygon.addPoint(1488, 410);
        polygon.addPoint(1488, 402);
        polygon.addPoint(1484, 400);
        polygon.addPoint(1476, 373);
        polygon.addPoint(1474, 353);
        polygon.addPoint(1482, 353);
        polygon.addPoint(1488, 341);
        polygon.addPoint(1499, 341);
        polygon.addPoint(1501, 333);
        polygon.addPoint(1511, 334);
        polygon.addPoint(1519, 340);
        polygon.addPoint(1534, 329);
        polygon.addPoint(1540, 334);
        polygon.addPoint(1554, 338);
        polygon.addPoint(1554, 350);
        polygon.addPoint(1551, 358);
        polygon.addPoint(1574, 370);
        polygon.addPoint(1583, 372);
        polygon.addPoint(1596, 377);
        polygon.addPoint(1621, 380);
        polygon.addPoint(1625, 390);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {
        connectedTerritories.add(Constants.territoriesArrayList.get(23));   //China
        connectedTerritories.add(Constants.territoriesArrayList.get(24));   //Siam
        connectedTerritories.add(Constants.territoriesArrayList.get(27));   //ME
        connectedTerritories.add(Constants.territoriesArrayList.get(26));   //Afghanistan

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
