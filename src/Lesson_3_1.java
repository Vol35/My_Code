import java.util.Scanner;

public class Lesson_3_1 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        double enter = sc.nextDouble();
        double f = enter * 1.8 + 32;
        System.out.println("Градусы Фаренгейта = " + f );
    }
}