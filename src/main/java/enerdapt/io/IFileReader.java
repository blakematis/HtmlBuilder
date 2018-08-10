package enerdapt.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public interface IFileReader {

    public abstract void read();

    public abstract void write();

    public abstract void setScanner(File file)throws FileNotFoundException;

    public abstract File getFile(String fileName);

    public abstract void closeFile();

}
