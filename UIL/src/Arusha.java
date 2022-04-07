import java.io.*;
import java.util.Scanner;

public class Arusha {
    public static void main(String[] a) throws FileNotFoundException{
FileReader f = new FileReader("arusha.dat");
Scanner s= new Scanner(f);
        int count = s.nextInt();

        for (int i  = 0; i < count; i++){
            String data = s.next();
            String ops = s.next();
            for (char c : ops.toCharArray()){
                if (c == 'L')
                    data = lrot(data);
                else if (c == 'R')
                    data = rrot(data);
                else
                    System.out.println("AAAAAAAAAA");
            }
            System.out.println(data);
        }



    }
    static String lrot(String s) {
        return s.substring(1)+ s.charAt(0);
    }
    static String rrot(String s) {
        return s.substring(s.length() - 1)+ s.substring(0,s.length()-1);
    }
}
