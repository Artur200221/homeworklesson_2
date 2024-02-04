package lesson3;

public class Lesson3HomeWork {
    public static void main(String[] args) {
        //Написать функцию, которая принимает на вход 3 параметра - имя, фамилию и возраст и выводит их на экран построчно;
        // строки перевести в верхний регистр
         printNameAge("Max","Kotkov", 28 );
         // Вырезать из строки "Вход запрещен сегодня" второе слово и заменить его на "разрешен".
        String message =  "Вход запрещен сегодня";
        System.out.println(message.replace("запрещен", "разрешен"));

        System.out.println("radius 2: " +circleLength(2));
    }
    // Написать функцию для вычисления длины окружности, принимающую радиус
    public static double circleLength(double r){
        double s = 2*3.14159*r;
        return s;
    }


     public static void printNameAge(String first, String last, int age) {
         System.out.println("first name: " + first.toUpperCase());
         System.out.println("last name: " + last.toUpperCase() );
         System.out.println("age: " + age);
     }

}
