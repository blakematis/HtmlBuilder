package enerdapt.gui;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;

public class EditorPane extends JEditorPane {

    public EditorPane(String filePath) throws IOException{
        super(filePath);
    }
}
