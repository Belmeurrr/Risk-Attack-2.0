package game_objects;/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 7/25/2019 2019 @ 9:18 PM
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public abstract class GameObject implements ActionListener {
    private JPanel setupPanel;
    private JLabel nameLabel;
    private JTextField textField;
    private JPanel menuPanel;
    private JButton inGameExitButton;
    private JButton menuExitButton;
    private JButton settingsButton;
    /*private JButton singlePlayerButton;*/
    private JLabel titleLable;
    private JPanel blankPanel;
    private JPanel consolePanel;
    private JLabel offLightLabel1, offLightLabel2, offLightLabel3, offLightLabel4, offLightLabel5, offLightLabel6;
    private JLabel onLightLabel;
    private ImageIcon onLight;
    private ImageIcon offLight;
    private JLabel turnConsoleLabel;
    private JPanel turnPanel;
    private JLabel consoleTestText;
    private JPanel cardPanel;
    private Canvas canvas;

    private int x, y;
    private JPanel gamePanel;

    /*@Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == singlePlayerButton){
            state = STATE.GAME;
            addEveryThing();


        }else if(e.getSource() == settingsButton){

        }else if(e.getSource() == menuExitButton){

        }
    }*/

    protected enum STATE {
        MENU,
        GAME,
        SETUP,
        INITIALIZATION,
        ENDGAME
    }

    /*private STATE state = STATE.SETUP;*/
    public static STATE state = STATE.MENU;
    /*private STATE state = STATE.ENDGAME;*/
    /*private STATE state = STATE.GAME;*/
    /*private STATE state = STATE.INITIALIZATION;*/

    GameObject() {


        Point p = new Point();
        cardPanel = new JPanel();
        consoleTestText = new JLabel("This is where the Player Cards will go");   //TEMPORARY
        cardPanel.setBounds(569, 785, 1351, 297);
        //cardPanel.setBounds(900, 717, 200, 200);
        cardPanel.setBorder(BorderFactory.createLineBorder(Color.black, 4));
        cardPanel.setBackground(Color.cyan);
        cardPanel.add(consoleTestText, BorderLayout.CENTER);


        blankPanel = new JPanel();
        blankPanel.setBackground(Color.YELLOW);
        blankPanel.setLayout(new GridLayout());
        blankPanel.setBorder(BorderFactory.createLineBorder(Color.black, 4));
        blankPanel.setBounds(0, 783, 569, 1080 - 783);

        titleLable = new JLabel("Main Menu");
        titleLable.setBounds(0, 0, 500, 500);
        titleLable.setSize(Constants.width / 10, Constants.height / 10);


        inGameExitButton = new JButton();
        inGameExitButton.addActionListener(new CloseListener());
        inGameExitButton.setText("Exit To Desktop");
        inGameExitButton.addActionListener(this);


        blankPanel.add(inGameExitButton);

        textField = new JTextField();
        nameLabel = new JLabel("Please enter number of players here :");

        setupPanel = new JPanel();
        setupPanel.setMaximumSize(new Dimension(Constants.width, Constants.height));
        setupPanel.setPreferredSize(new Dimension(Constants.width, Constants.height));
        setupPanel.setMinimumSize(new Dimension(Constants.width, Constants.height));
        setupPanel.setLayout(null);

        nameLabel.setSize(225, 100);
        nameLabel.setLocation(300, 150);
        nameLabel.setBackground(Color.cyan);
        nameLabel.setOpaque(true);
        textField.setSize(200, 100);
        textField.setBackground(Color.YELLOW);
        textField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        textField.setLocation(540, 150);
        textField.setOpaque(true);
        setupPanel.add(nameLabel);
        setupPanel.add(textField);

    }

    public void addEveryThing() {
        if (state == STATE.GAME) {


        } else if (state == STATE.MENU) {

            Constants.gameFrame.add(menuPanel);

        } else if (state == STATE.SETUP) {


        } else if (state == STATE.ENDGAME) {

            System.exit(0);
        }
    }
}