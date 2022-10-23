import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры целое число и выводит на экран следующие значения (каждое в отдельной строке):
// три целых числа, следующих за значением, введенным с клавиатуры.

public class Task2_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int number2 = number + 3;
        for(int i = number; i < number2; i++){
            int number3 = number + 1;
            System.out.println(number3);
            number++;
        }
    }
}
