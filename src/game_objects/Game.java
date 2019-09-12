package game_objects;
/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 7/13/2019 2019 @ 8:13 PM
 */

import game_objects.territories.territory_setup.TerritoryTable;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.ArrayList;


public class Game implements Runnable {

    private String title;
    private GameGUI gui;

    private boolean isRunning = false;

    private Thread thread;

    private Player temp = new Player(null, null);


    private BufferStrategy bs;
    private Graphics g;
    private Graphics gp;

    private BufferedImage RiskMapImage;

    private boolean drawRegion = false;
    private int tempVal = -1;

    protected enum GAMESTATE {
        INITIALIZATION_PHASE,
        RANDOM_INITIALIZATION_PHASE,
        INITIAL_ARMY_PLACEMENT_PHASE,
        ARMY_PLACEMENT_PHASE,
        ATTACK_PHASE,
        FORTIFICATION_PHASE
    }

    public static GAMESTATE gamestate = GAMESTATE.INITIALIZATION_PHASE;


    public Game() {

        Constants.currentPlayer = Constants.playerArrayList.get(0);

        System.out.println("***Temporary solution to entering in number of Players***\nPlease enter Player Count: ");

    }

    private void init() {

        TerritoryTable territoryTable = new TerritoryTable();
        ArrayList<Player> playerArrayList = new ArrayList<>();
        ArrayList<Polygon> territoriesRegionArrayList = new ArrayList<>();
        RiskMapImage = ImageLoader.loadImage("/RiskMapBackgroundTest.jpg");


    }

    private void tick() {

        if (State.getCurrentState() != null) {
            State.getCurrentState().tick();
        }
    }

    private void render() {
        bs = Constants.canvas.getBufferStrategy();


        if (bs == null) {
            Constants.canvas.createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();
        gp = gui.getCardPanel().getGraphics();

        g.fillRect(0, 0, Constants.width, Constants.height);

        g.drawImage(RiskMapImage, 569, 0, null);

        if (!temp.equals(Constants.currentPlayer)) {
            gui.getCardPanel().resetPaintComponent(gp);

        }

        if (tempVal != Constants.currentPlayer.getOwnedCards().size() || !temp.equals(Constants.currentPlayer)) {
            gui.getCardPanel().paintComponent(gp);
        }
        tempVal = Constants.currentPlayer.getOwnedCards().size();
        temp = Constants.currentPlayer;
        //Testing code
        if (gui.shouldDraw) {
            drawRegion = true;
        }

        if (drawRegion) {

            if (gui.doesTerritoryTableContainClickedPoint()) {
                for (int index = 0; index < Constants.territoriesArrayList.size(); index++) {
                    g.drawPolygon(Constants.territoriesArrayList.get(Constants.territoriesArrayList.indexOf(gui.clickedTerritory())).getPolygon());
                    g.fillPolygon(Constants.territoriesArrayList.get(Constants.territoriesArrayList.indexOf(gui.clickedTerritory())).getPolygon());

                    g.setColor(Constants.territoriesArrayList.get(Constants.territoriesArrayList.indexOf(gui.clickedTerritory())).getOwner().getColor());

                }

            }

        }
        drawRegion = false;

        for (int index = 0; index < Constants.territoriesArrayList.size(); index++) {
            String armieValue = String.valueOf(Constants.territoriesArrayList.get(index).getArmies());
            g.setFont(new Font("Times New Roman", Font.BOLD, 40));
            if (Constants.territoriesArrayList.get(index).getOwner() != null) {
                g.setColor(Constants.territoriesArrayList.get(index).getOwner().getColor());
            } else {
                g.setColor(Color.black);
            }

            g.drawString(armieValue, Constants.territoriesArrayList.get(index).getCenterPointP().x, Constants.territoriesArrayList.get(index).getCenterPointP().y + -20);
        }

        if (State.getCurrentState() != null) {
            State.getCurrentState().tick();
        }

        bs.show();
        g.dispose();
        gp.dispose();

    }

    @Override
    public void run() {
        isRunning = true;
        init();

        int fps = 60;
        double timePerTick = 1000000000 / fps;
        double delta = 0;
        long now;
        long lastTime = System.nanoTime();
        long timer = 0;
        int ticks = 0;

        while (isRunning) {
            now = System.nanoTime();
            delta += (now - lastTime) / timePerTick;
            timer += (now - lastTime);
            lastTime = now;
            if (delta >= 1) {
                tick();
                render();

                ticks++;
                delta--;
            }
            if (timer >= 1000000000) {
                /*System.out.println("Number of Ticks and Frames: " + ticks);*/
                ticks = 0;
                timer = 0;
            }
            /*if(gui.getGameState() == GameGUI.STATE.ENDGAME){
                stop();
                System.exit(0);
            }*/

        }
        stop();
    }

    public synchronized void start() {
        /*Constants constants = new Constants();*/
        if (isRunning) {
            return;
        }
        gui = new GameGUI(Constants.title, Constants.width, Constants.height);


        Constants.gameFrame.validate();

        /*Constants.gameFrame.add(gui.getTurnPanel());*/
        System.out.println(Constants.gameFrame.getComponentCount());
        Constants.gameFrame.add(gui.getCardPanel());
        System.out.println(Constants.gameFrame.getComponentCount());
        Constants.gameFrame.add(gui.getConsolePanel());
        Constants.gameFrame.add(gui.getBlankPanel());
        /*Constants.gameFrame.add(gui.getTurnPanel());*/

        Constants.gameFrame.add(Constants.gamePanel);
        Constants.gameFrame.add(Constants.canvas);
        Constants.gameFrame.pack();
        isRunning = true;
        thread = new Thread(this);
        thread.start();
    }

    public synchronized void stop() {
        if (!isRunning) {
            return;
        }
        isRunning = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //resets game back to beginning
    public void reset() {

    }

    public static int getWidth() {
        return Constants.width;
    }


    public void runRender() {
        render();
    }



    public static GAMESTATE getGamestate() {
        return gamestate;
    }


}
