package game_objects.territories;
/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 7/13/2019 2019 @ 9:52 PM
 */

import game_objects.Constants;
import game_objects.continents.Africa;
import game_objects.continents.NorthAmerica;

import java.awt.*;
import java.util.ArrayList;

public class SouthAfrica extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(1321, 625);
        polygon.addPoint(1327, 625);
        polygon.addPoint(1327, 617);
        polygon.addPoint(1324, 614);
        polygon.addPoint(1325, 611);
        polygon.addPoint(1333, 606);
        polygon.addPoint(1344, 620);
        polygon.addPoint(1344, 639);
        polygon.addPoint(1352, 643);
        polygon.addPoint(1355, 643);
        polygon.addPoint(1357, 623);
        polygon.addPoint(1377, 615);
        polygon.addPoint(1383, 621);
        polygon.addPoint(1384, 631);
        polygon.addPoint(1383, 643);
        polygon.addPoint(1373, 653);
        polygon.addPoint(1352, 665);
        polygon.addPoint(1355, 685);
        polygon.addPoint(1342, 693);
        polygon.addPoint(1341, 703);
        polygon.addPoint(1306, 731);
        polygon.addPoint(1273, 735);
        polygon.addPoint(1267, 726);
        polygon.addPoint(1269, 719);
        polygon.addPoint(1256, 698);
        polygon.addPoint(1253, 668);
        polygon.addPoint(1244, 652);
        polygon.addPoint(1243, 641);
        polygon.addPoint(1253, 623);
        polygon.addPoint(1244, 593);
        polygon.addPoint(1267, 594);
        polygon.addPoint(1272, 599);
        polygon.addPoint(1291, 602);
        polygon.addPoint(1295, 615);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {

        connectedTerritories.add(Constants.territoriesArrayList.get(28));   //Madagascar
        connectedTerritories.add(Constants.territoriesArrayList.get(33));   //Congo
        connectedTerritories.add(Constants.territoriesArrayList.get(29));   //East Africa

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
