package game_objects.territories.territory_setup;/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 7/21/2019 2019 @ 12:32 AM
 */

import game_objects.continents.Continent;
import game_objects.territories.Territory;

import java.awt.*;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TerritoryTable {

    private ArrayList<Territory> territories = new ArrayList<>();
    private ArrayList<Continent> continents = new ArrayList<>();


    public TerritoryTable() {
        readInTerritoriesFromFile();
    }

    private void readInTerritoriesFromFile() {
        File file = new File("resources/Original_Map_Territory_List.txt");
        File continentFile = new File("resources/Original_Map_Continent_List.txt");
        InputStream territoryInputStream = this.getClass().getResourceAsStream("/Original_Map_Territory_List.txt");
        InputStream continentInputStream = this.getClass().getResourceAsStream("/Original_Map_Continent_List.txt");
        Scanner territoryScanner = null;
        Scanner continentScanner = null;

        /*territoryScanner = new Scanner(this.getClass().getResourceAsStream("resources/Original_Map_Territory_List.txt"));

        continentScanner = new Scanner(this.getClass().getResourceAsStream("resources/Original_Map_Continent_List.txt"));*/


        try {
            BufferedReader territoryBufferedReader = new BufferedReader(new InputStreamReader(territoryInputStream));
            BufferedReader continentBufferedReader = new BufferedReader(new InputStreamReader(continentInputStream));
            String line;
            while ((line = territoryBufferedReader.readLine()) != null) {
                String className = null;
                className = line;
                try {
                    Class c = Class.forName("game_objects.territories." + className);
                    Territory terr = (Territory) c.getDeclaredConstructor().newInstance();


                    territories.add(terr);


                } catch (InvocationTargetException | IllegalAccessException | InstantiationException | ClassNotFoundException | NoSuchMethodException ex) {
                    System.out.println("Something went wrong");// to be deleted
                    System.out.println(ex);// to be deleted
                }
            }

            while ((line = continentBufferedReader.readLine()) != null) {
                String className = null;
                className = line;
                try {
                    Class c = Class.forName("game_objects.continents." + className);
                    Continent cont = (Continent) c.getDeclaredConstructor().newInstance();

                    cont.init();
                    continents.add(cont);


                } catch (InvocationTargetException | IllegalAccessException | InstantiationException | ClassNotFoundException | NoSuchMethodException ex) {
                    System.out.println("Something went wrong");// to be deleted
                    System.out.println(ex);// to be deleted
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        /*while(territoryScanner.hasNextLine()){
            String className = territoryScanner.nextLine();
            try {
                Class c = Class.forName("game_objects.territories." + className);
                Territory terr = (Territory) c.getDeclaredConstructor().newInstance();


                territories.add(terr);


            } catch (InvocationTargetException | IllegalAccessException | InstantiationException | ClassNotFoundException | NoSuchMethodException ex) {
                System.out.println("Something went wrong");// to be deleted
                System.out.println(ex);// to be deleted
            }

        }
        while(continentScanner.hasNextLine()){
            String className = continentScanner.nextLine();
            try {
                Class c = Class.forName("game_objects.continents." + className);
                Continent cont = (Continent) c.getDeclaredConstructor().newInstance();

                cont.init();

                continents.add(cont);



            } catch (InvocationTargetException | IllegalAccessException | InstantiationException | ClassNotFoundException | NoSuchMethodException ex) {
                System.out.println("Something went wrong");// to be deleted
                System.out.println(ex);// to be deleted
            }
        }*/
        /*for(int index = 0; index < territories.size(); index++){
            territories.get(index).setReigon();
            territories.get(index).setConnectedTerritories();
            territories.get(index).setCentroid();
        }*/
    }

    public ArrayList getTerritory() {
        return territories;
    }

    public Territory getTerritoryNew(int index) {
        return territories.get(index);
    }

    public Territory arrayListContainsPoint(Point point) {
        for (int index = 0; index < territories.size(); index++) {
            if (territories.get(index).getPolygon().contains(point)) {
                System.out.println(territories.get(index).getName());
                System.out.println(territories.get(index).getCentroid());
                return territories.get(index);
            }

        }
        return null;
    }

    public ArrayList getContinents() {
        return continents;
    }
}
