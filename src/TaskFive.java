import java.util.Scanner;

public class TaskFive {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введи радиус R:");
        final double r = input.nextDouble();
        System.out.println("Длина окружности: " + Math.PI * r * 2);
        System.out.println("Площадь круга: " + Math.PI * Math.pow(r, 2));
    }


}
