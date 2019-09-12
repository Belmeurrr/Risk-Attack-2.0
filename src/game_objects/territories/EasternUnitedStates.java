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

public class EasternUnitedStates extends Territory {



    /*private String name;*/

    public EasternUnitedStates() {
        /*name = getClass().getSimpleName();*/

    }

    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(847, 227);
        polygon.addPoint(846, 278);
        polygon.addPoint(843, 282);
        polygon.addPoint(823, 284);
        polygon.addPoint(820, 295);
        polygon.addPoint(812, 298);
        polygon.addPoint(809, 312);
        polygon.addPoint(808, 315);
        polygon.addPoint(800, 317);
        polygon.addPoint(802, 325);
        polygon.addPoint(803, 334);
        polygon.addPoint(807, 342);
        polygon.addPoint(815, 334);
        polygon.addPoint(824, 332);
        polygon.addPoint(835, 329);
        polygon.addPoint(849, 333);
        polygon.addPoint(850, 328);
        polygon.addPoint(860, 329);
        polygon.addPoint(865, 332);
        polygon.addPoint(880, 330);
        polygon.addPoint(883, 339);
        polygon.addPoint(887, 339);
        polygon.addPoint(886, 347);
        polygon.addPoint(888, 353);
        polygon.addPoint(900, 350);
        polygon.addPoint(901, 336);
        polygon.addPoint(897, 330);
        polygon.addPoint(900, 325);
        polygon.addPoint(903, 322);
        polygon.addPoint(903, 316);
        polygon.addPoint(905, 318);
        polygon.addPoint(924, 308);
        polygon.addPoint(927, 298);
        polygon.addPoint(922, 296);
        polygon.addPoint(921, 290);
        polygon.addPoint(925, 292);
        polygon.addPoint(942, 277);
        polygon.addPoint(945, 266);
        polygon.addPoint(949, 259);
        polygon.addPoint(959, 253);
        polygon.addPoint(960, 244);
        polygon.addPoint(955, 236);
        polygon.addPoint(946, 237);
        polygon.addPoint(942, 247);
        polygon.addPoint(924, 250);
        polygon.addPoint(920, 245);
        polygon.addPoint(901, 243);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {
        connectedTerritories.add(Constants.territoriesArrayList.get(3));   //WUS
        connectedTerritories.add(Constants.territoriesArrayList.get(5));   //Ontario
        connectedTerritories.add(Constants.territoriesArrayList.get(7));   //Quebecc
        connectedTerritories.add(Constants.territoriesArrayList.get(4));   //CA
    }

    @Override
    public Polygon getPolygon() {
        return polygon;
    }

    @Override
    public void setContinent() {
        homeContinent = Constants.continentArrayList.get(4);
    }

   /* public String getName(){
        return name;
    }*/


    /*public void setOwner(Player player){
        super.setOwner(player);
    }*/
}
