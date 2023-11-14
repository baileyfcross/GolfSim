import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;


public class JSONparser {
    private final StringBuilder file;
    public JSONparser (StringBuilder file) throws FileNotFoundException {
        this.file = file;
        parse(file);
    }

    public void parse(StringBuilder file) throws FileNotFoundException {
        String tempSbFile = file.toString();


        String[] objects = tempSbFile.split(",");
        String [] newObjects = scrubber(objects);

        ArrayList<String> keys = new ArrayList<String>(Arrays.asList(newObjects));
        for (int i = 0; i < newObjects.length; i++) {
            System.out.println(newObjects[i]);
        }
    }

    private String[] scrubber(String[] objects) {
        String[] newObjects = new String[objects.length * 2];

        int counter = 0;
        int tempFrontIndex = -1;
        int newObjectSplitCounter = 0;
        char[] tempCharArray;
        for (int i = 0; i < objects.length; i++) {
            tempCharArray = objects[i].toCharArray();
            for (int j = 0; j < tempCharArray.length; j++) {
                if (tempCharArray[j] == '"') {
                    if(counter == 0) {
                        tempFrontIndex = j;
                        counter++;
                    } else {
                        String tempString = objects[i].substring(tempFrontIndex + 1,j);
                        newObjects[newObjectSplitCounter] =  tempString;
                        counter = 0;
                        newObjectSplitCounter++;
                    }
                }
            }
        }
        return newObjects;
    }
}
