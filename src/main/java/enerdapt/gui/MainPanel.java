package enerdapt.gui;

import enerdapt.io.FileHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanel extends JPanel {

    private Label filePathLabel;
    private Button openFileChooserButton;
    private TextBox filePathTextBox;
    private FileChooser fileChooser;
    private FileHandler fileHandler;

    public MainPanel() {
        this.setLayout(new FlowLayout());
        setCenterComponents();
    }

    public void setCenterComponents() {
        filePathLabel = new Label("No File Loaded", this);
        fileChooser = new FileChooser();
        openFileChooserButton = new Button("Open File Explorer");
        fileHandler = null;
        this.add(filePathLabel);
        this.add(openFileChooserButton);
        this.add(fileChooser);
        fileChooser.setVisible(false);

        //If button is pressed it will open the fileChooser
        openFileChooserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(fileHandler != null){
                    fileHandler.closeFile();
                }
                fileChooser.setVisible(true);
                openFileChooserButton.setVisible(false);
            }
        });

        fileChooser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(fileChooser.isVisible()){
                    if(fileChooser.getSelectedFile() != null){
                        fileHandler = new FileHandler(fileChooser.getSelectedFile().getPath());
                        filePathLabel.setText("File Found: " +fileHandler.getFile().getPath());

                    }else{
                        fileHandler = null;
                        filePathLabel.setText("No File Loaded");

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
