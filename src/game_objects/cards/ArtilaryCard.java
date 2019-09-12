package game_objects.cards;/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 7/13/2019 2019 @ 8:04 PM
 */

import game_objects.ImageLoader;

import java.awt.image.BufferedImage;

public class ArtilaryCard extends Card {

    private BufferedImage artilaryCardImage;

    public ArtilaryCard() {
        artilaryCardImage = cardImage.getSubimage(300, 0, 150, 230);
    }

    public BufferedImage getCardImage() {
        return artilaryCardImage;
    }

}
