import java.util.*;
import java.io.*;
import java.lang.*;

public class PhoneNumbers {
    
    public static void main(String[] args) throws IOException {
        
        Scanner s = new Scanner(new File("phonenumbers_judge.dat"));
        
        int sets = s.nextInt();
        int runs = 0;
        
        try {
            while(sets >= runs) {
            
                String number = s.next();
                
                if(number.length() != 12) {
                    
                    System.out.println("INVALID PHONE NUMBER");
                }
                else if(!isParsable(number.substring(0,2)) || !isParsable(number.substring(4,6)) || !isParsable(number.substring(8,11))) {

                    System.out.println("INVALID PHONE NUMBER");
                }
                else if (!number.substring(3,4).equals("-") || !number.substring(7,8).equals("-")) {

                    // System.out.println(number.substring(3,4));
                    // System.out.println(number.substring(7,8));
                    System.out.println("INVALID PHONE NUMBER");
                }
                else {
                    System.out.println(number);
                }
            }
        }
        catch(Exception e) {
            // Exclude last line
        }
        
    }
    
    public static boolean isParsable(String input) {
        
        boolean parsable = true;
        
        try {
            
            Integer.parseInt(input);
        }
        catch (NumberFormatException e) {
            
            parsable = false;
        }
        
        return parsable;
    }

}