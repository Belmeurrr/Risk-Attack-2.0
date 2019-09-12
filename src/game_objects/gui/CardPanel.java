package game_objects.gui;/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 8/6/2019 2019 @ 9:04 PM
 */

import game_objects.Constants;
import org.w3c.dom.css.Rect;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class CardPanel extends JPanel {

    private JLabel consoleTestText;
    private int initialX = 25;
    private int initialY = 25;
    private ArrayList<Rectangle> cardRectangles;
    private ArrayList cardImages;
    private boolean shouldDrawRectangle = false;

    public CardPanel() {
        /*cardPanel = new JPanel();*/
        cardRectangles = new ArrayList<>();
        consoleTestText = new JLabel("This is where the Player Cards will go");   //TEMPORARY
        setBounds(569, 785, 1351, 297);
        setLayout(null);
        //cardPanel.setBounds(900, 717, 200, 200);
        setBorder(BorderFactory.createLineBorder(Color.black, 4));
        /*cardPanel.setBackground(Color.cyan);*/
        add(consoleTestText);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Constants.currentPlayer.getColor());
        if (Constants.currentPlayer.getOwnedCards().size() > 0) {
            g.drawImage(Constants.currentPlayer.getOwnedCards().get(0).getCardImage(), 580, 800, null);

            cardRectangles.add(new Rectangle(580, 800, Constants.currentPlayer.getOwnedCards().get(0).getCardImage().getWidth() + 5, Constants.currentPlayer.getOwnedCards().get(0).getCardImage().getHeight() + 5));

            for (int index = 0; index < Constants.currentPlayer.getOwnedCards().size(); index++) {
                int offsetX = initialX + 175 * index;
                if (shouldDrawRectangle) {
                    g.drawImage(Constants.currentPlayer.getOwnedCards().get(index).getCardImage(),
                            initialX + offsetX, initialY - 20, null);
                } else {
                    g.drawImage(Constants.currentPlayer.getOwnedCards().get(index).getCardImage(),
                            initialX + offsetX, initialY, null);
                }


                cardRectangles.add(new Rectangle(initialX + offsetX, initialY, Constants.currentPlayer.getOwnedCards().get(0).getCardImage().getWidth() + 5,
                        Constants.currentPlayer.getOwnedCards().get(0).getCardImage().getHeight() + 5));
            }
        }
    }

    public void drawBorderAroundCard(Point point) {
        for (int index = 0; index < cardRectangles.size(); index++) {
            int offsetX = initialX + 175 * index;
            if (cardRectangles.get(index).contains(point)) {
                cardRectangles.get(index).grow(10, 10);
            }
        }
    }

    public void resetPaintComponent(Graphics g) {
        super.paintComponent(g);
    }

    public void setShouldDraw() {
        shouldDrawRectangle = true;
    }


}
