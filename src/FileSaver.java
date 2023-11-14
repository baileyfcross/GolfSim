import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FileSaver {

    public FileSaver (File file) throws FileNotFoundException, UnsupportedEncodingException {
        saveFile(file);
    }

    private void saveFile(File file) throws FileNotFoundException, UnsupportedEncodingException {
        if(null != Main.getMainPlayer()) {
            PrintWriter pr = new PrintWriter(Main.getMainPlayer().getPlayerName(), "UTC-8");

        }
    }
}
