import java.io.*;
import java.util.*;

public class main2 {
    public static void main(String args[]) throws Exception {

        File f = new File("test.txt");
        Scanner sc = new Scanner(f);

        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
}