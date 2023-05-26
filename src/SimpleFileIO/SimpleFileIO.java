package src.SimpleFileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.PrintWriter;
import java.util.Scanner;

public class SimpleFileIO {
    public static void main(String[] args) throws Exception {
        FileWriter obj = new FileWriter("test.txt");
        PrintWriter out = new PrintWriter(obj);
        out.println("this is a line in my file...");
        out.println("a second line in my file...");
        out.println("a third line in my file...");
        out.flush(); //it forces everything that is still pending to be written to the file
        out.close();
        //when we run this program at this point, it creates test.txt for us!!!
        //and it includes those three lines

        FileReader obj1 = new FileReader("test.txt");
        BufferedReader b = new BufferedReader(obj1);
        Scanner sc = new Scanner(b);

        while(sc.hasNextLine()){ //we don't know how many lines are there.
            System.out.println(sc.nextLine());
        }

    }
}
