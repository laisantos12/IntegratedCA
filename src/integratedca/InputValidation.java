
package integratedca;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lsant
 */
public class InputValidation {
    //Method to validate the input
    //List of String
    public static List<String[]> validateInput(String filename) throws IOException{
        
    ListInputInterface dataInput = new ListFileInput (filename);
    dataInput.nextLine();
    String[] lineArr;
    List<String[]> generalList = new ArrayList();
    String line;
       //Parses the file
       //Keeps reading while has line
    while ((line = dataInput.nextLine()) != null){
        int counter = 0;
        counter++;
        if (counter == 1010) {
            System.out.println(line);
        }
            lineArr = line.split(",");
            generalList.add(lineArr);
            //Prints the first element of the array
//            System.out.println(lineArr[0]);
        }
        return generalList;
    }
}