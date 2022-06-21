import java.util.Scanner;

public class TaskEleven {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите время в секундах: ");
        long timeSecond = input.nextLong();
        final int timeDay = 60 * 60 * 24;   //Секунд в дне
        int day = (int) Math.floor(timeSecond / timeDay);  //Вычисление целых дней
        double lastDay = Math.ceil(timeSecond - day * timeDay);    //Остаток секунд
        final int timeClock = 60 * 60;  //Секунд в часе
        int clock = (int) Math.floor(lastDay / timeClock);  //  Вычисление целых часов
        double lastClock = Math.ceil(lastDay - clock * timeClock);   //Остаток секунд
        final int timeMinute = 60;   // Секунд в минуте
        int minute = (int) Math.floor(lastClock / timeMinute);   //Вычисление целых минут
        int second = (int) Math.ceil(lastClock - minute * timeMinute);//Остаток секунд


        System.out.println("До нового года осталось: " + day + " дней, " + clock + " часов, " + minute + " минут, " + second + " секунд.");

    }
}
