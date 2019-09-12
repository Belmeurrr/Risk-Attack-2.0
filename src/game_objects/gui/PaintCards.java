package game_objects.gui;/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 8/7/2019 2019 @ 2:18 PM
 */

import game_objects.Constants;

import javax.swing.*;
import java.awt.*;

public class PaintCards extends JPanel {


    private int initialX;
    private int initialY;

    public PaintCards(int xVal, int yVal) {


    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Constants.currentPlayer.getColor());
        if (Constants.currentPlayer.getOwnedCards().size() > 0) {
            g.drawImage(Constants.currentPlayer.getOwnedCards().get(0).getCardImage(), 580, 800, null);
            for (int index = 0; index < Constants.currentPlayer.getOwnedCards().size(); index++) {
                int offsetX = initialX + 175 * index;
                g.drawImage(Constants.currentPlayer.getOwnedCards().get(index).getCardImage(),
                        initialX + offsetX, initialY, null);
            }
        }
    }

    public void resetPaintComponent(Graphics g) {
        super.paintComponent(g);
    }

}
