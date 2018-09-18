package enerdapt.gui;

import enerdapt.io.FileHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeListenerProxy;
import java.util.logging.Logger;

public class MainPanel extends JPanel {

    private Label filePathLabel;
    private Button newFileButton;
    private Button openFileChooserButton;
    private Button homeButton;
    private TextBox filePathTextBox;
    private FileChooser fileChooser;
    private FileHandler fileHandler;
    private Notepad notepad;
    private Logger log = Logger.getLogger(Logger.class.getName());

    public MainPanel() {
        this.setLayout(new FlowLayout());
        setCenterComponents();
    }

    public void setCenterComponents() {
        filePathLabel = new Label("No File Loaded", this);
        fileChooser = new FileChooser();
        fileChooser.setSize(this.getHeight()-20, this.getWidth()-20);
        openFileChooserButton = new Button("Load Existing");
        homeButton = new Button("Home");
        newFileButton = new Button("New");
        fileHandler = null;

        this.add(homeButton);
        this.add(newFileButton);
        this.add(filePathLabel);
        this.add(openFileChooserButton);
        this.add(fileChooser);
        fileChooser.setVisible(false);

        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileChooser.setVisible(false);
                newFileButton.setVisible(true);
                openFileChooserButton.setVisible(true);
                try {
                    fileHandler.closeFile();
                    filePathLabel.setText("No File Loaded");
                }catch (NullPointerException ex){
                    log.warning(ex.getMessage());
                    filePathLabel.setText("No File Loaded");
                }
            }
        });

        //If button is pressed it will open the fileChooser
        openFileChooserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(fileHandler != null){
                    fileHandler.closeFile();
                }
                fileChooser.setVisible(true);
                newFileButton.setVisible(false);
                openFileChooserButton.setVisible(false);
            }
        });

        fileChooser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(fileChooser.isVisible()) {
                    if (fileChooser.getSelectedFile() != null) {
                        fileHandler = new FileHandler(fileChooser.getSelectedFile().getPath());
                        filePathLabel.setText("File Found: " + fileHandler.getFile().getPath());
                        notepad = new Notepad(fileHandler.getFile().getPath());
                        newFileButton.setVisible(false);
                    }else{
                        fileHandler = null;
                        filePathLabel.setText("No File Loaded");
                        fileChooser.setVisible(true);
                    }
                }
                fileChooser.setVisible(false);
                openFileChooserButton.setVisible(true);

            }
        });
    }

    //accessors
    public Label getFilePathLabel(){
        return filePathLabel;
    }

    public void setFilePathLabel(Label filePathLabel){
        this.filePathLabel = filePathLabel;
    }

    public Button getFileChooserButton(){
        return openFileChooserButton;
    }

    public void setFileChooserButton(Button button){
        this.openFileChooserButton = button;
    }

    public FileChooser getFileChooser() {
        return fileChooser;
    }

    public void setFileChooser(FileChooser fileChooser){
        this.fileChooser = fileChooser;
    }
}
