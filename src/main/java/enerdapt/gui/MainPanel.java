package enerdapt.gui;

import enerdapt.io.FileHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanel extends JPanel {

    private Label filePathLabel;
    private Button button;
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
        button = new Button("Open File Explorer");
        fileHandler = null;
        this.add(filePathLabel);
        this.add(button);
        this.add(fileChooser);
        fileChooser.setVisible(false);

        //If button is pressed it will open the fileChooser
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileChooser.setVisible(true);
                button.setVisible(false);
            }
        });

        fileChooser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(fileChooser.isVisible()){
                    if(fileChooser.getSelectedFile() != null){
                        fileHandler = new FileHandler(fileChooser.getSelectedFile().getPath());
                        filePathLabel.setText("File Found: " +fileHandler.getFile().getPath());
                        fileChooser.setVisible(false);
                        button.setVisible(true);
                    }else{
                        fileHandler = null;
                        filePathLabel.setText("No File Loaded");
                        fileChooser.setVisible(false);
                        button.setVisible(true);
                    }
                }
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

    public Button getButton(){
        return button;
    }

    public void setButton(Button button){
        this.button = button;
    }

    public FileChooser getFileChooser() {
        return fileChooser;
    }

    public void setFileChooser(FileChooser fileChooser){
        this.fileChooser = fileChooser;
    }
}
