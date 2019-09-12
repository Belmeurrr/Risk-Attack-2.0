package game_objects.territories;
/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 7/13/2019 2019 @ 9:52 PM
 */

import game_objects.Constants;
import game_objects.continents.Asia;
import game_objects.continents.Australia;

import java.awt.*;
import java.util.ArrayList;

public class EasternAustralia extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(1768, 652);
        polygon.addPoint(1821, 651);
        polygon.addPoint(1817, 720);
        polygon.addPoint(1834, 734);
        polygon.addPoint(1850, 736);
        polygon.addPoint(1858, 731);
        polygon.addPoint(1868, 731);
        polygon.addPoint(1889, 696);
        polygon.addPoint(1893, 689);
        polygon.addPoint(1893, 665);
        polygon.addPoint(1876, 644);
        polygon.addPoint(1876, 635);
        polygon.addPoint(1860, 621);
        polygon.addPoint(1840, 577);
        polygon.addPoint(1832, 576);
        polygon.addPoint(1823, 615);
        polygon.addPoint(1794, 601);
        polygon.addPoint(1803, 590);
        polygon.addPoint(1802, 583);
        polygon.addPoint(1772, 583);
        polygon.addPoint(1760, 590);
        polygon.addPoint(1766, 605);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {
        connectedTerritories.add(Constants.territoriesArrayList.get(40));   //WA
        connectedTerritories.add(Constants.territoriesArrayList.get(38));   //NG

    }

    @Override
    public Polygon getPolygon() {
        return polygon;
    }

    @Override
    public void setContinent() {
        homeContinent = Constants.continentArrayList.get(2);
    }
}
