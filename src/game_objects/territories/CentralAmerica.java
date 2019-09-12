package game_objects.territories;/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 7/21/2019 2019 @ 10:29 PM
 */

import game_objects.Constants;
import game_objects.continents.Asia;
import game_objects.continents.NorthAmerica;
import game_objects.continents.SouthAmerica;

import java.awt.*;
import java.util.ArrayList;

public class CentralAmerica extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {
        polygon.addPoint(731, 308);
        polygon.addPoint(735, 316);
        polygon.addPoint(735, 324);
        polygon.addPoint(739, 329);
        polygon.addPoint(755, 365);
        polygon.addPoint(762, 368);
        polygon.addPoint(765, 363);
        polygon.addPoint(763, 357);
        polygon.addPoint(750, 335);
        polygon.addPoint(754, 333);
        polygon.addPoint(759, 340);
        polygon.addPoint(763, 346);
        polygon.addPoint(770, 358);
        polygon.addPoint(775, 369);
        polygon.addPoint(772, 371);
        polygon.addPoint(774, 376);
        polygon.addPoint(788, 384);
        polygon.addPoint(803, 390);
        polygon.addPoint(805, 399);
        polygon.addPoint(810, 399);
        polygon.addPoint(812, 408);
        polygon.addPoint(812, 414);
        polygon.addPoint(815, 416);
        polygon.addPoint(816, 422);
        polygon.addPoint(821, 425);
        polygon.addPoint(834, 427);
        polygon.addPoint(835, 431);
        polygon.addPoint(835, 426);
        polygon.addPoint(850, 420);
        polygon.addPoint(847, 414);
        polygon.addPoint(841, 412);
        polygon.addPoint(826, 414);
        polygon.addPoint(831, 404);
        polygon.addPoint(840, 392);
        polygon.addPoint(836, 384);
        polygon.addPoint(831, 379);
        polygon.addPoint(839, 371);
        polygon.addPoint(841, 362);
        polygon.addPoint(828, 361);
        polygon.addPoint(825, 369);
        polygon.addPoint(810, 372);
        polygon.addPoint(805, 368);
        polygon.addPoint(807, 350);
        polygon.addPoint(807, 348);
        polygon.addPoint(803, 348);
        polygon.addPoint(807, 342);
        polygon.addPoint(800, 331);
        polygon.addPoint(791, 331);
        polygon.addPoint(782, 323);
        polygon.addPoint(759, 321);
        polygon.addPoint(753, 315);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {
        connectedTerritories.add(Constants.territoriesArrayList.get(3));   //WUS
        connectedTerritories.add(Constants.territoriesArrayList.get(6));   //EUS
        connectedTerritories.add(Constants.territoriesArrayList.get(37));   //Venezuela
    }

    @Override
    public Polygon getPolygon() {
        return polygon;
    }

    @Override
    public void setContinent() {
        homeContinent = Constants.continentArrayList.get(5);
    }
}
