import java.io.*;
import java.util.Scanner;
import java.util.Set;

public class Catherine {
    public static void main(String[] a) throws FileNotFoundException {
        FileReader f = new FileReader("catherine.dat");
        Scanner s = new Scanner(f);

        int count = s.nextInt();

        for (int i  = 0; i < count; i++) {
            String correct =  s.next();
            String inp = s.next();
            String ans = "";

            for (int j = 0; j < 5; j ++){
                if (inp.substring(j, j+1).equals(correct.substring(j, j+1)))
                    ans += inp.substring(j,j+1).toUpperCase();
                else if (correct.contains(inp.substring(j,j+1)))
                    ans += inp.substring(j,j+1);
                else ans += "*";
            }
            System.out.println(ans);
        }

        }


}
