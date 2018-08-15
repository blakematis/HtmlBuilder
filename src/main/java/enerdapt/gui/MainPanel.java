package enerdapt.gui;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {

    private Label filePathLabel;
    private TextBox filePathTextBox;

    public MainPanel() {
        this.setLayout(new BorderLayout());
        setCenterComponents();
    }

    public void setCenterComponents() {
        filePathLabel = new Label("Enter the HTML file path", this);
        filePathTextBox = new TextBox("");

        this.add(filePathLabel, BorderLayout.CENTER);
        this.add(filePathTextBox, BorderLayout.CENTER);
    }
}
