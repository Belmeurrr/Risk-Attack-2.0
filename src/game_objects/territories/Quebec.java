package game_objects.territories;
/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 7/13/2019 2019 @ 9:52 PM
 */

import game_objects.Constants;
import game_objects.continents.NorthAmerica;

import java.awt.*;
import java.util.ArrayList;

public class Quebec extends Territory {



    /*private String name;*/

    public Quebec() {
        /*name = getClass().getSimpleName();*/

    }

    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(906, 244);
        polygon.addPoint(904, 214);
        polygon.addPoint(910, 207);
        polygon.addPoint(911, 188);
        polygon.addPoint(919, 187);
        polygon.addPoint(924, 179);
        polygon.addPoint(920, 165);
        polygon.addPoint(928, 159);
        polygon.addPoint(935, 144);
        polygon.addPoint(936, 146);
        polygon.addPoint(946, 145);
        polygon.addPoint(951, 146);
        polygon.addPoint(958, 151);
        polygon.addPoint(961, 157);
        polygon.addPoint(956, 165);
        polygon.addPoint(962, 171);
        polygon.addPoint(970, 169);
        polygon.addPoint(971, 162);
        polygon.addPoint(981, 160);
        polygon.addPoint(979, 170);
        polygon.addPoint(986, 175);
        polygon.addPoint(988, 185);
        polygon.addPoint(998, 189);
        polygon.addPoint(1000, 196);
        polygon.addPoint(1006, 198);
        polygon.addPoint(1009, 201);
        polygon.addPoint(1008, 210);
        polygon.addPoint(989, 220);
        polygon.addPoint(971, 223);
        polygon.addPoint(952, 227);
        polygon.addPoint(965, 224);
        polygon.addPoint(972, 242);
        polygon.addPoint(980, 241);
        polygon.addPoint(974, 256);
        polygon.addPoint(971, 263);
        polygon.addPoint(958, 264);
        polygon.addPoint(959, 255);
        polygon.addPoint(960, 248);
        polygon.addPoint(958, 241);
        polygon.addPoint(941, 245);
        polygon.addPoint(926, 247);
        polygon.addPoint(920, 243);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {

        connectedTerritories.add(Constants.territoriesArrayList.get(8));   //Greenland
        connectedTerritories.add(Constants.territoriesArrayList.get(5));   //Ontario
        connectedTerritories.add(Constants.territoriesArrayList.get(6));   //EUS
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
