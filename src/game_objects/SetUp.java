package game_objects;/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 7/23/2019 2019 @ 6:28 PM
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetUp extends GameObject implements ActionListener {

    private final JLabel playerCreatedLabel;
    private JButton addPlayerButton;
    private JTextField playerCountTextField, nameTextField, colorTextField;
    private JLabel playerCountLabel, nameLabel, colorLabel;
    private JButton menuExitButton, settingsButton, singlePlayerButton;

    private ColorChooser colorChooser;
    private Color inputColor;

    private JPanel setupPanel, colorPanel;
    private STATE state;
    private JButton startButton;
    private GameGUI gui;

    public SetUp() {
        super();

        colorLabel = new JLabel("Please enter Color of Player here");
        playerCountLabel = new JLabel("Please enter number of players here :");
        nameLabel = new JLabel("Please enter Name of player here");

        colorTextField = new JTextField();
        playerCountTextField = new JTextField();
        nameTextField = new JTextField();

        playerCreatedLabel = new JLabel();
        playerCreatedLabel.setLocation(800, 300);
        playerCreatedLabel.setSize(250, 125);
        playerCreatedLabel.setOpaque(true);

        menuExitButton = new JButton();
        /*menuExitButton.addActionListener(new CloseListener());*/
        menuExitButton.setText("Exit To Desktop");
        menuExitButton.addActionListener(this);
        menuExitButton.setSize(200, 100);
        menuExitButton.setLocation(1040, 650);
        menuExitButton.setOpaque(true);

        startButton = new JButton();
        startButton.setText("Start Game");
        startButton.addActionListener(this);
        startButton.setSize(200, 100);
        startButton.setLocation(540, 650);
        startButton.setOpaque(true);

        addPlayerButton = new JButton();
        addPlayerButton.setText("Add Player");
        addPlayerButton.addActionListener(this);
        addPlayerButton.setSize(200, 100);
        addPlayerButton.setLocation(790, 650);
        addPlayerButton.setOpaque(true);


        nameLabel.setSize(225, 100);
        nameLabel.setLocation(300, 300);
        nameLabel.setBackground(Color.red);
        nameLabel.setOpaque(true);


        playerCountLabel.setSize(225, 100);
        playerCountLabel.setLocation(300, 150);
        playerCountLabel.setBackground(Color.cyan);
        playerCountLabel.setOpaque(true);

        colorLabel.setSize(225, 100);
        colorLabel.setLocation(300, 450);
        colorLabel.setBackground(Color.green);
        colorLabel.setOpaque(true);

        nameTextField.setSize(200, 100);
        nameTextField.setLocation(540, 300);
        nameTextField.setBackground(Color.white);
        nameTextField.setOpaque(true);

        playerCountTextField.setSize(200, 100);
        playerCountTextField.setBackground(Color.YELLOW);
        playerCountTextField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        playerCountTextField.setLocation(540, 150);
        playerCountTextField.setOpaque(true);

        colorTextField.setSize(200, 100);
        colorTextField.setBackground(Color.magenta);
        colorTextField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        colorTextField.setLocation(540, 450);
        colorTextField.setOpaque(true);


        colorChooser = new ColorChooser();
        colorPanel = new JPanel();


        colorPanel.setBounds(1100, 100, 600, 450);
        colorPanel.add(colorChooser);
        colorPanel.setOpaque(true);


        setupPanel = new JPanel();
        setupPanel.setMaximumSize(new Dimension(Constants.width, Constants.height));
        setupPanel.setPreferredSize(new Dimension(Constants.width, Constants.height));
        setupPanel.setMinimumSize(new Dimension(Constants.width, Constants.height));
        setupPanel.setLayout(null);
        /*setupPanel.add(playerCountLabel);
        setupPanel.add(playerCountTextField);*/
        setupPanel.add(startButton);
        System.out.println("46 test");
        setupPanel.add(menuExitButton);
        /*setupPanel.add(colorLabel);*/
        /*setupPanel.add(colorTextField);*/
        setupPanel.add(nameLabel);
        setupPanel.add(nameTextField);
        setupPanel.add(colorPanel);
        setupPanel.add(addPlayerButton);
        setupPanel.add(playerCreatedLabel);
        setupPanel.setBackground(Color.black);
        /*Constants.gameFrame.add(setupPanel);*/


        addEveryThing();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {

            GameObject.state = GameObject.STATE.GAME;
            System.out.println("test");
            Constants.gameFrame.getContentPane().remove(setupPanel);
            Constants.gameFrame.revalidate();

            /*if(isInteger(playerCountTextField.getText() ) && Integer.parseInt(playerCountTextField.getText()) < 6) {
                Constants.playerCount = Integer.parseInt(playerCountTextField.getText());
            }else{
                Constants.playerCount = 2;
                System.out.println("This section of code is temporary and must be handeled later");
            }*/


            if (Constants.playerArrayList.size() < 2) {
                System.out.println("Here we need to tell the user in the UI they need to enter a correct number");
                /*GameObject.state = GameObject.STATE.ENDGAME;*/
            }

            System.out.println("Player Count: " + Constants.playerArrayList.size());
            System.out.println(Constants.playerArrayList.toString());
            addEveryThing();


        } else if (e.getSource() == addPlayerButton) {

            inputColor = colorChooser.getColor();

            for (int index = 0; index < Constants.playerArrayList.size(); index++) {
                if (Constants.playerArrayList.get(index).getColor().equals(inputColor) || Constants.playerArrayList.get(index).getName().equalsIgnoreCase(nameTextField.getText())) {
                    System.out.println("Players is not unique, please try again");
                    //should put a dialog box here i guess
                    return;
                }
            }

            playerCreatedLabel.setBackground(inputColor);

            System.out.println("********Test output to give Color Which is: " + inputColor);
            if (nameTextField.getText() != null && !nameTextField.getText().isEmpty()) {
                Player player = new Player(getNameTextField(), getColorInput());

                Constants.playerArrayList.add(player);

                nameTextField.setText("");
            }/*else{
                JFrame frame1 = new JFrame("Error");
                frame1.setDefaultCloseOperation();
                JOptionPane failedMessageWindow = new JOptionPane();
                JLabel failedLabel = new JLabel("Something went wrong, make sure players are inputed properly");
                failedMessageWindow.setBounds(500, 500, 500, 500);
                *//*failedMessageWindow.setBor(new Dimension());*//*
                failedMessageWindow.add(failedLabel).setLocation(100, 100);

                frame1.setBounds(500, 500, 500 ,500);
                frame1.setVisible(true);
                frame1.add(failedMessageWindow);

                return;
            }*/

            playerCreatedLabel.setText(Constants.playerArrayList.get(Constants.playerArrayList.size() - 1).toString());

        } else if (e.getSource() == menuExitButton) {
            GameObject.state = GameObject.STATE.ENDGAME;
            super.addEveryThing();
        }
    }

    @Override
    public void addEveryThing() {
        if (GameObject.state == GameObject.STATE.SETUP) {
            /*Constants.gameFrame.removeAll();*/
            /*Constants.gameFrame.remove(gamePanel);
            Constants.gameFrame.remove(setupPanel);*/
            /*Constants.gameFrame.add(Constants.canvas);*/

            Constants.gameFrame.add(setupPanel);

            Constants.gameFrame.pack();
        } else if (GameObject.state == GameObject.STATE.GAME) {

            Game game = new Game();


            game.start();
            JLabel label = new JLabel("This is the games initialization phase, please select one territory and move to the next player");
            int result = JOptionPane.showConfirmDialog(Constants.gameFrame, label, "Tutorial Message", JOptionPane.DEFAULT_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                System.out.println("cool");
            }
        }
    }

    public boolean isInteger(String input) {
        if (input.isEmpty()) {
            return false;
        }
        for (int index = 0; index < input.length(); index++) {
            if (!Character.isDigit(input.charAt(index))) {
                return false;
            }
        }
        return true;
    }

    public String getNameTextField() {
        return nameTextField.getText();
    }

    public Color getColorInput() {
        return inputColor;
    }

    public void render(Graphics g) {

        Font font = new Font("Times New Roman", Font.BOLD, 50);
        g.setFont(font);
        g.setColor(Color.cyan);
        g.drawString("Risk Attack 2.0", Game.getWidth() / 2, 100);
    }
}