import java.util.Scanner;

public class TaskEight {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Задайте время от вспышки до грома в секундах: ");
        final int time = input.nextInt();

        System.out.print("Расстояние до удара молнии: " + time * 343 + "м.");

    }
}
