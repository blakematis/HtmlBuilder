package enerdapt.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;
import java.util.logging.Logger;


/**
 * FileHandler is used for opening/closing Files and Reading and Writing to those files.
 * This handles all of the low level I/O.
 */
public class FileHandler implements IFileReader{
    private Scanner scanner;
    private String filePath;
    private File file;
    private Logger log = Logger.getLogger(getClass().getName());

    public FileHandler(String filePath){
        this.filePath = filePath;
        try{
            setFile(filePath);
            setScanner(file);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    @Override
    public void read() {
        if(file.canRead()){
            log.info("Attempting to read file");
            while(this.scanner.hasNext()){
                String currLine = scanner.nextLine();
                log.info(currLine);
            }
        }else{
            log.warning(file.getName() + " does not have proper read permissions");
        }
    }

    @Override
    public void write(OutputStream outputStream) {
        if(file.canWrite()){
            log.info("Attmepting to write to file");
            //TODO write to file.
        }else{
            log.warning(file.getName() + "does not have proper write permissions");
        }

    }

    /**
     *
     * @param file
     */
    @Override
    public void setScanner(File file)throws FileNotFoundException{
        this.scanner = new Scanner(file);
    }

    public File getFile(){
        return file;
    }

    @Override
    public void setFile(String filePath)throws FileNotFoundException{
        this.file = new File(filePath);
    }

    @Override
    public void closeFile() {

    }
}
