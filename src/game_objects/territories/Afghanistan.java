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

public
class Afghanistan extends Territory {


    @Override
    public void setReigon() {

        polygon.addPoint(1511, 257);
        polygon.addPoint(1533, 260);
        polygon.addPoint(1543, 270);
        polygon.addPoint(1541, 276);
        polygon.addPoint(1543, 285);
        polygon.addPoint(1541, 293);
        polygon.addPoint(1537, 294);
        polygon.addPoint(1523, 303);
        polygon.addPoint(1521, 317);
        polygon.addPoint(1529, 322);
        polygon.addPoint(1531, 329);
        polygon.addPoint(1520, 338);
        polygon.addPoint(1511, 333);
        polygon.addPoint(1501, 332);
        polygon.addPoint(1499, 337);
        polygon.addPoint(1487, 340);
        polygon.addPoint(1483, 348);
        polygon.addPoint(1474, 352);
        polygon.addPoint(1454, 339);
        polygon.addPoint(1443, 341);
        polygon.addPoint(1434, 325);
        polygon.addPoint(1429, 313);
        polygon.addPoint(1420, 289);
        polygon.addPoint(1428, 287);
        polygon.addPoint(1426, 275);
        polygon.addPoint(1416, 278);
        polygon.addPoint(1417, 284);
        polygon.addPoint(1399, 265);
        polygon.addPoint(1402, 244);
        polygon.addPoint(1434, 235);
        polygon.addPoint(1434, 232);
        polygon.addPoint(1455, 235);
        polygon.addPoint(1469, 227);
        //System.out.println("Polygon Created");
    }

    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setConnectedTerritories() {
        connectedTerritories.add(Constants.territoriesArrayList.get(17));   //ural
        connectedTerritories.add(Constants.territoriesArrayList.get(23));   //china
        connectedTerritories.add(Constants.territoriesArrayList.get(27));   //middle east
        connectedTerritories.add(Constants.territoriesArrayList.get(25));   //india
        connectedTerritories.add(Constants.territoriesArrayList.get(11));   //ukraine

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
