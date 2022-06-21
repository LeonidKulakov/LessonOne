import java.util.Scanner;

public class TaskNine {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Задайте число: ");
        double n = input.nextDouble();
        if (n - Math.floor(n) == 0) {
            System.out.println("Число целое");
        } else {
            System.out.println("Число вещественное");
        }
    }
}
