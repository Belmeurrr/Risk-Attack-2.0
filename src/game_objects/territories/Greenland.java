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

public class Greenland extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(1052, 28);
        polygon.addPoint(1070, 32);
        polygon.addPoint(1083, 34);
        polygon.addPoint(1084, 35);
        polygon.addPoint(1092, 35);
        polygon.addPoint(1089, 42);
        polygon.addPoint(1115, 44);
        polygon.addPoint(1106, 50);
        polygon.addPoint(1100, 63);
        polygon.addPoint(1105, 66);
        polygon.addPoint(1104, 75);
        polygon.addPoint(1109, 78);
        polygon.addPoint(1109, 82);
        polygon.addPoint(1104, 87);
        polygon.addPoint(1104, 92);
        polygon.addPoint(1101, 105);
        polygon.addPoint(1093, 110);
        polygon.addPoint(1082, 119);
        polygon.addPoint(1064, 125);
        polygon.addPoint(1051, 135);
        polygon.addPoint(1035, 138);
        polygon.addPoint(1035, 148);
        polygon.addPoint(1028, 157);
        polygon.addPoint(1028, 168);
        polygon.addPoint(1022, 174);
        polygon.addPoint(1009, 168);
        polygon.addPoint(993, 148);
        polygon.addPoint(995, 143);
        polygon.addPoint(991, 139);
        polygon.addPoint(992, 131);
        polygon.addPoint(995, 129);
        polygon.addPoint(997, 123);
        polygon.addPoint(991, 122);
        polygon.addPoint(990, 117);
        polygon.addPoint(994, 116);
        polygon.addPoint(989, 108);
        polygon.addPoint(982, 97);
        polygon.addPoint(967, 86);
        polygon.addPoint(940, 88);
        polygon.addPoint(938, 80);
        polygon.addPoint(941, 72);
        polygon.addPoint(954, 69);
        polygon.addPoint(954, 61);
        polygon.addPoint(966, 58);
        polygon.addPoint(996, 47);
        polygon.addPoint(999, 48);
        polygon.addPoint(1015, 42);
        polygon.addPoint(1015, 36);
        polygon.addPoint(1022, 33);
        polygon.addPoint(1025, 34);
        polygon.addPoint(1031, 31);
        polygon.addPoint(1031, 27);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {
        connectedTerritories.add(Constants.territoriesArrayList.get(2));   //NWT
        connectedTerritories.add(Constants.territoriesArrayList.get(5));   //Ontario
        connectedTerritories.add(Constants.territoriesArrayList.get(7));   //Quebec
        connectedTerritories.add(Constants.territoriesArrayList.get(9));   //Iceland

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
