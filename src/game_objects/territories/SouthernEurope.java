package game_objects.territories;
/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 7/13/2019 2019 @ 9:52 PM
 */

import game_objects.Constants;
import game_objects.continents.Europe;
import game_objects.continents.NorthAmerica;

import java.awt.*;
import java.util.ArrayList;

public class SouthernEurope extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(1205, 302);
        polygon.addPoint(1195, 308);
        polygon.addPoint(1195, 317);
        polygon.addPoint(1190, 321);
        polygon.addPoint(1196, 326);
        polygon.addPoint(1193, 331);
        polygon.addPoint(1196, 341);
        polygon.addPoint(1203, 340);
        polygon.addPoint(1213, 354);
        polygon.addPoint(1218, 359);
        polygon.addPoint(1220, 368);
        polygon.addPoint(1218, 374);
        polygon.addPoint(1201, 373);
        polygon.addPoint(1199, 379);
        polygon.addPoint(1223, 384);
        polygon.addPoint(1228, 381);
        polygon.addPoint(1236, 377);
        polygon.addPoint(1240, 370);
        polygon.addPoint(1236, 365);
        polygon.addPoint(1249, 366);
        polygon.addPoint(1252, 363);
        polygon.addPoint(1244, 353);
        polygon.addPoint(1239, 348);
        polygon.addPoint(1230, 340);
        polygon.addPoint(1233, 338);
        polygon.addPoint(1241, 343);
        polygon.addPoint(1250, 346);
        polygon.addPoint(1253, 356);
        polygon.addPoint(1259, 362);
        polygon.addPoint(1264, 381);
        polygon.addPoint(1270, 386);
        polygon.addPoint(1284, 389);
        polygon.addPoint(1285, 385);
        polygon.addPoint(1281, 380);
        polygon.addPoint(1280, 365);
        polygon.addPoint(1289, 363);
        polygon.addPoint(1297, 338);
        polygon.addPoint(1303, 332);
        polygon.addPoint(1310, 324);
        polygon.addPoint(1303, 319);
        polygon.addPoint(1299, 296);
        polygon.addPoint(1293, 288);
        polygon.addPoint(1290, 282);
        polygon.addPoint(1285, 281);
        polygon.addPoint(1284, 286);
        polygon.addPoint(1274, 290);
        polygon.addPoint(1271, 309);
        polygon.addPoint(1251, 307);
        polygon.addPoint(1253, 292);
        polygon.addPoint(1235, 292);
        polygon.addPoint(1233, 300);
        polygon.addPoint(1213, 306);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {

        connectedTerritories.add(Constants.territoriesArrayList.get(14));   //WE
        connectedTerritories.add(Constants.territoriesArrayList.get(12));   //NE
        connectedTerritories.add(Constants.territoriesArrayList.get(11));   //Ukraine
        connectedTerritories.add(Constants.territoriesArrayList.get(30));   //Egypt
        connectedTerritories.add(Constants.territoriesArrayList.get(31));   //NA

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
