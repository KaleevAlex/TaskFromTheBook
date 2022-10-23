//Задание 2.23
//Напишите класс, который принимает с клавиатуры два целых числа и
//выводит на экран следующие значения (каждое в отдельной строке):
//квадрат каждого числа (отдельно) и сумму квадратов введенных чисел.

import java.util.Scanner;

public class Task2_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println(pow(number1, 2));
        System.out.println(pow(number2, 2));
        System.out.println(sum(pow(number1, 2), pow(number2, 2)));

    }

    public static int pow (int value, int powValue){
        if (powValue == 1){
            return value;
        }else {
            return value * pow(value, powValue - 1);
        }
    }

    public static int sum (int a, int b){
        return a + b;
    }
}
