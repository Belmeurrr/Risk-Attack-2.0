package game_objects.territories;
/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 7/13/2019 2019 @ 9:52 PM
 */

import game_objects.Constants;
import game_objects.continents.Africa;
import game_objects.continents.Asia;

import java.awt.*;
import java.util.ArrayList;

public class NorthAfrica extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(1157, 404);
        polygon.addPoint(1172, 397);
        polygon.addPoint(1181, 390);
        polygon.addPoint(1189, 397);
        polygon.addPoint(1206, 389);
        polygon.addPoint(1224, 391);
        polygon.addPoint(1232, 397);
        polygon.addPoint(1252, 394);
        polygon.addPoint(1256, 405);
        polygon.addPoint(1235, 427);
        polygon.addPoint(1246, 459);
        polygon.addPoint(1269, 463);
        polygon.addPoint(1292, 479);
        polygon.addPoint(1299, 492);
        polygon.addPoint(1296, 505);
        polygon.addPoint(1293, 507);
        polygon.addPoint(1297, 521);
        polygon.addPoint(1271, 535);
        polygon.addPoint(1270, 555);
        polygon.addPoint(1238, 564);
        polygon.addPoint(1239, 551);
        polygon.addPoint(1216, 549);
        polygon.addPoint(1211, 538);
        polygon.addPoint(1178, 543);
        polygon.addPoint(1164, 539);
        polygon.addPoint(1147, 544);
        polygon.addPoint(1137, 540);
        polygon.addPoint(1122, 527);
        polygon.addPoint(1106, 506);
        polygon.addPoint(1110, 479);
        polygon.addPoint(1107, 457);
        polygon.addPoint(1126, 429);
        polygon.addPoint(1131, 428);
        polygon.addPoint(1139, 404);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {
        connectedTerritories.add(Constants.territoriesArrayList.get(34));   //Brazil
        connectedTerritories.add(Constants.territoriesArrayList.get(14));   //WE
        connectedTerritories.add(Constants.territoriesArrayList.get(30));   //Egypt
        connectedTerritories.add(Constants.territoriesArrayList.get(13));   //SE
        connectedTerritories.add(Constants.territoriesArrayList.get(29));   //EA
        connectedTerritories.add(Constants.territoriesArrayList.get(33));   //Congo


    }

    @Override
    public Polygon getPolygon() {
        return polygon;
    }

    @Override
    public void setContinent() {
        homeContinent = Constants.continentArrayList.get(0/*Constants.continentArrayList.indexOf()*/);
    }
}
