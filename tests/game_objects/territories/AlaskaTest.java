package game_objects.territories;

import game_objects.Player;
import org.junit.Test;

import static org.junit.Assert.*;

/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 7/14/2019 2019 @ 11:14 AM
 */public class AlaskaTest {

    Alaska alaska = new Alaska();
    /*Player player = new Player("Daniel", "Green");*/

    @Test
    public void getName() {
        assertEquals("Alaska", alaska.getName());
    }

    @Test
    public void getOwnerName() {
        /*alaska.setOwner(player);*/
        assertEquals("Daniel", alaska.getOwner().getName());
    }

    @Test
    public void getOwnerColor() {
        /*alaska.setOwner(player);*/
        assertEquals("Green", alaska.getOwner().getColor());
    }
}