package game_objects.territories;
/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 7/13/2019 2019 @ 9:52 PM
 */

import game_objects.Constants;
import game_objects.continents.Asia;
import game_objects.continents.NorthAmerica;

import java.awt.*;
import java.util.ArrayList;

public class Siam extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(1681, 414);
        polygon.addPoint(1682, 422);
        polygon.addPoint(1693, 428);
        polygon.addPoint(1702, 442);
        polygon.addPoint(1706, 449);
        polygon.addPoint(1707, 468);
        polygon.addPoint(1691, 484);
        polygon.addPoint(1687, 484);
        polygon.addPoint(1686, 477);
        polygon.addPoint(1669, 465);
        polygon.addPoint(1678, 495);
        polygon.addPoint(1668, 497);
        polygon.addPoint(1656, 490);
        polygon.addPoint(1649, 470);
        polygon.addPoint(1653, 459);
        polygon.addPoint(1640, 447);
        polygon.addPoint(1628, 447);
        polygon.addPoint(1606, 417);
        polygon.addPoint(1625, 389);
        polygon.addPoint(1633, 387);
        polygon.addPoint(1641, 394);
        polygon.addPoint(1651, 403);
        polygon.addPoint(1661, 406);
        polygon.addPoint(1662, 399);
        polygon.addPoint(1669, 399);
        polygon.addPoint(1672, 393);
        polygon.addPoint(1677, 394);
        polygon.addPoint(1692, 409);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {

        connectedTerritories.add(Constants.territoriesArrayList.get(23));   //China
        connectedTerritories.add(Constants.territoriesArrayList.get(25));   //India
        connectedTerritories.add(Constants.territoriesArrayList.get(39));   //Indonisia

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
