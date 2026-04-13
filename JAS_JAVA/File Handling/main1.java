import java.io.*;

public class main1 {
    public static void main(String args[]) throws Exception {

        FileWriter fw = new FileWriter("test.txt");
        fw.write("Hello Java");
        fw.close();

        System.out.println("Data written");
    }
}