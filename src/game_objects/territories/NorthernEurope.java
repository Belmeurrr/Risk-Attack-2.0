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

public class NorthernEurope extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(1214, 236);
        polygon.addPoint(1211, 213);
        polygon.addPoint(1222, 204);
        polygon.addPoint(1226, 204);
        polygon.addPoint(1228, 223);
        polygon.addPoint(1238, 224);
        polygon.addPoint(1252, 221);
        polygon.addPoint(1269, 219);
        polygon.addPoint(1273, 223);
        polygon.addPoint(1279, 220);
        polygon.addPoint(1289, 227);
        polygon.addPoint(1297, 252);
        polygon.addPoint(1290, 268);
        polygon.addPoint(1283, 270);
        polygon.addPoint(1281, 284);
        polygon.addPoint(1272, 291);
        polygon.addPoint(1271, 309);
        polygon.addPoint(1251, 308);
        polygon.addPoint(1253, 297);
        polygon.addPoint(1256, 291);
        polygon.addPoint(1250, 289);
        polygon.addPoint(1233, 292);
        polygon.addPoint(1233, 299);
        polygon.addPoint(1213, 305);
        polygon.addPoint(1206, 302);
        polygon.addPoint(1192, 292);
        polygon.addPoint(1179, 280);
        polygon.addPoint(1188, 262);
        polygon.addPoint(1200, 251);
        polygon.addPoint(1207, 240);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {
        connectedTerritories.add(Constants.territoriesArrayList.get(15));    //Great Britian
        connectedTerritories.add(Constants.territoriesArrayList.get(10));   //Scandenavia
        connectedTerritories.add(Constants.territoriesArrayList.get(14));   //WE
        connectedTerritories.add(Constants.territoriesArrayList.get(13));   //SE
        connectedTerritories.add(Constants.territoriesArrayList.get(11));   //Ukraine

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
