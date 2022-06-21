import java.util.Scanner;

public class TaskTen {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Задайте рост: ");
        double height = input.nextDouble();
        System.out.println("Задайте вес: ");
        double weight = input.nextDouble();
        if (height - 110 < weight) {
            System.out.println("Сбросить: " + (weight - (height - 110)));
        } else if (height - 110 == weight) {
            System.out.println("Вес в норме");
        } else {
            System.out.println("Набрать: " + (height - (weight + 110)));
        }


    }
}
