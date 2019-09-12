package game_objects.territories;
/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 7/13/2019 2019 @ 9:52 PM
 */

import game_objects.Constants;
import game_objects.continents.Australia;
import game_objects.continents.NorthAmerica;

import java.awt.*;
import java.util.ArrayList;

public class WesternAustralia extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(1768, 654);
        polygon.addPoint(1823, 653);
        polygon.addPoint(1816, 717);
        polygon.addPoint(1794, 714);
        polygon.addPoint(1774, 696);
        polygon.addPoint(1743, 706);
        polygon.addPoint(1740, 712);
        polygon.addPoint(1722, 718);
        polygon.addPoint(1713, 725);
        polygon.addPoint(1693, 725);
        polygon.addPoint(1692, 717);
        polygon.addPoint(1694, 713);
        polygon.addPoint(1674, 682);
        polygon.addPoint(1669, 647);
        polygon.addPoint(1686, 638);
        polygon.addPoint(1711, 629);
        polygon.addPoint(1715, 612);
        polygon.addPoint(1721, 610);
        polygon.addPoint(1743, 593);
        polygon.addPoint(1754, 601);
        polygon.addPoint(1765, 610);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {

        connectedTerritories.add(Constants.territoriesArrayList.get(39));   //Indonisia
        connectedTerritories.add(Constants.territoriesArrayList.get(38));   //NG
        connectedTerritories.add(Constants.territoriesArrayList.get(41));   //EasternAustralia

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
