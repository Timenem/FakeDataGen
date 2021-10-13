package Lesson10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) throws IOException {
        File readFile = new File("/outFile.txt");
        FileInputStream fist = new FileInputStream(readFile); //create input stream
        int size = fist.available(); //create arrays for read
        byte[] content = new byte[size]; //return len arrays
        fist.read(content);// read content
        StringBuilder sb = new StringBuilder();
        for (byte b : content)
            sb.append((char)b);

        System.out.println(sb.toString());
    }
}
