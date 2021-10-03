package Lesson6.homework;

// Java-программа генерирует случайную буквенно-цифровую строку
// используя метод Math.random ()
public class PhoneGenerator{
    // функция для генерации случайной строки длиной n
    static String phoneGen(int n) {
        // выбрал символ случайный из этой строки
        String AlphaNumericString ="0123456789";

        // создаем StringBuffer размером AlphaNumericString
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            // генерируем случайное число между
            // 0 переменной длины AlphaNumericString
            int index = (int)(AlphaNumericString.length() * Math.random());
            // добавляем символ один за другим в конец sb
            sb.append(AlphaNumericString.charAt(index));
        }

        return ("+7("+sb.substring(0,3)+")"+sb.substring(3,6)
                +"-"+sb.substring(6,8)+"-"+sb.substring(8,10));

    }

 }