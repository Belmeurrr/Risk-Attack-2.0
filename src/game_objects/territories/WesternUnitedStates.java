package game_objects.territories;/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 7/21/2019 2019 @ 10:24 PM
 */

import game_objects.Constants;
import game_objects.continents.NorthAmerica;

import java.awt.*;
import java.util.ArrayList;

public class WesternUnitedStates extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {
        polygon.addPoint(846, 226);
        polygon.addPoint(844, 278);
        polygon.addPoint(842, 282);
        polygon.addPoint(824, 284);
        polygon.addPoint(819, 295);
        polygon.addPoint(812, 298);
        polygon.addPoint(806, 313);
        polygon.addPoint(799, 317);
        polygon.addPoint(801, 322);
        polygon.addPoint(800, 329);
        polygon.addPoint(792, 329);
        polygon.addPoint(785, 324);
        polygon.addPoint(780, 322);
        polygon.addPoint(760, 321);
        polygon.addPoint(753, 313);
        polygon.addPoint(732, 308);
        polygon.addPoint(722, 290);
        polygon.addPoint(720, 275);
        polygon.addPoint(728, 233);
        polygon.addPoint(733, 233);
        polygon.addPoint(730, 225);
    }

    @Override
    public void setConnectedTerritories() {

        connectedTerritories.add(Constants.territoriesArrayList.get(1));   //Alberta
        connectedTerritories.add(Constants.territoriesArrayList.get(5));   //Ontario
        connectedTerritories.add(Constants.territoriesArrayList.get(6));   //EUS
        connectedTerritories.add(Constants.territoriesArrayList.get(4));   //CA

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
