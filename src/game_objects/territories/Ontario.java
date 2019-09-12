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

public class Ontario extends Territory {



    /*private String name;*/

    public Ontario() {
        /*name = getClass().getSimpleName();*/

    }

    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(828, 152);
        polygon.addPoint(862, 155);
        polygon.addPoint(859, 163);
        polygon.addPoint(869, 180);
        polygon.addPoint(879, 185);
        polygon.addPoint(885, 188);
        polygon.addPoint(890, 189);
        polygon.addPoint(898, 191);
        polygon.addPoint(902, 193);
        polygon.addPoint(899, 200);
        polygon.addPoint(905, 210);
        polygon.addPoint(905, 242);
        polygon.addPoint(899, 243);
        polygon.addPoint(891, 239);
        polygon.addPoint(865, 229);
        polygon.addPoint(861, 227);
        polygon.addPoint(822, 224);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {

        connectedTerritories.add(Constants.territoriesArrayList.get(2));   //NWT
        connectedTerritories.add(Constants.territoriesArrayList.get(1));   //Alberta
        connectedTerritories.add(Constants.territoriesArrayList.get(3));   //WUS
        connectedTerritories.add(Constants.territoriesArrayList.get(6));   //EUS
        connectedTerritories.add(Constants.territoriesArrayList.get(7));   //Quebec
        connectedTerritories.add(Constants.territoriesArrayList.get(8));   //Greenland

    }

    @Override
    public Polygon getPolygon() {
        return polygon;
    }

    @Override
    public void setContinent() {
        homeContinent = Constants.continentArrayList.get(4);
    }

}
