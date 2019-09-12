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

public class Iceland extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(1123, 141);
        polygon.addPoint(1129, 149);
        polygon.addPoint(1133, 146);
        polygon.addPoint(1138, 146);
        polygon.addPoint(1145, 142);
        polygon.addPoint(1148, 142);
        polygon.addPoint(1157, 141);
        polygon.addPoint(1157, 139);
        polygon.addPoint(1166, 138);
        polygon.addPoint(1172, 143);
        polygon.addPoint(1177, 149);
        polygon.addPoint(1182, 153);
        polygon.addPoint(1184, 162);
        polygon.addPoint(1176, 165);
        polygon.addPoint(1176, 171);
        polygon.addPoint(1159, 176);
        polygon.addPoint(1147, 184);
        polygon.addPoint(1124, 180);
        polygon.addPoint(1116, 180);
        polygon.addPoint(1114, 173);
        polygon.addPoint(1119, 170);
        polygon.addPoint(1118, 166);
        polygon.addPoint(1108, 166);
        polygon.addPoint(1106, 152);
        polygon.addPoint(1113, 140);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {
        connectedTerritories.add(Constants.territoriesArrayList.get(8));   //Greenland
        connectedTerritories.add(Constants.territoriesArrayList.get(10));   //Scandenavia
        connectedTerritories.add(Constants.territoriesArrayList.get(15));   //Great Britian

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
