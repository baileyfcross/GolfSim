import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileLoader {

    private StringBuilder refinedFile;

    public FileLoader(String fileName) throws FileNotFoundException {
        loadFile(fileName);
    }

    private StringBuilder loadFile(String fileName) throws FileNotFoundException{

        File myFile = new File(fileName);
        Scanner fileScanner = new Scanner(myFile);
        refinedFile = new StringBuilder();

        while (fileScanner.hasNextLine()) {
            String data = fileScanner.nextLine();
            refinedFile.append(data);
        }
        fileScanner.close();
        return refinedFile;
    }

    public StringBuilder getRefinedFile() {
        return refinedFile;
    }

    public void setRefinedFile(StringBuilder refinedFile) {
        this.refinedFile = refinedFile;
    }

}
