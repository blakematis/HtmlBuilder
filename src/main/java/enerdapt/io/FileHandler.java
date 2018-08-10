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
    private String fileName;

    public FileHandler(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void read() {

    }

    @Override
    public void write() {

    }

    @Override
    public void setScanner(File file) throws FileNotFoundException{
        try{
            this.scanner = new Scanner(file);
        }catch (FileNotFoundException e){
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override
    public File getFile(String fileName)
    {
        return new File(fileName);
    }

    @Override
    public void closeFile() {

    }
}
