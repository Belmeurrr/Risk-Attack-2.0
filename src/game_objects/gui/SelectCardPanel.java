package game_objects.gui;/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 8/7/2019 2019 @ 2:13 PM
 */

import game_objects.Constants;

import javax.swing.*;
import java.awt.*;

public class SelectCardPanel extends JPanel {

    private int initialX = 25;
    private int initialY = 25;

    public SelectCardPanel() {
        setBounds(550, 400, 500, 500);
        setLayout(new GridLayout());
        setBackground(Color.black);
        setBorder(BorderFactory.createLineBorder(Color.black, 4));

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
