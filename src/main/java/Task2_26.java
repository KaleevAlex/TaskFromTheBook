import java.time.LocalDate;
import java.util.Scanner;

public class Task2_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearBirth = scanner.nextInt();
        int yearNow = scanner.nextInt();
        System.out.println("Мне " + (yearNow - yearBirth) + " лет");
        System.out.println("////");

        System.out.println(yearsOld(yearBirth));
    }
    public static int yearsOld (int year){
        return LocalDate.now().getYear() - year;
    }
}
