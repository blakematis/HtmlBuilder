package enerdapt.gui;

import javax.swing.*;

public class FileChooser extends JFileChooser{

    public FileChooser(){
        this.setSize(this.getParent().getWidth()-10, (int)this.getParent().getHeight()-10);
    }
}
