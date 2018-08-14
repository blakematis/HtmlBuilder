package enerdapt.gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class Label extends JLabel {

    private BeveledBorder beveledBorder;

    public Label(String text, Component parent){
        this.beveledBorder = new BeveledBorder();
        this.setText(text);
    }
}
