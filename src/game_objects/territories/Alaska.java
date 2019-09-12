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

public class Alaska extends Territory {



    /*public Alaska() {
        super();
    }*/

    @Override
    public ArrayList getConnectedTerritories() {
        return connectedTerritories;
    }

    @Override
    public void setReigon() {

        polygon.addPoint(607, 82);
        polygon.addPoint(597, 176);
        polygon.addPoint(716, 193);
        polygon.addPoint(725, 183);
        polygon.addPoint(719, 174);
        polygon.addPoint(715, 151);
        polygon.addPoint(700, 146);
        polygon.addPoint(703, 85);
        //System.out.println("Polygon Created");
    }

    @Override
    public void setConnectedTerritories() {
        connectedTerritories.add(Constants.territoriesArrayList.get(2));   //NWTerr
        connectedTerritories.add(Constants.territoriesArrayList.get(1));   //Alberta
        connectedTerritories.add(Constants.territoriesArrayList.get(19));   //kamchatka
    }

    @Override
    public Polygon getPolygon() {
        return polygon;
    }

    @Override
    public void setContinent() {
        homeContinent = Constants.continentArrayList.get(4);
    }


    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setFont(new Font("Times New Roman", Font.PLAIN, 50));
        g2d.drawString(Integer.toString(armies), 50, 100);
    }

}
