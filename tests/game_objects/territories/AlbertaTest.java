package game_objects.territories;

import game_objects.Player;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 7/14/2019 2019 @ 11:14 AM
 */public class AlbertaTest {

    Alberta alberta = new Alberta();

    @Test
    public void getName() {
        assertEquals("Alberta", alberta.getName());
    }

    @Test
    public void getOwnerName() {
        /*alberta.setOwner(player);*/
        assertEquals("Daniel", alberta.getOwner().getName());
    }

    @Test
    public void getOwnerColor() {
        /*alberta.setOwner(player);*/
        assertEquals("Green", alberta.getOwner().getColor());
    }
}