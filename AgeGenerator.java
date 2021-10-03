package Lesson6.homework;

import java.util.Random;

public class AgeGenerator {
    int age ;
    int downAge =19;
    int limitAge = 75;

    int ageGenerator(int downAge, int limitAge){
        age = downAge + (int) (Math.random()*75);
        return age ;
    }

}
