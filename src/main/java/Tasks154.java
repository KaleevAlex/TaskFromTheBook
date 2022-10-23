import java.util.Scanner;

public class Tasks154 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int number = scanner.nextInt();
        for (int i = 0; i <= 3; i++){
            int number2 = scanner.nextInt();
            if (number2 > number){
                count++;
            }
            number = number2;
        }
        System.out.println(count);
    }
}

