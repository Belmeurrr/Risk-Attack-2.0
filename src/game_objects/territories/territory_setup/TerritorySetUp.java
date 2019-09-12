package game_objects.territories.territory_setup;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TerritorySetUp {


    public static void main(String[] args) {
        Scanner scanner = null;


        File file = new File("resources/Coords.txt");
        {
            try {
                scanner = new Scanner(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            assert scanner != null;
            while (scanner.hasNextLine()) {
                String coords = scanner.next();
                System.out.println("polygon.addPoint(" + coords + ");");
            }
        }
    }


}
