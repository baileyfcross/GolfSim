import java.io.FileNotFoundException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    private static Player mainPlayer = null;
    private static Menu startMenu = null;
    private static Menu mainMenu = null;
    public static void main(String[] args) throws FileNotFoundException {

        mainMenu = new Menu();
        mainMenu.mainMenu();
        mainMenuSelection(mainMenu);

        if(null != startMenu) {
            mainPlayer = new Player(startMenu.getPlayerName());
        }
    }

    private static void mainMenuSelection(Menu mainMenu) throws FileNotFoundException {
        boolean quitGameFlag = false;
        FileLoader fL = new FileLoader("testJSON.json");
        JSONparser jsonparser;

        while (!quitGameFlag) {
            switch (mainMenu.userInput()) {
                case "Start Game":
                    startMenu = new Menu();
                    startMenu.menuStart();
                case "Close Game":
                    quitGameFlag = true;
                    return;
                case "Credits":
                    mainMenu.print("Not Implmented Yet");
                case "Test":
                    jsonparser = new JSONparser(fL.getRefinedFile());
                default:
                    mainMenu.println("Invalid Answer, choose again");
            }
        }
    }

    public static Player getMainPlayer() {
        return mainPlayer;
    }

    public static void setMainPlayer(Player mainPlayer) {
        Main.mainPlayer = mainPlayer;
    }
}