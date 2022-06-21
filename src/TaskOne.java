import java.util.Scanner;

public class TaskOne {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введи Х:");
        int x = input.nextInt();
        System.out.println("Введи Y:");
        int y = input.nextInt();
        System.out.println("Результат целочисленного деления: " + x / y);
        System.out.println("Остаток от деления: " + x % y);
        System.out.println("Квадратный корень чиста Х: " + Math.sqrt(x));
    }
}
