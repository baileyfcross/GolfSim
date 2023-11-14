import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JSONparser {
    private final StringBuilder file;
    public JSONparser (StringBuilder file){
        this.file = file;
    }

    public void parse() throws FileNotFoundException {
        System.out.println(file.toString());
    }
}
