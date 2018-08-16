package enerdapt.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.util.Scanner;

public interface IFileReader {

    public abstract void read();

    public abstract void write(OutputStream outputStream);

    public abstract void setScanner(File file) throws  FileNotFoundException;

    public abstract void setFile(String filePath) throws FileNotFoundException;

    public abstract void setFile(File file) throws FileNotFoundException;

    public abstract void closeFile();

}
