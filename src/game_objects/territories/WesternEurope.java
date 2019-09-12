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

public class WesternEurope extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(1193, 293);
        polygon.addPoint(1185, 288);
        polygon.addPoint(1179, 278);
        polygon.addPoint(1174, 280);
        polygon.addPoint(1162, 285);
        polygon.addPoint(1160, 293);
        polygon.addPoint(1155, 294);
        polygon.addPoint(1147, 291);
        polygon.addPoint(1143, 299);
        polygon.addPoint(1132, 299);
        polygon.addPoint(1121, 300);
        polygon.addPoint(1120, 308);
        polygon.addPoint(1136, 323);
        polygon.addPoint(1140, 326);
        polygon.addPoint(1135, 337);
        polygon.addPoint(1128, 338);
        polygon.addPoint(1114, 340);
        polygon.addPoint(1110, 337);
        polygon.addPoint(1104, 337);
        polygon.addPoint(1094, 343);
        polygon.addPoint(1099, 352);
        polygon.addPoint(1105, 360);
        polygon.addPoint(1103, 368);
        polygon.addPoint(1095, 379);
        polygon.addPoint(1099, 387);
        polygon.addPoint(1107, 393);
        polygon.addPoint(1122, 394);
        polygon.addPoint(1131, 397);
        polygon.addPoint(1138, 403);
        polygon.addPoint(1157, 402);
        polygon.addPoint(1166, 394);
        polygon.addPoint(1167, 389);
        polygon.addPoint(1179, 383);
        polygon.addPoint(1176, 361);
        polygon.addPoint(1181, 357);
        polygon.addPoint(1177, 349);
        polygon.addPoint(1178, 342);
        polygon.addPoint(1193, 346);
        polygon.addPoint(1198, 341);
        polygon.addPoint(1193, 339);
        polygon.addPoint(1192, 333);
        polygon.addPoint(1194, 328);
        polygon.addPoint(1194, 326);
        polygon.addPoint(1190, 322);
        polygon.addPoint(1190, 320);
        polygon.addPoint(1193, 319);
        polygon.addPoint(1194, 310);
        polygon.addPoint(1195, 307);
        polygon.addPoint(1197, 304);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {

        connectedTerritories.add(Constants.territoriesArrayList.get(15));   //GB
        connectedTerritories.add(Constants.territoriesArrayList.get(12));   //NE
        connectedTerritories.add(Constants.territoriesArrayList.get(13));   //SE
        connectedTerritories.add(Constants.territoriesArrayList.get(31));   //NA

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
