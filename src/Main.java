// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static Player mainPlayer = null;
    private static Menu startMenu = null;
    private static Menu mainMenu = null;
    public static void main(String[] args) {

        mainMenu = new Menu();
        mainMenu.mainMenu();
        mainMenuSelection(mainMenu);

        if(null != startMenu) {
            mainPlayer = new Player(startMenu.getPlayerName());
        }
    }

    private static void mainMenuSelection(Menu mainMenu){
        boolean quitGameFlag = false;

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
                default:
                    mainMenu.println("Invalid Answer, choose again");
            }
        }
    }
}