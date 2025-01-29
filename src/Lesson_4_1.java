import java.util.Scanner;

public class Lesson_4_1 {
    public static void main(String[] args) {
        System.out.println("Калькулятор суммы");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        double x = sc.nextDouble();
        System.out.print("Введите второе число: ");
        double y = sc.nextDouble();
        System.out.println("Сумма чисел равна = " + (x+y));

        System.out.println("Калькулятор разницы");
        Scanner s = new Scanner(System.in);
        System.out.print("Введите число: ");
        double a = s.nextDouble();
        System.out.print("Введите второе число: ");
        double b = s.nextDouble();
        System.out.println("Разница чисел равна = " + (a-b));

        System.out.println("Калькулятор деления");
        Scanner c = new Scanner(System.in);
        System.out.print("Введите число: ");
        double d = c.nextDouble();
        System.out.print("Введите второе число: ");
        double v = c.nextDouble();
        System.out.println("Сумма чисел равна = " + (d/v));
    }
}
