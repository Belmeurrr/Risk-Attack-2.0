package game_objects.cards;/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 7/13/2019 2019 @ 8:02 PM
 */


import game_objects.ImageLoader;

import java.awt.image.BufferedImage;

public abstract class Card {
    BufferedImage cardImage = ImageLoader.loadImage("/Cards.jpg");


    public BufferedImage getCardImage() {
        return cardImage;
    }


}
