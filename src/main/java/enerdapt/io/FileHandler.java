package enerdapt.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 * FileHandler is used for opening/closing Files and Reading and Writing to those files.
 * This handles all of the low level I/O.
 */
public class FileHandler implements IFileReader{
    private Scanner scanner;
    private String filePath;

    public FileHandler(String filePath){
        this.filePath = filePath;
    }

    @Override
    public void read() {

    }

    @Override
    public void write() {

    }

    /**
     *
     * @param file
     */
    @Override
    public void setScanner(File file){
        try{
            this.scanner = new Scanner(file);
        }catch (FileNotFoundException e){
            throw new NullPointerException(e.getMessage());
        }
    }

    @Override
    public File getFile(String filePath)
    {
        File file = new File(filePath);
        if(file.exists()){
            return file;
        }
        return null;
    }

    @Override
    public void closeFile() {

    }
}
