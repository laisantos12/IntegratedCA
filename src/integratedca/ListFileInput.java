
package integratedca;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lsant
 */
//Reads the file
public class ListFileInput implements ListInputInterface {
     private BufferedReader myReader;
    
    public ListFileInput(String filename) throws FileNotFoundException, IOException{
        
        myReader = new BufferedReader(new FileReader(filename));
    }
    @Override
    public String nextLine(){
        try {
            return myReader.readLine();
        } catch (IOException ex) {
            Logger.getLogger(ListFileInput.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }   
}
