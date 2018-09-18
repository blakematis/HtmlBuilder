package enerdapt.gui;

import javax.swing.*;
import java.awt.*;


public class Button extends JButton {

    public Button(String status) {
        super(status);
        this.setForeground(Color.getHSBColor(10,20,40));
    }

}
