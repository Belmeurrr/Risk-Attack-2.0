package game_objects;

import game_objects.cards.ArtilaryCard;
import game_objects.cards.CalvaryCard;
import game_objects.cards.Card;
import game_objects.cards.InfintryCard;
import game_objects.gui.CardPanel;
import game_objects.gui.SelectCardPanel;
import game_objects.territories.Territory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.util.ArrayList;
import java.util.Random;

/*import static sun.security.krb5.internal.crypto.Nonce.value;*/
/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 7/13/2019 2019 @ 8:14 PM
 */

public class GameGUI extends JPanel implements ActionListener {

    public boolean shouldDraw;
    private TerritoryBattleEvaluator territoryBattleEvaluator;
    private JLabel turnConsoleLabel, consoleTestText, offLightLabel1, offLightLabel2,
            offLightLabel3, offLightLabel4, offLightLabel5, offLightLabel6, onLightLabel;
    /*private JPanel cardPanel;*/
    private JPanel turnPanel;
    private JScrollPane consolePanel;
    private JPanel blankPanel;
    private JLabel titleLable;
    private JPanel gamePanel;
    private JFrame gameFrame;
    private JButton singlePlayerButton, startButton, settingsButton, menuExitButton, inGameExitButton;
    private Canvas canvas;
    private int width, height, x, y;


    private Point p;

    private CardPanel cardPanel;

    private boolean flag = true;
    private boolean armyFlag = true;
    private boolean cardFlag = true;


    private ImageIcon offLight, onLight;
    private String title;
    private JPanel menuPanel;
    private JPanel setupPanel;
    private JTextField textField;
    private JLabel nameLabel;
    private int playerCount;


    private JTextArea consolePane;

    ArrayList<Territory> fortificationList;
    ArrayList<Territory> battleList;

    TerritoryFortifier territoryFortifier;


    Point clickedPoint = new Point();
    private JButton endArmyPlacementPhase;
    private JButton endAttackPhase;
    private JButton endFortifyPhase;
    private JPanel endGamePanel;
    private String cardMessage;
    private SelectCardPanel selectCardPanel;
    private ArrayList<Card> selectedCards;


    protected enum STATE {
        MENU,
        GAME,
        SETUP,
        INITIALIZATION,
        ENDGAME

    }

    private STATE state = STATE.MENU;

    /*private STATE state = STATE.MENU;*/
    /*private STATE state = STATE.ENDGAME;*/
    /*private STATE state = STATE.GAME;*/
    /*private STATE state = STATE.INITIALIZATION;*/
    public GameGUI() {

    }

    Player winner;

    public GameGUI(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;

        cardMessage = "You have a match! Would you like to trade in your Cards for " /*+ Card.getBonusArmies()*/;


        fortificationList = new ArrayList<>();
        battleList = new ArrayList<>();
        territoryFortifier = new TerritoryFortifier();
        territoryBattleEvaluator = new TerritoryBattleEvaluator();
        selectedCards = new ArrayList<>();

        p = new Point();
        createGUI();
        /*JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu file = new JMenu("File");
        menuBar.add(file);
        JMenuItem newGame = new JMenuItem("New Game");
        file.add(newGame);
        JMenuItem open = new JMenuItem("Open");
        file.add(open);
        JMenu settings = new JMenu("Settings");
        menuBar.add(settings);
        label = new JLabel("sample text");
        label.setToolTipText("hover text");
        add(label);*/
    }

    public GameGUI(String title, int width, int height, STATE gameState) {
        this.title = title;
        this.width = width;
        this.height = height;

        p = new Point();
        this.state = gameState;


    }

    public Canvas getCanvas() {
        return canvas;
    }


    private void createGUI() {
        /*gameFrame = new JFrame(title);
        gameFrame.setSize(width,height);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setResizable(false);
        gameFrame.setLocationRelativeTo(null);
        gameFrame.setVisible(true);

        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width,height));
        canvas.setMaximumSize(new Dimension(width,height));
        canvas.setMinimumSize(new Dimension(width,height));

        gamePanel = new JPanel();
        gamePanel.setPreferredSize(new Dimension(width,height));
        gamePanel.setMaximumSize(new Dimension(width,height));
        gamePanel.setMinimumSize(new Dimension(width,height));*/

        String hex = "#F7BAA1";

        /*addNewMouseListener(Constants.gamePanel);*/
        addNewMouseListener(Constants.canvas);

        for (int index = 0; index < Constants.territoryTable.getTerritory().size(); index++) {
            JLabel armyTextField = new JLabel();
            p = Constants.territoryTable.getTerritoryNew(index).getCentroid();

            System.out.println(Constants.territoryTable.getTerritoryNew(index).getName() + " has " + Constants.territoryTable.getTerritoryNew(index).getArmies() + " Armies");//tester code

        }



        /*mapPanel = new JLabel(mapBackground);
        mapPanel.setBackground(Color.black);*/
        /*mapPanel.setAlignmentX(500);
        mapPanel.setAlignmentY(500);*/
        /*mapPanel.setBounds(0, 0, 500, 500);*/
        /*gameFrame.add(mapPanel,BorderLayout.CENTER);*/


        cardPanel = new CardPanel();

        selectCardPanel = new SelectCardPanel();



        /*turnPanel = new JPanel();
        turnConsoleLabel = new JLabel("This space should have \nlights that will signify turn");
        turnPanel.add(turnConsoleLabel);
        turnPanel.setBounds(450, 0, 119, 783);
        turnPanel.setBackground(Color.red);
        turnPanel.setBorder(BorderFactory.createLineBorder(Color.black, 4));
        offLight = new ImageIcon(getClass().getResource("/offLight.jpg"));
        onLight = new ImageIcon(getClass().getResource("/onLight.jpg"));*/

        endGamePanel = new JPanel();
        endGamePanel.setBackground(Color.black);
        endGamePanel.setBounds(0, 0, Constants.width, Constants.height);

        onLightLabel = new JLabel(onLight);

        offLightLabel1 = new JLabel(offLight);
        offLightLabel2 = new JLabel(offLight);
        offLightLabel3 = new JLabel(offLight);
        offLightLabel4 = new JLabel(offLight);
        offLightLabel5 = new JLabel(offLight);
        offLightLabel6 = new JLabel(offLight);

        /*turnPanel.add(onLightLabel,BorderLayout.NORTH);
        turnPanel.add(offLightLabel2,BorderLayout.CENTER);
        turnPanel.add(offLightLabel3,BorderLayout.NORTH);
        turnPanel.add(offLightLabel4,BorderLayout.NORTH);
        turnPanel.add(offLightLabel5,BorderLayout.NORTH);
        turnPanel.add(offLightLabel6,BorderLayout.NORTH);*/

        consolePane = new JTextArea();
        consolePane.setLineWrap(true);
        consolePane.setWrapStyleWord(true);
        consolePane.setLayout(null);
        consolePane.setBackground(Color.MAGENTA);
        /*consolePane.setEditable(true);*/
        /*consolePane.setBounds(0, 0, 450, 783);*/
        consolePane.setVisible(true);
        consolePane.append("This is The Console! All game actions that take place should appear here from the gameLog");

        consolePanel = new JScrollPane(consolePane);

        consolePanel.setLayout(new ScrollPaneLayout());
        consolePanel.setBounds(0, 0, 450 + 119, 783);
        consolePanel.setBorder(BorderFactory.createLineBorder(Color.green, 4));
        consolePanel.add(new JLabel("Console"));


        blankPanel = new JPanel();
        blankPanel.setBackground(Color.YELLOW);
        blankPanel.setLayout(new GridBagLayout());
        GridBagConstraints bagConstraints = new GridBagConstraints();
        blankPanel.setBorder(BorderFactory.createLineBorder(Color.black, 4));
        blankPanel.setBounds(0, 783, 569, 1080 - 783);


        titleLable = new JLabel("Main Menu");
        titleLable.setBounds(0, 0, 500, 500);
        titleLable.setSize(width / 10, height / 10);

        /*singlePlayerButton = new JButton();
        singlePlayerButton.setText("Single Player");
        singlePlayerButton.setLocation(513,275);
        singlePlayerButton.setSize(1920/2, 100);
        singlePlayerButton.addActionListener(this);*/

        /*settingsButton = new JButton();
        settingsButton.setText("Settings");
        settingsButton.addActionListener(this);*/

        /*menuExitButton = new JButton();
        menuExitButton.addActionListener(new CloseListener());
        menuExitButton.setText("Exit To Desktop");
        menuExitButton.addActionListener(this);*/


        endArmyPlacementPhase = new JButton();
        bagConstraints.gridx = 0;
        bagConstraints.gridy = 0;
        endArmyPlacementPhase.setText("End Army Placement Phase");
        endArmyPlacementPhase.addActionListener(this);
        endArmyPlacementPhase.setEnabled(false);
        blankPanel.add(endArmyPlacementPhase, bagConstraints);

        endAttackPhase = new JButton();
        bagConstraints.gridx = 1;
        bagConstraints.gridy = 0;
        endAttackPhase.setText("End Attack Phase");
        endAttackPhase.addActionListener(this);
        endAttackPhase.setEnabled(false);
        blankPanel.add(endAttackPhase, bagConstraints);

        endFortifyPhase = new JButton();
        bagConstraints.gridx = 0;
        bagConstraints.gridy = 1;
        endFortifyPhase.setText("End Fortification Phase");
        endFortifyPhase.addActionListener(this);
        endFortifyPhase.setEnabled(false);
        blankPanel.add(endFortifyPhase, bagConstraints);


        inGameExitButton = new JButton();
        bagConstraints.gridx = 1;
        bagConstraints.gridy = 1;
        inGameExitButton.addActionListener(new CloseListener());
        inGameExitButton.setText("Exit To Desktop");
        inGameExitButton.addActionListener(this);


        menuPanel = new JPanel();
        menuPanel.setMaximumSize(new Dimension(width, height));
        menuPanel.setPreferredSize(new Dimension(width, height));
        menuPanel.setMinimumSize(new Dimension(width, height));
        /*menuPanel.setLayout(null);*/
        menuPanel.setLayout(new GridLayout(4, 4, 100, 100));
        /*menuPanel.setLayout(new GridLayout(4,4, 100, 100));*/
        /*menuPanel.add(singlePlayerButton);
        menuPanel.add(settingsButton);
        menuPanel.add(menuExitButton);*/
        /*menuPanel.add(exitButton);*/
        menuPanel.setBackground(Color.blue);
        menuPanel.setVisible(false);
        /*addNewMouseListener(menuPanel);*/
        /*gamePanel.add(singlePlayerButton);*/
        blankPanel.add(inGameExitButton, bagConstraints);

        addEveryThing();

    }

    public void addEveryThing() {
        if (state == STATE.GAME) {

        } else if (state == STATE.MENU) {

            Constants.gameFrame.add(Constants.canvas);
            Constants.gameFrame.add(menuPanel);
            Constants.gameFrame.pack();
        } else if (state == STATE.SETUP) {

            Constants.gameFrame.remove(menuPanel);
            Constants.gameFrame.add(canvas);
            Constants.gameFrame.add(setupPanel);
            Constants.gameFrame.pack();

        } else if (state == STATE.ENDGAME) {
            Constants.gameFrame.remove(menuPanel);
            Constants.gameFrame.remove(cardPanel);
            Constants.gameFrame.remove(canvas);
            Constants.gameFrame.remove(blankPanel);

            Constants.gameFrame.remove(consolePanel);
            Constants.gameFrame.add(endGamePanel);
            String s = JOptionPane.showInputDialog(
                    Constants.gameFrame,
                    winner.getName() +
                            " is the Winning Player, Congratulations!\n"
                            + "Would you like to play again?\n ",
                    "End Game Dialog",
                    JOptionPane.PLAIN_MESSAGE
            );

        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == menuExitButton || e.getSource() == inGameExitButton) {
            String s = JOptionPane.showInputDialog(
                    Constants.gameFrame,
                    "Are you sure you want to quit?",
                    "So soon?",
                    JOptionPane.PLAIN_MESSAGE
            );
            if (s != null) {
                state = STATE.ENDGAME;
            } else if (Integer.parseInt(s) == JOptionPane.CANCEL_OPTION) {

            }

        } else if (e.getSource() == endArmyPlacementPhase) {
            setAttackPhase();
        } else if (e.getSource() == endAttackPhase) {
            setFortificationPhase();
        } else if (e.getSource() == endFortifyPhase) {
            setArmyPlacementPhase();
            nextPlayer();
        } else if (e.getSource() == textField) {
            playerCount = Integer.parseInt(textField.getText());
        } else if (Constants.territoryTable.getTerritory().contains(clickedPoint)) {
            System.out.println("success at 310");
            System.out.println(Constants.territoryTable.getTerritory().contains(e.getSource()));
        }
    }

    public void addNewMouseListener(Canvas canvas) {
        Constants.canvas.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                System.out.println(x + "," + y);    //these co-ords are relative to the component
                p.setLocation(x, y);

                clickedPoint.setLocation(x, y);

                if (Game.getGamestate() == Game.GAMESTATE.INITIALIZATION_PHASE) {


                    if (Constants.territoryArrayListContainsClickedPoint(clickedPoint)) {
                        if (clickedTerritory().getOwner() == null /*&& Constants.territoriesArrayList.contains(clickedTerritory())*/
                                && Constants.territoriesArrayList.get(Constants.territoriesArrayList.indexOf(clickedTerritory())).getPolygon().contains(clickedPoint)) {

                            claimTerritory(Constants.currentPlayer);
                            Constants.gameLog.playerClaimedTerritory(clickedTerritory());
                            consolePane.append(Constants.gameLog.getGameLogArrayList().get(Constants.gameLog.getGameLogArrayList().size() - 1));
                            /*System.out.println(Constants.gameLog.getGameLogArrayList().toString());*/


                        } else {
                            return;
                        }
                    } else {
                        return;
                    }

                    if (Constants.areAllTerritoriesOwned()) {
                        setInitialArmyPlacementPhase();
                        Constants.currentPlayer = Constants.playerArrayList.get(0);
                        return;
                    }
                    nextPlayer();


                } else if (Game.getGamestate() == Game.GAMESTATE.RANDOM_INITIALIZATION_PHASE) {
                    randomizeTerritoryOwners();
                    setInitialArmyPlacementPhase();
                } else if (Game.getGamestate() == Game.GAMESTATE.INITIAL_ARMY_PLACEMENT_PHASE) {

                    for (int index = 0; index < Constants.territoriesArrayList.size(); index++) {
                        if (clickedTerritory().getOwner().equals(Constants.currentPlayer)) {
                            increaseArmyOnMap();

                            break;
                        }
                    }

                    if (!(isRemainingInitialArmiesRemaining())) {
                        setArmyPlacementPhase();
                    }
                    System.out.println(Constants.currentPlayer.getInitialArmiesToPlace());
                    if (Constants.currentPlayer.getInitialArmiesToPlace() == 0) {

                        /*Constants.currentPlayer.setArmiesPerRound(3);*/
                        nextPlayer();
                    }

                } else if (Game.getGamestate() == Game.GAMESTATE.ARMY_PLACEMENT_PHASE) {


                    cardPanel.setBackground(Constants.currentPlayer.getColor());
                    cardFlag = true;

                    if (shouldAddArmies()) {
                        //ask if they want to use cards
                        if (Constants.currentPlayer.hasMatch() || Constants.currentPlayer.getOwnedCards().size() >= 6) {
                            int reply = JOptionPane.showConfirmDialog(null, cardMessage, title, JOptionPane.YES_NO_OPTION);
                            if (reply == JOptionPane.YES_OPTION) {

                                do {
                                    Card s = (Card) JOptionPane.showInputDialog(
                                            null,
                                            "Please select the Cards you would like",
                                            "Card Selection",
                                            JOptionPane.PLAIN_MESSAGE,
                                            null,
                                            Constants.currentPlayer.getOwnedCards().toArray(),
                                            Constants.currentPlayer.getOwnedCards().get(0));

                                    if (!selectedCards.contains(s)) {
                                        selectedCards.add(s);
                                        Constants.currentPlayer.getOwnedCards().remove(s);
                                    }

                                } while (selectedCards.size() < 3);

                                if (isValidMatch()) {
                                    Constants.currentPlayer.getBonusArmies();
                                    selectedCards.clear();
                                } else {
                                    Constants.currentPlayer.getOwnedCards().addAll(selectedCards);
                                }

                                for (Card selectedCard : selectedCards) {
                                    System.out.println(selectedCard);
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, "Cards Kept");

                            }
                        }


                        Constants.currentPlayer.checkIfHasContinent();

                        Constants.currentPlayer.addRoundlyArmies();
                        armyFlag = false;
                    }

                    endFortifyPhase.setEnabled(false);

                    if (clickedTerritory().getOwner().equals(Constants.currentPlayer)) {
                        //add army
                        if (Constants.currentPlayer.getArmiesToPlace() > 0) {
                            increaseArmyOnMap();
                            System.out.println("Player has " + printOutArmiesToPlace() +
                                    " armies left to place");
                            Constants.gameLog.armyAddedToTerritory(clickedTerritory());
                            consolePane.append(Constants.gameLog.getGameLogArrayList().get(Constants.gameLog.getGameLogArrayList().size() - 1) + "\n");

                            if (Constants.currentPlayer.getArmiesToPlace() == 0) {
                                setAttackPhase();
                            }
                        }

                    } else {
                        return;
                    }
                } else if (Game.getGamestate() == Game.GAMESTATE.ATTACK_PHASE) {
                    endFortifyPhase.setEnabled(false);
                    shouldDraw = true;
                    int numberOfAttackerDice;


                    if (battleList.size() < 1
                            && clickedTerritory().getOwner().equals(Constants.currentPlayer)
                            && doesTerritoryTableContainClickedPoint()
                            && !battleList.contains(clickedTerritory())) {
                        battleList.add(clickedTerritory());
                        return;

                    }
                    if (battleList.size() == 1
                            && clickedTerritory() != null
                            && !clickedTerritory().getOwner().equals(Constants.currentPlayer)) {
                        battleList.add(clickedTerritory());
                    } else {
                        battleList.clear();
                        return;
                    }

                    numberOfAttackerDice = askForDiceInput();

                    Player originalDefendingOwner = battleList.get(1).getOwner();
                    if (territoryBattleEvaluator.isValidBattle(battleList.get(0), battleList.get(1), numberOfAttackerDice)) {
                        territoryBattleEvaluator.getResultOfBattle(battleList.get(0), battleList.get(1), numberOfAttackerDice);
                        if (battleList.get(1).getOwner().equals(originalDefendingOwner)) {
                            Constants.gameLog.resultOfBattle(battleList.get(0), battleList.get(1));
                            consolePane.append(Constants.gameLog.getGameLogArrayList().get(Constants.gameLog.getGameLogArrayList().size() - 1) + "\n");
                            battleList.clear();
                        } else {
                            //successful battle
                            Constants.gameLog.playerConquoredTerritory(battleList.get(0), battleList.get(1));
                            if (cardFlag && Constants.currentPlayer.getOwnedCards().size() < 7) {
                                Random random = new Random();
                                int value = random.nextInt(2);
                                if (value == 0) {
                                    Constants.currentPlayer.getOwnedCards().add(new InfintryCard());
                                } else if (value == 1) {
                                    Constants.currentPlayer.getOwnedCards().add(new CalvaryCard());
                                } else if (value == 2) {
                                    Constants.currentPlayer.getOwnedCards().add(new ArtilaryCard());
                                }
                                cardFlag = false;
                            }
                            originalDefendingOwner.removeFromOwnedTerritories(battleList.get(1));

                            fortificationList.addAll(battleList);
                            fortify(fortificationList.get(0), fortificationList.get(1), true);
                            Constants.currentPlayer.getOwnedTerritories().add(Constants.territoriesArrayList.get(Constants.territoriesArrayList.indexOf(battleList.get(1))));
                            consolePane.append(Constants.gameLog.getGameLogArrayList().get(Constants.gameLog.getGameLogArrayList().size() - 1) + "\n");
                            battleList.clear();
                            fortificationList.clear();
                        }
                    }

                    battleList.clear();
                    if (Constants.areAllTerritoriesOwnedByOnePlayer()) {
                        winner = Constants.territoriesArrayList.get(0).getOwner();
                        state = STATE.ENDGAME;
                    }

                } else if (Game.getGamestate() == Game.GAMESTATE.FORTIFICATION_PHASE) {
                    if (fortificationList.size() < 2
                            && clickedTerritory().getOwner().equals(Constants.currentPlayer)
                            && !fortificationList.contains(clickedTerritory())) {
                        fortificationList.add(clickedTerritory());
                        if (fortificationList.size() < 2) {
                            return;
                        }

                    }

                    fortify(fortificationList.get(0), fortificationList.get(1), false);

                    fortificationList.clear();

                    armyFlag = true;
                    shouldDraw = false;
                    endFortifyPhase.setEnabled(false);
                    Constants.currentPlayer.setArmiesPerRound(0);
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }

    private boolean isValidMatch() {
        int infantryCardIndex = 0;
        int calvaryCardIndex = 0;
        int artilleryCardIndex = 0;
/*
        is valid if 3 cards are selected, the 3 cards are not the same card
        the 3 cards are one of each type of card
        or the 3 cards are the same type of card
*/
        if (Constants.currentPlayer.getOwnedCards().size() != 3) {
            return false;
        }

        for (Card card : Constants.currentPlayer.getOwnedCards()) {
            if (card instanceof InfintryCard) {
                infantryCardIndex++;
            }
            if (card instanceof CalvaryCard) {
                calvaryCardIndex++;
            }
            if (card instanceof ArtilaryCard) {
                artilleryCardIndex++;
            }
        }
        if (infantryCardIndex == 3 || calvaryCardIndex == 3 || artilleryCardIndex == 3) {
            return true;
        } else return infantryCardIndex == 1 && calvaryCardIndex == 1 && artilleryCardIndex == 1;
    }


    public int getPlayerCount() {
        return playerCount;
    }


    public CardPanel getCardPanel() {
        return cardPanel;
    }


    public JScrollPane getConsolePanel() {
        return consolePanel;
    }

    public JPanel getBlankPanel() {
        return blankPanel;
    }


    private int askForDiceInput() {
        int maxDice;
        if (battleList.get(0).getArmies() <= 2) {
            maxDice = 1;
        } else if (clickedTerritory().getArmies() == 3) {
            maxDice = 2;
        } else {
            maxDice = 3;
        }
        JSlider diceSlider = new JSlider(JSlider.HORIZONTAL, 1, maxDice, maxDice);
        diceSlider.setMajorTickSpacing(1);
        diceSlider.setPaintTicks(true);
        diceSlider.setPaintLabels(true);

        JPanel sliderPanel = new JPanel();
        sliderPanel.add(diceSlider);

        int numberOfAttackerDice = 0;
        int result = JOptionPane.showConfirmDialog(
                Constants.gameFrame,
                sliderPanel,
                "Please enter the amount\n"
                        + "of Dice you wish to roll\n ",
                JOptionPane.PLAIN_MESSAGE

        );
        if (result == JOptionPane.OK_OPTION) {
            try {
                numberOfAttackerDice = diceSlider.getValue();
            } catch (NumberFormatException ex) {
                catchInputError();
                battleList.clear();
                askForDiceInput();
            }
        }


        return numberOfAttackerDice;
    }

    public boolean shouldAddArmies() {
        if (Constants.currentPlayer.getArmiesToPlace() < 1 || Constants.currentPlayer.hasMatch()) {
            armyFlag = true;
        }
        return armyFlag;
    }

    public boolean isRemainingInitialArmiesRemaining() {
        for (int index = 0; index < Constants.playerArrayList.size(); index++) {
            if (!(Constants.playerArrayList.get(index).getInitialArmiesToPlace() == 0)) {
                return true;
            }

        }
        return false;
    }

    public int printOutArmiesToPlace() {
        return Constants.currentPlayer.getArmiesToPlace();
    }


    public boolean doesTerritoryTableContainClickedPoint() {
        for (int index = 0; index < Constants.territoryTable.getTerritory().size(); index++) {
            if (Constants.territoriesArrayList.get(index).getPolygon().contains(clickedPoint)) {
                return true;
            }
        }
        return false;
    }

    public Territory clickedTerritory() {
        for (int index = 0; index < Constants.territoryTable.getTerritory().size(); index++) {
            if (Constants.territoriesArrayList.get(index).getPolygon().contains(clickedPoint)) {
                return Constants.territoriesArrayList.get(index);
            } else {

            }
        }
        return null;
    }

    public void increaseArmyOnMap() {
        for (int index = 0; index < Constants.territoryTable.getTerritory().size(); index++) {
            if (Constants.territoriesArrayList.get(index).getPolygon().contains(clickedPoint)) {

                if (Game.getGamestate() == Game.GAMESTATE.INITIAL_ARMY_PLACEMENT_PHASE) {
                    Constants.territoriesArrayList.get(index).incrimentArmy();
                    Constants.territoriesArrayList.get(index).getOwner().decrementInitialArmiesToPlace();
                    System.out.println(Constants.territoriesArrayList.get(index).getOwner().getInitialArmiesToPlace());
                } else if (Game.getGamestate() == Game.GAMESTATE.ARMY_PLACEMENT_PHASE) {
                    Constants.territoriesArrayList.get(index).incrimentArmy();
                    Constants.currentPlayer.decrementArmiesToPlace();
                }

                System.out.println("Success @ 363");
                break;

            }
        }
    }


    private void setArmyPlacementPhase() {
        Game.gamestate = Game.GAMESTATE.ARMY_PLACEMENT_PHASE;
        endFortifyPhase.setEnabled(false);
        endArmyPlacementPhase.setEnabled(true);
        JLabel label = new JLabel("This is the Game phase! this consists of taking turns preforming" +
                " army placement, attacking, and fortifying");
        int result = JOptionPane.showConfirmDialog(Constants.gameFrame, label, "Army Placement Message", JOptionPane.DEFAULT_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            System.out.println("cool");
        }
    }

    private void setAttackPhase() {
        Game.gamestate = Game.GAMESTATE.ATTACK_PHASE;
        endArmyPlacementPhase.setEnabled(false);
        endAttackPhase.setEnabled(true);

        JLabel label = new JLabel("This is the Game Attack phase! this consists of selecting a territory you own" +
                " and an adjacent territory you dont own and battling for supremacy");
        int result = JOptionPane.showConfirmDialog(Constants.gameFrame, label, "Attack Message", JOptionPane.DEFAULT_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            System.out.println("cool");
        }
    }

    private void setFortificationPhase() {
        Game.gamestate = Game.GAMESTATE.FORTIFICATION_PHASE;
        endAttackPhase.setEnabled(false);
        endFortifyPhase.setEnabled(true);

        JLabel label = new JLabel("This is the Game Fortification phase! this consists of selecting a territory you own" +
                " and an adjacent territory you  own and moving armies once");
        int result = JOptionPane.showConfirmDialog(Constants.gameFrame, label, "Fortification Message", JOptionPane.DEFAULT_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            System.out.println("cool");
        }
    }

    private void setInitialArmyPlacementPhase() {
        Game.gamestate = Game.GAMESTATE.INITIAL_ARMY_PLACEMENT_PHASE;
        System.out.println("All Territories are owned");
        JLabel label = new JLabel("This is the Initial Army Placement phase! this consists of selecting a territory you own" +
                " and placing up to x amount of armies of your choice to a limit");
        int result = JOptionPane.showConfirmDialog(Constants.gameFrame, label, "Initial Army Placement Message", JOptionPane.DEFAULT_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            System.out.println("cool");
        }
        if (flag) {

            for (int index = 0; index < Constants.playerArrayList.size(); ++index) {

                Constants.playerArrayList.get(index).setInitialArmies();

            }
            flag = false;

            Constants.gameLog.setInitialArmies(Constants.playerArrayList.get(0).getInitialArmiesToPlace());
            consolePane.append(Constants.gameLog.getGameLogArrayList().get(Constants.gameLog.getGameLogArrayList().size() - 1) + "\n");
        }
    }


    public void claimTerritory(Player player) {
        for (int index = 0; index < Constants.territoryTable.getTerritory().size(); index++) {
            if (Constants.territoriesArrayList.get(index).getPolygon().contains(clickedPoint)) {
                if (Constants.territoriesArrayList.get(index).getOwner() == null && Constants.territoriesArrayList.get(index).getArmies() == 0) {
                    Constants.territoriesArrayList.get(index).incrimentArmy();
                    Constants.territoriesArrayList.get(index).setOwner(player);
                    Constants.currentPlayer.getOwnedTerritories().add(Constants.territoriesArrayList.get(index));
                    System.out.println(player.toString());
                    return;
                }
            }
        }
    }

    public void nextPlayer() {
        if (Constants.playerArrayList.indexOf(Constants.currentPlayer) == Constants.playerArrayList.size() - 1) {
            Constants.currentPlayer = Constants.playerArrayList.get(0);
        } else {
            Constants.currentPlayer = Constants.playerArrayList.get(Constants.playerArrayList.indexOf(Constants.currentPlayer) + 1);
        }
    }

    public void randomizeTerritoryOwners() {
        for (int index = 0; index < Constants.territoriesArrayList.size(); index++) {
            Constants.territoriesArrayList.get(index).setOwner(Constants.currentPlayer);
            Constants.currentPlayer.getOwnedTerritories().add(Constants.territoriesArrayList.get(index));
            Constants.territoriesArrayList.get(index).incrimentArmy();
            nextPlayer();
        }
    }

    private void catchInputError() {
        JLabel label = new JLabel("You did not enter a valid number, please double check input");
        int result = JOptionPane.showConfirmDialog(Constants.gameFrame, label, "Error Message", JOptionPane.DEFAULT_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            System.out.println("cool");
        }
    }

    private void fortify(Territory givingTerritory, Territory receivingTerritory, boolean wasAttack) {
        int maxArmies = fortificationList.get(0).getArmies() - 1;
        int value = 0;

        JSlider armySlider = new JSlider(JSlider.HORIZONTAL, 1, maxArmies, maxArmies);
        armySlider.setMajorTickSpacing(5);
        armySlider.setMinorTickSpacing(1);
        armySlider.setPaintTicks(true);
        armySlider.setPaintLabels(true);

        JPanel sliderPanel = new JPanel();
        sliderPanel.add(armySlider);

        int result = JOptionPane.showConfirmDialog(
                Constants.gameFrame,
                sliderPanel,
                "Please enter the amount\n"
                        + "of armies you wish to move\n "
                        + "from " + givingTerritory
                        + " to " + receivingTerritory,
                JOptionPane.PLAIN_MESSAGE

        );
        if (result == JOptionPane.OK_OPTION) {
            try {
                value = armySlider.getValue();
            } catch (NumberFormatException ex) {
                catchInputError();
                return;
            }
        }


        if (territoryFortifier.isValidFortification(givingTerritory, receivingTerritory, value)) {
            territoryFortifier.fortifyTerritory(givingTerritory, receivingTerritory, value);
            Constants.gameLog.fortifiedTerritories(givingTerritory, receivingTerritory, value);
            consolePane.append(Constants.gameLog.getGameLogArrayList().get(Constants.gameLog.getGameLogArrayList().size() - 1) + "\n");
            if (!wasAttack) {
                nextPlayer();
                setArmyPlacementPhase();
                endFortifyPhase.setEnabled(false);
            }

        } else {
            JLabel label = new JLabel("You did not enter a valid number, please double check input" +
                    " and make sure your value is above 0 and less than the giving territory");
            int secondResult = JOptionPane.showConfirmDialog(Constants.gameFrame, label, "Error Message", JOptionPane.DEFAULT_OPTION);
            if (secondResult == JOptionPane.OK_OPTION) {
                System.out.println("cool");
            }
            fortify(givingTerritory, receivingTerritory, wasAttack);
        }
    }
}
