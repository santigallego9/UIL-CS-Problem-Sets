import java.util.*;
import java.io.*;
import java.lang.*;

public class Qualified {
    
    public static void main(String[] args) throws IOException {
        
        Scanner s = new Scanner(new File("qualified_judge.dat"));
        
        s.nextLine();
        
        try {
            while(s.hasNextLine()) {
         
                // System.out.println(s.next() + " " + s.nextInt() + " " + s.next());
                
                String school = s.next();
                int score = s.nextInt();
                String contest = s.next();
                
                switch (contest) {
                        
                    case "STC":
                        if(score >= 560)
                            System.out.println(school);
                        break;
                        
                    case "WTC":
                        if(score >= 340)
                            System.out.println(school);
                        break;
                        
                    case "NTC":
                        if(score >= 420)
                            System.out.println(school);
                        break;
                        
                    case "CTC":
                        if(score >= 370)
                            System.out.println(school);
                        break;
                        
                    case "LVC":
                        if(score >= 470)
                            System.out.println(school);
                        break;
                        
                    default:
                        System.out.println("ERROR");
                }
            }
        }
        catch (Exception e) {
            // in case of last line being blank
        }
    }
}