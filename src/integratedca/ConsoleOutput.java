
package integratedca;

import java.util.List;

/**
 *
 * @author lsant
 */
public class ConsoleOutput implements ListOutputInterface {
    public ConsoleOutput(){}
    @Override
    public boolean listOutputData(List<String[]> generalList){
        for (int list = 0; list < generalList.get(0).length; list ++){
//            System.out.println(data.get(0)[list]);
       //Loops the movies and gets the elements on the array
       // string[]
        for (int result = 0; result < generalList.size(); result ++){ 
              //  System.out.println(data.get(result)[list]);
               // System.out.println(movieList.get(list)[result]);
                try {
//                   String test = generalList.get(list)[result];
//                   System.out.println(test);
                   System.out.println(generalList.get(list)[result]);
               } catch (ArrayIndexOutOfBoundsException e) {
////                    System.out.println( movieList.get(list));
System.out.println(list + " ::: " + result);
//                }
                
                
            }
        
       
        
        }
        
        
    
        }
        return true;
       
    }
}
