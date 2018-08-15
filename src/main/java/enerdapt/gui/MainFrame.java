package enerdapt.gui;

import javax.swing.*;
import java.awt.*;


/** Main JFrame of the application
 *
 */
public class MainFrame extends JFrame {

    /**
     * Constructor set the title, dimensions,
     * layout, and visibility of the JFrame.
     */
    private MainPanel mainPanel;

    public MainFrame(){
        super("EnerDapt HTML Builder");
        this.setSize(800, 1000);
        mainPanel = new MainPanel();
        this.setContentPane(mainPanel);
        this.setVisible(true);
    }

}
