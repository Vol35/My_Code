import java.util.Scanner;

public class Lesson_3_2 {
    public static void main(String[] args) {
        System.out.print("Введите сумму в рублях: ");
        double rub = new Scanner(System.in).nextDouble();
        // 1 рубль = 0.0091 usd
        double courseUsd = 0.0091;
        // 1 рубль = 0.0095 eur
        double courseEur = 0.0095;
        System.out.println("Сумма в USD = " + rub*courseUsd);
        System.out.println("Сумма в EUR = " + rub*courseEur);
    }
}
