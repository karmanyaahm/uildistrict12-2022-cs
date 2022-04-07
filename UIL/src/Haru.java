import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Haru {
    public static void main(String[] a) throws FileNotFoundException {
        FileReader f = new FileReader("haru.dat");
        Scanner s = new Scanner(f);

        int count = s.nextInt();

        for (int i = 0; i < count; i++) {

            System.out.println(casee(s));
        }
    }
    static String casee(Scanner s){
        int instrnum = s.nextInt();
        int p1x = s.nextInt();
        int p1y = s.nextInt();
        String p1is = s.next();
        int p2x = s.nextInt();
        int p2y = s.nextInt();
        String p2is = s.next();
        ArrayList<int[]> oldpos = new ArrayList<int[]>();
        oldpos.add(new int[]{p1x, p1y, p2x, p2y});


        for (int j = 0; j < instrnum; j++) {
            switch (p1is.toCharArray()[j]) {
                case 'U':
                    p1y++;
                    break;
                case 'D':
                    p1y--;
                    break;
                case 'L':
                    p1x--;
                    break;
                case 'R':
                    p1x++;
                    break;
            }
            switch (p2is.toCharArray()[j]) {
                case 'U':
                    p2y++;
                    break;
                case 'D':
                    p2y--;
                    break;
                case 'L':
                    p2x--;
                    break;
                case 'R':
                    p2x++;
                    break;
            }

            if (p1x == oldpos.get(oldpos.size()-1)[2] && p1y == oldpos.get(oldpos.size()-1)[3] && p2x == oldpos.get(oldpos.size()-1)[0] && p2y == oldpos.get(oldpos.size()-1)[1]) {
                return "HEAD ON";
            }
            oldpos.add(new int[]{p1x, p1y, p2x, p2y});
            if (p1x == oldpos.get(oldpos.size()-1)[2] && p1y == oldpos.get(oldpos.size()-1)[3] && p2x == oldpos.get(oldpos.size()-1)[0] && p2y == oldpos.get(oldpos.size()-1)[1]) {
                return "HEAD ON";
            }

            boolean p1safe = true;
            boolean p2safe = true;

            for (int[] is : oldpos){
                if (p1x == is[2] && p1y == is[3])
                    p1safe = false;
                if (p2x == is[0] && p2y == is[1])
                    p2safe = false;
                if ((p2x < 0 || p2x > 100)|| (p2y< 0 || p2y > 100))
                    p2safe = false;
                if ((p1x < 0 || p1x > 100)|| (p1y< 0 || p1y > 100))
                    p1safe = false;
            }

            if (p1safe == false && p2safe == false)
                return "DOUBLE SPIKE";
            if (p1safe == false )
                return "P2 WIN";
            if (p2safe == false)
                return "P1 WIN";




        }

        return "DRAW";
        }
}