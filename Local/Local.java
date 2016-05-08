import java.util.*;
import java.io.*;
import java.lang.*;

public class Local {
    
    public static void main(String[] args) throws IOException {
        
        Scanner s = new Scanner(new File("local_judge.dat"));
        
        int sets = s.nextInt();
        
        try {
            
            while(sets > 0) {
                
                int year = s.nextInt();
                
                int low = 0;
                int high = 0;
                
                for(int j = 0; j < 31; j++) {
                    
                    int temp = s.nextInt();
                    
                    if(temp > 50) {
                        
                        high++;
                    }
                    else if(temp < 32) {
                        
                        low++;
                    }
                }
                
                System.out.println(year + " " + low + " " + high);
                sets--;
                
            }
        }
        catch (Exception e) {
            // in case of last line being blank
        }
    }
}