package game_objects.territories;
/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 7/13/2019 2019 @ 9:52 PM
 */

import game_objects.Constants;
import game_objects.continents.Asia;
import game_objects.continents.NorthAmerica;

import java.awt.*;
import java.util.ArrayList;

public class Alberta extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {
        polygon.addPoint(718, 151);
        polygon.addPoint(718, 157);
        polygon.addPoint(721, 162);
        polygon.addPoint(720, 174);
        polygon.addPoint(727, 178);
        polygon.addPoint(725, 185);
        polygon.addPoint(720, 191);
        polygon.addPoint(731, 224);
        polygon.addPoint(821, 224);
        polygon.addPoint(828, 154);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {
        connectedTerritories.add(Constants.territoriesArrayList.get(0));   //Alaska
        connectedTerritories.add(Constants.territoriesArrayList.get(2));   //NWT
        connectedTerritories.add(Constants.territoriesArrayList.get(3));   //WUS
        connectedTerritories.add(Constants.territoriesArrayList.get(5));   //Ontario
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
