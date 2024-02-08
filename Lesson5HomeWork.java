package lesson5;

public class Lesson5HomeWork {
    public static void main(String[] args) {
        System.out.println("convert тугрик " + convert("тугрик"));
        System.out.println("dial X: " + dial('X'));
    }

    // Напишите функцию, которая реализует выбор цифры при нажатии
// на буквы на телефонном номеронаберателе. Функция должна
// принимать на вход символ и возвращать целое число.
// Буквам 'A','B','C' соответствует цифра 2, буквам 'D','E','F'
// соответствует 3, GHI 4, JKL 5 , MNO 6 , PQRS 7 , TUV 8 , WXYZ 9 -
// как на картинке ниже. Пример: 'P' -> 7
    public static int dial(char c) {
        return switch (c) {
            case 'A', 'B', 'C' -> 2;
            case 'D', 'E', 'F' -> 3;
            case 'G', 'H', 'I' -> 4;
            case 'J', 'K', 'L' -> 5;
            case 'M', 'N', 'O' -> 6;
            case 'P', 'Q', 'R', 'S' -> 7;
            case 'T', 'U', 'V' -> 8;
            case 'W', 'X', 'Y', 'Z' -> 9;
            default -> -1;



        };


    }

    public static String convert(String s) {
        return switch (s) {
            case "йена" ->"JPY";
            case "фунт" -> "GBP";
            case "доллар" -> "USD";
            case "евро" -> "EUR";
            case "тугрик" -> "MNT";
            default -> "не знаю";


        };

    }
}
