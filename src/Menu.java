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

            if(userInputIgnoresEqualYesOrNo("Re-type your name: ")){
                setPlayerName(this.tempPlayerName);
                setPlayerNameFlag(true);
                break;
            }
            userSumbmittedName();
        }

        print("Would you like to make a new Golfer? ");
        if(userInputIgnoresEqualYesOrNo("")){
            Golfer tempNewGolfer = new Golfer();
            tempNewGolfer.createNewGolfer();

        }
    }

    protected boolean userInputIgnoresEqualYesOrNo(String elsePrintStatement) {
        if (userInput().equalsIgnoreCase(YES)) {
            return true;
        } else {
            print(elsePrintStatement);
            return false;
        }
    }

    protected String userInput() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    protected void userSumbmittedName(){
        this.tempPlayerName = userInput();
        println(sumbmittedName(tempPlayerName));
    }

    private String sumbmittedName(String userName){
        return "You submitted " +
                userName +
                " is this correct?";
    }

    protected void println(String userText){
        System.out.println(userText);
    }
    protected void print(String userText){
        System.out.print(userText);
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public boolean isPlayerNameFlag() {
        return playerNameFlag;
    }

    public void setPlayerNameFlag(boolean playerNameFlag) {
        this.playerNameFlag = playerNameFlag;
    }
}
