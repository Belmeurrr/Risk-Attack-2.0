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

public class EastAfrica extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(1432, 518);
        polygon.addPoint(1437, 529);
        polygon.addPoint(1430, 544);
        polygon.addPoint(1418, 565);
        polygon.addPoint(1397, 577);
        polygon.addPoint(1382, 605);
        polygon.addPoint(1378, 616);
        polygon.addPoint(1359, 621);
        polygon.addPoint(1355, 642);
        polygon.addPoint(1345, 638);
        polygon.addPoint(1345, 618);
        polygon.addPoint(1333, 604);
        polygon.addPoint(1330, 601);
        polygon.addPoint(1328, 588);
        polygon.addPoint(1351, 565);
        polygon.addPoint(1355, 555);
        polygon.addPoint(1322, 550);
        polygon.addPoint(1297, 519);
        polygon.addPoint(1294, 515);
        polygon.addPoint(1294, 508);
        polygon.addPoint(1299, 505);
        polygon.addPoint(1300, 488);
        polygon.addPoint(1298, 482);
        polygon.addPoint(1315, 466);
        polygon.addPoint(1356, 467);
        polygon.addPoint(1363, 472);
        polygon.addPoint(1367, 473);
        polygon.addPoint(1368, 478);
        polygon.addPoint(1366, 482);
        polygon.addPoint(1376, 491);
        polygon.addPoint(1378, 500);
        polygon.addPoint(1394, 511);
        polygon.addPoint(1400, 523);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {
        connectedTerritories.add(Constants.territoriesArrayList.get(30));   //Egypt
        connectedTerritories.add(Constants.territoriesArrayList.get(31));   //NA
        connectedTerritories.add(Constants.territoriesArrayList.get(33));   //Congo
        connectedTerritories.add(Constants.territoriesArrayList.get(32));   //SA
        connectedTerritories.add(Constants.territoriesArrayList.get(28));   //Madagascar

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
