package game_objects;/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 7/23/2019 2019 @ 6:28 PM
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends GameObject implements ActionListener {

    private JButton menuExitButton, settingsButton, singlePlayerButton;

    private JPanel menuPanel;
    private STATE state;

    public Menu() {
        super();
        singlePlayerButton = new JButton();
        singlePlayerButton.setText("Local Multiplayer");
        singlePlayerButton.setLocation(513, 275);
        singlePlayerButton.setSize(1920 / 2, 100);
        singlePlayerButton.addActionListener(this);

        settingsButton = new JButton();
        settingsButton.setText("Settings");
        settingsButton.addActionListener(this);

        menuExitButton = new JButton();
        menuExitButton.addActionListener(new CloseListener());
        menuExitButton.setText("Exit To Desktop");
        menuExitButton.addActionListener(this);

        menuPanel = new JPanel();
        menuPanel.setMaximumSize(new Dimension(Constants.width, Constants.height));
        menuPanel.setPreferredSize(new Dimension(Constants.width, Constants.height));
        menuPanel.setMinimumSize(new Dimension(Constants.width, Constants.height));
        /*menuPanel.setLayout(null);*/
        menuPanel.setLayout(new GridLayout(4, 4, 100, 100));
        menuPanel.add(singlePlayerButton);
        menuPanel.add(settingsButton);
        menuPanel.add(menuExitButton);
        /*menuPanel.add(exitButton);*/
        menuPanel.setBackground(Color.black);
        /*Constants.gameFrame.add(menuPanel);*/
        addEveryThing();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == singlePlayerButton) {

            GameObject.state = GameObject.STATE.SETUP;
            System.out.println("test");
            Constants.gameFrame.getContentPane().remove(menuPanel);

            SetUp setupMenu = new SetUp();
            super.addEveryThing();

        } else if (e.getSource() == menuExitButton) {
            state = STATE.ENDGAME;
        }
    }

    @Override
    public void addEveryThing() {
        if (GameObject.state == GameObject.STATE.MENU) {
            /*Constants.gameFrame.removeAll();*/
            /*Constants.gameFrame.remove(gamePanel);
            Constants.gameFrame.remove(setupPanel);*/
            /*Constants.gameFrame.add(Constants.canvas);*/

            Constants.gameFrame.add(menuPanel);
            Constants.gameFrame.pack();
        }
    }

    public void render(Graphics g) {

        Font font = new Font("Times New Roman", Font.BOLD, 50);
        g.setFont(font);
        g.setColor(Color.cyan);
        g.drawString("Risk Attack 2.0", Game.getWidth() / 2, 100);
    }
}