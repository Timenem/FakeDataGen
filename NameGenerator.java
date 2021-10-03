package Lesson6.homework;

import java.util.Locale;
import java.util.Random;
public class NameGenerator {

static String nameGenerator(){
        int maxLen=12;
        // нижний предел для строчных букв
        int lowerLimit = 97;
        // нижний предел для строчных букв
        int upperLimit = 122;
        Random random = new Random();
        // Создать StringBuffer для сохранения результата
        StringBuffer buf = new StringBuffer(maxLen);
        for (int i = 0; i < maxLen ; i++) {
        // принимаем случайное значение от 97 до 122
        int nextRandomChar = lowerLimit + (int)(random.nextFloat() * (upperLimit - lowerLimit + 1));
        // добавить символ в конце bs
        buf.append((char)nextRandomChar);
        }
        // возвращаем результирующую строку
    //return buf.toString().substring(0,1).toUpperCase()+buf.substring(1).toLowerCase();
        return buf.toString().substring(0,1).toUpperCase()+buf.substring(1).toLowerCase();
        }

public static void main(String[] args) {
        // размер случайной буквенно-цифровой строки
        // Получить и отобразить буквенно-цифровую строку
        System.out.println(nameGenerator());
    }
}