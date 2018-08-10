package enerdapt.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public interface IFileReader {

    public abstract void read();

    public abstract void write();

    public abstract void setScanner(File file);

    public abstract File getFile(String filePath);

    public abstract void closeFile();

}
