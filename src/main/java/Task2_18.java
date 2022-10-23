import java.util.Scanner;

public class Task2_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Task2_18 task2_18 = new Task2_18();
        int number1= task2_18.pow(number, 2);
        int number2 = task2_18.pow(number, 3);
        System.out.println(number1 + " & " + number2);
    }

    public int pow (int value, int powValue){
        if (powValue == 1){
            return value;
        }else{
            return value * pow(value, powValue - 1);
        }
    }
}
