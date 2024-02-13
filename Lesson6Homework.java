package lesson6;

import com.sun.source.tree.BreakTree;

public class Lesson6Homework {
    public static void main(String[] args) {
        System.out.println("7-3: " + calc(7, 3, '-'));
        printDigits(27);
    } //main
    // Напишите функцию, которая принимает параметр А и перебирает все числа
// от 1 до A с шагом 1 и печатает только числа, кратные 5, 7 или 13
    public static void printDigits(int a) {
        for(int i = 1; i <= a; i++) {
            if(i % 5 == 0 || i % 7 == 0 || i % 13 == 0)
                System.out.println("i: " + i);
            
        }
    }
    // Напишите функцию-калькулятор. Должна принимать два числа double и
// операцию над ними - символ '*', '/', '+' или '-' и возвращать
// результат этой операции. Пример: 7,3,'-' -> 4
    public static double calc(double a, double b, char c) {
        switch (c) {
            case '*':
                return a * b;
            case '/':
                return a / b;
            case '+':
                return a + b;
            case '-':
                return a - b;
            default:
                return -1;
        }
    }

}
