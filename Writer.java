package Lesson10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public class Writer {
    public static void main(String[] args) throws IOException {
        File writeFile = new File("/outFile.txt");
        List<String> content = Arrays.asList("some ","string","and ", "or"); //create object
        FileOutputStream fileOutputStream = new FileOutputStream(writeFile);  //create out stream
        for (String str : content){
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            fileOutputStream.write(bytes);//write content
        }
        fileOutputStream.flush(); //clean buffer
        fileOutputStream.close(); //close stream
    }
    }
