package enerdapt.gui;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {

    private Label filePathLabel;
    private TextBox filePathTextBox;
    private FileChooser fileChooser;

    public MainPanel() {
        this.setLayout(new BorderLayout());
        setCenterComponents();
    }

    public void setCenterComponents() {
        filePathLabel = new Label("Enter the HTML file path", this);
        filePathTextBox = new TextBox("");
        fileChooser = new FileChooser();

        this.add(filePathLabel, BorderLayout.NORTH);
        this.add(fileChooser, BorderLayout.CENTER);
        this.add(filePathTextBox, BorderLayout.SOUTH);

    }
}
