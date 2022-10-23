public class Task2_8 {
    public static void main(String[] args) {
        int x = 6;
        System.out.println("X: " + x + " квадрат X : " + Math.pow(x, 2) +" куб X: " + Math.pow(x, 3));
        System.out.println(pow(2, 3));
        System.out.println(factorial(3));

    }

    public static int pow(int value, int powValue) {
        if (powValue == 1) {
            return value;
        } else {
            return value * pow(value, powValue - 1);
        }
    }

    public static int factorial(int value) {
        if (value == 1) {
            return value;
        } else {
            return value * factorial(value - 1);
        }
    }



}
