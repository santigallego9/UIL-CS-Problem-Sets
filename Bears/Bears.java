import java.util.*;
import java.io.*;
import java.lang.*;

public class Bears {
    
    public static void main(String[] args) throws IOException {
        
        Scanner s = new Scanner(new File("bears_judge.dat"));
        
        int sets = s.nextInt();
        
        try {
            
            while(sets > 0) {
                
                int bears = 0;

                for(int j = 0; j < 10; j++) {
                
                    String hab = s.next();
                
                    for(int i = 0; i < hab.length(); i++) {
                    
                        if(hab.charAt(i) == 'B') {
                        
                            bears++;
                        }
                    }
                }
            
                System.out.println(bears);
                sets--;
            
            }
        }
        catch (Exception e) {
            // in case of last line being blank
        }
    }
}