import java.util.Scanner;

public class TaskThree {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введи вещественное число N:");
        double n = input.nextDouble();
        long i = Math.round(n);
        System.out.println("Целая часть: " + i);
        System.out.print("Вычисление другим способом: ");
        System.out.printf("%.0f", n);
    }
}