package game_objects.territories;
/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 7/13/2019 2019 @ 9:52 PM
 */

import game_objects.Constants;
import game_objects.continents.Asia;
import game_objects.continents.Europe;

import java.awt.*;
import java.util.ArrayList;


public class GreatBritain extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(1120, 191);
        polygon.addPoint(1121, 189);
        polygon.addPoint(1127, 189);
        polygon.addPoint(1125, 199);
        polygon.addPoint(1122, 202);
        polygon.addPoint(1133, 200);
        polygon.addPoint(1137, 204);
        polygon.addPoint(1137, 212);
        polygon.addPoint(1129, 219);
        polygon.addPoint(1138, 223);
        polygon.addPoint(1136, 230);
        polygon.addPoint(1144, 238);
        polygon.addPoint(1150, 247);
        polygon.addPoint(1163, 253);
        polygon.addPoint(1167, 256);
        polygon.addPoint(1164, 264);
        polygon.addPoint(1161, 267);
        polygon.addPoint(1165, 268);
        polygon.addPoint(1165, 274);
        polygon.addPoint(1154, 279);
        polygon.addPoint(1136, 279);
        polygon.addPoint(1121, 282);
        polygon.addPoint(1120, 287);
        polygon.addPoint(1117, 287);
        polygon.addPoint(1110, 285);
        polygon.addPoint(1106, 289);
        polygon.addPoint(1099, 290);
        polygon.addPoint(1096, 287);
        polygon.addPoint(1104, 282);
        polygon.addPoint(1103, 280);
        polygon.addPoint(1119, 274);
        polygon.addPoint(1111, 271);
        polygon.addPoint(1107, 272);
        polygon.addPoint(1104, 273);
        polygon.addPoint(1101, 266);
        polygon.addPoint(1107, 252);
        polygon.addPoint(1100, 256);
        polygon.addPoint(1099, 272);
        polygon.addPoint(1091, 281);
        polygon.addPoint(1091, 286);
        polygon.addPoint(1087, 286);
        polygon.addPoint(1084, 283);
        polygon.addPoint(1062, 283);
        polygon.addPoint(1056, 276);
        polygon.addPoint(1058, 269);
        polygon.addPoint(1063, 268);
        polygon.addPoint(1069, 257);
        polygon.addPoint(1081, 239);
        polygon.addPoint(1087, 230);
        polygon.addPoint(1104, 235);
        polygon.addPoint(1107, 230);
        polygon.addPoint(1108, 223);
        polygon.addPoint(1104, 228);
        polygon.addPoint(1098, 227);
        polygon.addPoint(1100, 221);
        polygon.addPoint(1102, 219);
        polygon.addPoint(1099, 216);
        polygon.addPoint(1104, 196);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {
        connectedTerritories.add(Constants.territoriesArrayList.get(9));   //Iceland
        connectedTerritories.add(Constants.territoriesArrayList.get(10));   //Scandenavia
        connectedTerritories.add(Constants.territoriesArrayList.get(12));   //NE
        connectedTerritories.add(Constants.territoriesArrayList.get(13));   //SE
    }

    @Override
    public Polygon getPolygon() {
        return polygon;
    }

    @Override
    public void setContinent() {
        homeContinent = Constants.continentArrayList.get(3);
    }
}
