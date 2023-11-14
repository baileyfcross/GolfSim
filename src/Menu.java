import java.util.Scanner;

public class Menu {
    private String menuText;
    private String playerName;
    private String tempPlayerName;
    private boolean playerNameFlag = false;
    private final static String YES = "yes";
    public Menu (){
        menuText = "";
    }
    public void menuStart(){
        StringBuilder mainMenu = new StringBuilder();

        println("Welcome to Golf Sim");
        print("Please type your name here: ");

        userSumbmittedName();

        while(!playerNameFlag) {
            if (userInput().equalsIgnoreCase(YES)) {
                this.playerName = this.tempPlayerName;
                playerNameFlag = true;
                return;
            } else {
                print("Re-type your name: ");
            }
            userSumbmittedName();
        }
    }

    private String userInput() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    private void println(String userText){
        System.out.println(userText);
    }
    private void print(String userText){
        System.out.print(userText);
    }

    private void userSumbmittedName(){
        this.tempPlayerName = userInput();
        println(sumbmittedName(tempPlayerName));
    }

    private String sumbmittedName(String userName){
        return "You submitted " +
                userName +
                " is this correct?";
    }
}
