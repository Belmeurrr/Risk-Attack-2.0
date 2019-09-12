package game_objects;/*
 *   csc413-tankgame-Belmeurrr
 *   Created by Daniel
 *   Created on 7/24/2019 2019 @ 11:45 PM
 */

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class ColorChooser extends JPanel implements ChangeListener {
    protected JColorChooser tcc;
    protected JLabel banner;

    Color newColor;

    public ColorChooser() {
        super(new BorderLayout());

        newColor = new Color(0);

        //Set up the banner at the top of the window
        banner = new JLabel("Please Select Your Color!",
                JLabel.CENTER);
        banner.setForeground(Color.yellow);
        banner.setBackground(Color.blue);
        banner.setOpaque(true);
        banner.setFont(new Font("SansSerif", Font.BOLD, 24));
        banner.setPreferredSize(new Dimension(100, 65));

        JPanel bannerPanel = new JPanel(new BorderLayout());
        bannerPanel.add(banner, BorderLayout.CENTER);
        bannerPanel.setBorder(BorderFactory.createTitledBorder("Player Color Selector"));

        //Set up color chooser for setting text color
        tcc = new JColorChooser(banner.getForeground());
        tcc.getSelectionModel().addChangeListener(this);
        tcc.setBorder(BorderFactory.createTitledBorder(
                "Choose Player Color"));

        add(bannerPanel, BorderLayout.CENTER);
        add(tcc, BorderLayout.PAGE_END);
    }

    public void stateChanged(ChangeEvent e) {
        newColor = tcc.getColor();
        System.out.println(newColor);
        banner.setForeground(newColor);
    }

    public Color getColor() {
        System.out.println("getColor test");
        System.out.println(tcc.getColor());
        return tcc.getColor();
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    public /*static*/ JPanel createAndShowGUI() {
        //Create and set up the window.
        /*JFrame frame = new JFrame("ColorChooserDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
        JPanel panel = new JPanel();
        //Create and set up the content pane.
        ColorChooser newContentPane = new ColorChooser();
        newContentPane.setOpaque(true); //content panes must be opaque
        panel.add(newContentPane);

        return panel;
        //Display the window.
        /*frame.pack();
        frame.setVisible(true);*/
    }

    /*public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }*/
}
