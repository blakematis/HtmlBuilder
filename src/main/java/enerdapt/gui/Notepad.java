package enerdapt.gui;

import java.io.IOException;
import java.util.logging.Logger;

public class Notepad {

    public Logger log = Logger.getLogger(Notepad.class.getName());

    public Notepad(String fileName){
        Runtime rs = Runtime.getRuntime();
        try{
            rs.exec("notepad " + fileName);
            log.info("Opened notepad and " + fileName);
        }catch (IOException e){
            log.severe("Unable to open notepad and " + fileName);
            e.printStackTrace();
        }
    }
}
