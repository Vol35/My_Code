import java.util.Scanner;
public class Lesson_6_1 {
    public static void main(String[] args) {
        System.out.println("\n\t\t\t***Программа определения весов товаров***\n");

        System.out.println("Введите первый вес: ");
        double first = new Scanner(System.in).nextDouble();

        System.out.println("Введите второй вес: ");
        double second = new Scanner(System.in).nextDouble();

        System.out.println("Введите третий вес: ");
        double third = new Scanner(System.in).nextDouble();

        double greatest = 0;
        double average = 0;
        double smallest = 0;
        //todo дописать логику программы ниже.
        if(first > second && first > third) {
            greatest = first;
        } else if (first < second && first < third) {
            smallest = first;
        } else {
            average = first;
        }
        if(second > first && second > third) {
            greatest = second;
        } else if (second < first && second < third) {
            smallest = second;
        } else {
            average = second;
        }
        if(third > first && third > second) {
            greatest = third;
        } else if (third < second && third < second) {
            smallest = third;
        } else {
            average = third;
        }

        //todo
        System.out.println("Наибольший вес: " + greatest);
        System.out.println("Средний вес: " + average);
        System.out.println("Наименьший вес: " + smallest);
    }
}

/*  Альтернативный вариант, через тернарные операторы
        //todo дописать логику программы ниже.
        greatest = first > second && first > third ? first : second > first && second > third ? second : third;

        smallest = first < second && first < third ? first : second < first && second < third ? second : third;

        if((first > second && first < third) || (first < second && first > third)) {
            average = first;
        } else if ((second > first && second < third) || (second < first && second > third)) {
            average = second;
        } else if ((third > first && third < second) || (third < first && third > second)) {
            average = third;
        }
 */
