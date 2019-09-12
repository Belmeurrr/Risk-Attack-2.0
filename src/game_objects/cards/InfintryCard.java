package game_objects.cards;/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 7/13/2019 2019 @ 8:04 PM
 */

import game_objects.ImageLoader;

import java.awt.image.BufferedImage;

public class InfintryCard extends Card {

    private BufferedImage infintryCardImage;

    public InfintryCard() {
        infintryCardImage = cardImage.getSubimage(0, 0, 150, 230);
    }

    public BufferedImage getCardImage() {
        return infintryCardImage;
    }
}
