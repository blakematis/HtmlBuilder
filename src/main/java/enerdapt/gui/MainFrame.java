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
    private Label filePathLabel;

    public MainFrame(){
        super("EnerDapt HTML Builder");
        this.setSize(800, 1000);

        this.setLayout(new BorderLayout());

        setCenterComponents();

        this.setVisible(true);
    }

    public void setCenterComponents(){
        filePathLabel = new Label("Enter the HTML file path", this);
        this.add(filePathLabel, BorderLayout.CENTER);

    }

}
