import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        System.out.println("Задайте годовой процент: ");
        double percentYear = input.nextDouble();
        double percentMonth = percentYear / 12;   // Высчитываем процент в месяц
        System.out.println("Задайте величину вклада: ");
        double contribution = input.nextDouble();
        for (int i = 0; i < 24; i++) {
            contribution = contribution + contribution * percentMonth / 100;  // Начисляем месячный процент на остаток по вкладу за месяц
        }
        System.out.print("Сумма вклада в банке через 2 года: ");
        System.out.printf("%.2f", contribution);
    }
}
