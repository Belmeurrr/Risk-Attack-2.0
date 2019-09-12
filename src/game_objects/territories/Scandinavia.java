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

public class Scandinavia extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(1241, 122);
        polygon.addPoint(1238, 118);
        polygon.addPoint(1243, 112);
        polygon.addPoint(1247, 111);
        polygon.addPoint(1253, 115);
        polygon.addPoint(1256, 110);
        polygon.addPoint(1264, 111);
        polygon.addPoint(1264, 107);
        polygon.addPoint(1272, 102);
        polygon.addPoint(1278, 101);
        polygon.addPoint(1280, 99);
        polygon.addPoint(1288, 100);
        polygon.addPoint(1299, 100);
        polygon.addPoint(1309, 104);
        polygon.addPoint(1312, 105);
        polygon.addPoint(1306, 108);
        polygon.addPoint(1305, 138);
        polygon.addPoint(1306, 159);
        polygon.addPoint(1310, 168);
        polygon.addPoint(1301, 177);
        polygon.addPoint(1294, 176);
        polygon.addPoint(1291, 179);
        polygon.addPoint(1277, 178);
        polygon.addPoint(1269, 168);
        polygon.addPoint(1271, 163);
        polygon.addPoint(1276, 162);
        polygon.addPoint(1277, 155);
        polygon.addPoint(1274, 151);
        polygon.addPoint(1268, 161);
        polygon.addPoint(1264, 168);
        polygon.addPoint(1261, 171);
        polygon.addPoint(1266, 179);
        polygon.addPoint(1266, 185);
        polygon.addPoint(1260, 191);
        polygon.addPoint(1253, 198);
        polygon.addPoint(1251, 208);
        polygon.addPoint(1248, 214);
        polygon.addPoint(1233, 214);
        polygon.addPoint(1223, 194);
        polygon.addPoint(1208, 201);
        polygon.addPoint(1202, 197);
        polygon.addPoint(1193, 171);
        polygon.addPoint(1202, 156);
        polygon.addPoint(1207, 156);
        polygon.addPoint(1215, 148);
        polygon.addPoint(1220, 148);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {

        connectedTerritories.add(Constants.territoriesArrayList.get(9));   //Iceland
        connectedTerritories.add(Constants.territoriesArrayList.get(15));   //Great BRitain
        connectedTerritories.add(Constants.territoriesArrayList.get(12));   //Northern Euprope
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
