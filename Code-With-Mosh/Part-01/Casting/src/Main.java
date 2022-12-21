import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // byte > short > int > int > long > float > double

        //implicit casting
//        short x = 1;
//        int y = x + 2;
//        double x = 1.1;
//        double y = x + 2; // 1.1 + 2.0

//        explicit casting
//        double x = 1.1;
//        int y = (int)x + 2;

//        invalid casting
//        String x = "1";
//        int y = (int)x + 2;

//        String x = "1";
//        int y = Integer.parseInt(x) + 2; // wrapper class for int type

        String x = "1.1";
        double y = Double.parseDouble(x) + 2; // wrapper class for int type

        System.out.println(y);
    }
}