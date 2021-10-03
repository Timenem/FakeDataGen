package Lesson6.homework;

import java.util.Random;

public class Apllication {
    public static void main(String...age){
        AgeGenerator ageGen  = new AgeGenerator();
        int people = 0 ;
        while (people <5 ){
            people ++;
            System.out.println(NameGenerator.nameGenerator()+" age "
                    + ageGen.ageGenerator(ageGen.downAge, ageGen.limitAge)
                    + " phone num " + PhoneGenerator.phoneGen(10));
        }
    }
}
