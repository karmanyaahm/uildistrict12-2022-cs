import java.io.*;
import java.util.Scanner;


public class Facundo {
    public static void main(String[] a) throws FileNotFoundException {
        FileReader f = new FileReader("facundo.dat");
        Scanner s = new Scanner(f);

        int count = s.nextInt();

        for (int i = 0; i < count; i++) {
            String cards = s.next();

            int shufs = s.nextInt();

            for (int j = 0; j < shufs; j++){
                cards = shuffle(cards);
            }
            System.out.println(cards);

        }
    }
    static String shuffle(String inp) {
        int c = inp.length() / 2 ;
        if (inp.length() %2  == 1) c ++;
        String up = inp.substring(0, c);
        String lower = inp.substring(c);
        String ans = "";
//System.out.println(up);
      //  System.out.println(lower);

        for (int i = 0; i < up.length(); i++){
            if (inp.length() %2  == 1)            ans += up.substring(i,i+1);

            if (i < lower.length())
            ans += lower.substring(i, i+1);
            if (inp.length() %2  == 0)            ans += up.substring(i,i+1);


        }
        return ans;
    }
}