public class Golfer {
    private String Gender = "";
    private String Handiness = "";

    public Golfer () {

    }


    public void createNewGolfer(){
        Menu golferCreation = new Menu();

        golferCreation.println("What would you like to call your Golfer?: ");
        do {
            golferCreation.userSumbmittedName();
        } while (!golferCreation.userInputIgnoresEqualYesOrNo("Re-type your golfers name: "));
        golferCreation.println("Are they left or right handed?: ");

    }
    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }


}
