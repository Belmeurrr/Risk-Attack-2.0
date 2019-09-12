package game_objects.territories;

import game_objects.Player;
import game_objects.continents.Continent;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;
/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 7/13/2019 2019 @ 7:54 PM
 */

public abstract class Territory {

    private String name;
    Continent homeContinent;
    private Player owner;
    int armies = 0;

    Point p = new Point();
    Point armyPoint = new Point();

    ArrayList<Territory> connectedTerritories = new ArrayList<>();

    /*Graphics graphics = new G*/

    Polygon polygon = new Polygon();


    public Territory() {
        name = getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    public Player getOwner() {
        return owner;
    }

    public int getArmies() {
        return armies;
    }

    public void setArmies(int armies) {
        this.armies = armies;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public abstract ArrayList<Territory> getConnectedTerritories();


    public void setName() {
        this.name = getClass().getName();
    }

    public abstract void setReigon();

    public abstract void setConnectedTerritories();

    public abstract Polygon getPolygon();


    //Code from StackOverfloww to give a cernter point value of a territory
    public Point getCentroid() {
        Vector<Integer> x = new Vector<Integer>();
        Vector<Integer> y = new Vector<Integer>();
        for (int i = 0; i < polygon.npoints; i++) {
            x.add(polygon.xpoints[i]);
            y.add(polygon.ypoints[i]);
        }
        p = new Point((Collections.max(x) + Collections.min(x)) / 2, (Collections.max(y) + Collections.min(y)) / 2);
        return p;
    }

    public Point getCenterPointP() {
        getCentroid();
        return p;
    }

    public void setCentroid() {
        armyPoint = getCentroid();
    }

    public void incrimentArmy() {
        armies++;
    }

    public void decrementArmy() {
        armies--;
    }

    public abstract void setContinent();
}
