import java.util.Scanner;

public class TaskTwelve {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число учащихся: ");
        int n = input.nextInt();
        int pie100 = n + n;
        int milk100 = (int) Math.ceil(n * 0.2 / 0.9);
        int pie60 = n + (int) Math.ceil(n * 0.6);
        int milk60 = (int) Math.ceil(n * 0.6 * 0.2 / 0.9);
        int pie1 = n + (int) Math.ceil(n * 0.01);
        int milk1 = (int) Math.ceil(n * 0.01 * 0.2 / 0.9);

        System.out.println("Пирожков при 100% = " + pie100);
        System.out.println("Молока при 100% = " + milk100);
        System.out.println("Пирожков при 60% = " + pie60);
        System.out.println("Молока при 60% = " + milk60);
        System.out.println("Пирожков при 1% = " + pie1);
        System.out.println("Молока при 1% = " + milk1);


    }
}
