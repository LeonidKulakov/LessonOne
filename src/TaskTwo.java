import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введи трехзначное число N:");
        int n = input.nextInt();
        int s = 0;
        for (int i = 0; i < 3; i++) {
            s = s + n % 10;
            n = n / 10;
        }
        if (n == 0) {
            System.out.println("Сумма цифр равна: " + s);
        } else {
            System.out.println("Введено не трехзначное число");
        }
    }
}
