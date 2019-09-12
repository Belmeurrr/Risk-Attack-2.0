package game_objects.cards;/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 7/13/2019 2019 @ 8:05 PM
 */

import game_objects.ImageLoader;

import java.awt.image.BufferedImage;

public class CalvaryCard extends Card {

    private BufferedImage calvaryCardImage;

    public CalvaryCard() {
        calvaryCardImage = cardImage.getSubimage(150, 0, 150, 230);
    }

    public BufferedImage getCardImage() {
        return calvaryCardImage;
    }


}
