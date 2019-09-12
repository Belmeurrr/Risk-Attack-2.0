package game_objects.territories;
/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 7/13/2019 2019 @ 9:52 PM
 */

import game_objects.Constants;
import game_objects.continents.Asia;

import java.awt.*;
import java.util.ArrayList;

public class China extends Territory {


    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(1723, 316);
        polygon.addPoint(1736, 327);
        polygon.addPoint(1740, 351);
        polygon.addPoint(1736, 380);
        polygon.addPoint(1718, 395);
        polygon.addPoint(1718, 401);
        polygon.addPoint(1707, 404);
        polygon.addPoint(1703, 411);
        polygon.addPoint(1695, 414);
        polygon.addPoint(1693, 407);
        polygon.addPoint(1690, 406);
        polygon.addPoint(1680, 396);
        polygon.addPoint(1673, 393);
        polygon.addPoint(1671, 398);
        polygon.addPoint(1664, 399);
        polygon.addPoint(1652, 402);
        polygon.addPoint(1647, 400);
        polygon.addPoint(1647, 396);
        polygon.addPoint(1643, 393);
        polygon.addPoint(1642, 390);
        polygon.addPoint(1634, 387);
        polygon.addPoint(1625, 389);
        polygon.addPoint(1622, 379);
        polygon.addPoint(1609, 379);
        polygon.addPoint(1599, 380);
        polygon.addPoint(1598, 374);
        polygon.addPoint(1583, 372);
        polygon.addPoint(1583, 370);
        polygon.addPoint(1575, 370);
        polygon.addPoint(1551, 359);
        polygon.addPoint(1554, 353);
        polygon.addPoint(1554, 336);
        polygon.addPoint(1541, 333);
        polygon.addPoint(1541, 328);
        polygon.addPoint(1532, 330);
        polygon.addPoint(1532, 325);
        polygon.addPoint(1524, 319);
        polygon.addPoint(1523, 305);
        polygon.addPoint(1533, 304);
        polygon.addPoint(1543, 294);
        polygon.addPoint(1545, 282);
        polygon.addPoint(1542, 277);
        polygon.addPoint(1546, 269);
        polygon.addPoint(1558, 253);
        polygon.addPoint(1559, 249);
        polygon.addPoint(1565, 246);
        polygon.addPoint(1571, 252);
        polygon.addPoint(1580, 251);
        polygon.addPoint(1588, 264);
        polygon.addPoint(1602, 274);
        polygon.addPoint(1610, 286);
        polygon.addPoint(1631, 304);
        polygon.addPoint(1652, 306);
        polygon.addPoint(1685, 310);
        polygon.addPoint(1699, 309);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {
        connectedTerritories.add(Constants.territoriesArrayList.get(22));   //Mongolia
        connectedTerritories.add(Constants.territoriesArrayList.get(16));   //Siberia
        connectedTerritories.add(Constants.territoriesArrayList.get(24));   //Siam
        connectedTerritories.add(Constants.territoriesArrayList.get(25));   //india
        connectedTerritories.add(Constants.territoriesArrayList.get(26));   //afghanistan
        connectedTerritories.add(Constants.territoriesArrayList.get(17));   //ural
    }

    @Override
    public Polygon getPolygon() {
        return polygon;
    }

    @Override
    public void setContinent() {
        homeContinent = Constants.continentArrayList.get(1);
    }
}
