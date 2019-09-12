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

public class Ukraine extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(1313, 104);
        polygon.addPoint(1355, 110);
        polygon.addPoint(1360, 113);
        polygon.addPoint(1361, 124);
        polygon.addPoint(1323, 127);
        polygon.addPoint(1338, 135);
        polygon.addPoint(1337, 144);
        polygon.addPoint(1345, 143);
        polygon.addPoint(1341, 134);
        polygon.addPoint(1343, 131);
        polygon.addPoint(1348, 132);
        polygon.addPoint(1356, 138);
        polygon.addPoint(1358, 132);
        polygon.addPoint(1366, 122);
        polygon.addPoint(1369, 110);
        polygon.addPoint(1373, 108);
        polygon.addPoint(1383, 116);
        polygon.addPoint(1389, 117);
        polygon.addPoint(1414, 103);
        polygon.addPoint(1424, 105);
        polygon.addPoint(1432, 106);
        polygon.addPoint(1434, 101);
        polygon.addPoint(1465, 107);
        polygon.addPoint(1465, 124);
        polygon.addPoint(1455, 136);
        polygon.addPoint(1455, 152);
        polygon.addPoint(1455, 174);
        polygon.addPoint(1454, 189);
        polygon.addPoint(1456, 196);
        polygon.addPoint(1462, 196);
        polygon.addPoint(1464, 205);
        polygon.addPoint(1461, 209);
        polygon.addPoint(1464, 222);
        polygon.addPoint(1454, 228);
        polygon.addPoint(1451, 232);
        polygon.addPoint(1430, 231);
        polygon.addPoint(1433, 235);
        polygon.addPoint(1416, 237);
        polygon.addPoint(1411, 240);
        polygon.addPoint(1405, 238);
        polygon.addPoint(1400, 242);
        polygon.addPoint(1400, 250);
        polygon.addPoint(1398, 265);
        polygon.addPoint(1406, 285);
        polygon.addPoint(1401, 294);
        polygon.addPoint(1403, 301);
        polygon.addPoint(1418, 321);
        polygon.addPoint(1415, 326);
        polygon.addPoint(1415, 336);
        polygon.addPoint(1408, 339);
        polygon.addPoint(1385, 345);
        polygon.addPoint(1367, 328);
        polygon.addPoint(1367, 325);
        polygon.addPoint(1357, 325);
        polygon.addPoint(1354, 317);
        polygon.addPoint(1352, 311);
        polygon.addPoint(1341, 310);
        polygon.addPoint(1347, 315);
        polygon.addPoint(1337, 321);
        polygon.addPoint(1328, 318);
        polygon.addPoint(1326, 315);
        polygon.addPoint(1319, 310);
        polygon.addPoint(1313, 314);
        polygon.addPoint(1310, 320);
        polygon.addPoint(1303, 317);
        polygon.addPoint(1299, 293);
        polygon.addPoint(1296, 288);
        polygon.addPoint(1294, 287);
        polygon.addPoint(1291, 280);
        polygon.addPoint(1285, 280);
        polygon.addPoint(1282, 282);
        polygon.addPoint(1280, 280);
        polygon.addPoint(1283, 273);
        polygon.addPoint(1289, 272);
        polygon.addPoint(1299, 253);
        polygon.addPoint(1293, 229);
        polygon.addPoint(1280, 223);
        polygon.addPoint(1273, 212);
        polygon.addPoint(1285, 196);
        polygon.addPoint(1285, 185);
        polygon.addPoint(1306, 184);
        polygon.addPoint(1311, 169);
        polygon.addPoint(1307, 162);
        polygon.addPoint(1307, 149);
        polygon.addPoint(1305, 123);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {

        connectedTerritories.add(Constants.territoriesArrayList.get(12));   //NE
        connectedTerritories.add(Constants.territoriesArrayList.get(10));   //Scandenavia
        connectedTerritories.add(Constants.territoriesArrayList.get(13));   //SE
        connectedTerritories.add(Constants.territoriesArrayList.get(17));   //Ural
        connectedTerritories.add(Constants.territoriesArrayList.get(26));   //Afghanistan
        connectedTerritories.add(Constants.territoriesArrayList.get(27));   //ME

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
