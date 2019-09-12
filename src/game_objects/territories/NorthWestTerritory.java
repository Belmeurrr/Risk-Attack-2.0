package game_objects.territories;

import game_objects.Constants;
import game_objects.continents.Asia;
import game_objects.continents.NorthAmerica;

import java.awt.*;
import java.util.ArrayList;

public class NorthWestTerritory extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {
        polygon.addPoint(705, 97);
        polygon.addPoint(705, 114);
        polygon.addPoint(703, 119);
        polygon.addPoint(701, 146);
        polygon.addPoint(861, 153);
        polygon.addPoint(867, 142);
        polygon.addPoint(877, 137);
        polygon.addPoint(888, 137);
        polygon.addPoint(895, 128);
        polygon.addPoint(901, 124);
        polygon.addPoint(918, 101);
        polygon.addPoint(906, 101);
        polygon.addPoint(901, 107);
        polygon.addPoint(896, 102);
        polygon.addPoint(885, 87);
        polygon.addPoint(898, 71);
        polygon.addPoint(898, 66);
        polygon.addPoint(887, 67);
        polygon.addPoint(879, 70);
        polygon.addPoint(875, 77);
        polygon.addPoint(871, 88);
        polygon.addPoint(871, 99);
        polygon.addPoint(867, 102);
        polygon.addPoint(862, 91);
        polygon.addPoint(857, 93);
        polygon.addPoint(858, 105);
        polygon.addPoint(839, 102);
        polygon.addPoint(826, 110);
        polygon.addPoint(813, 108);
        polygon.addPoint(784, 96);
        polygon.addPoint(781, 96);
        polygon.addPoint(778, 92);
        polygon.addPoint(766, 87);
        polygon.addPoint(757, 93);
        polygon.addPoint(741, 98);
        polygon.addPoint(723, 97);
        /*System.out.println("polygon Created");*/
    }

    @Override
    public void setConnectedTerritories() {

        connectedTerritories.add(Constants.territoriesArrayList.get(0));   //Alaska
        connectedTerritories.add(Constants.territoriesArrayList.get(1));   //Alberta
        connectedTerritories.add(Constants.territoriesArrayList.get(5));   //Ontario
        connectedTerritories.add(Constants.territoriesArrayList.get(8));   //Greenland

    }

    @Override
    public Polygon getPolygon() {
        return polygon;
    }

    @Override
    public void setContinent() {
        homeContinent = Constants.continentArrayList.get(4);
    }
}
