import java.util.Scanner;
public class Lesson_9_1 {
     static int a = 0;
    public static void main(String[] args) {
        //Написать программу, в которой пользователь вводит целое число.
        //Если число четное, то печатаем true, если не четное, печатаем false
        //В методе main НЕ ДОПУСТИМО написание какого либо кода, кроме вызова методов.
        //Методы и их логику продумайте сами
        a = input();
    }
    public static int input(){
            System.out.print("Введите целое число = ");
            a = new Scanner(System.in).nextInt();
            if (a % 2 == 0) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
            return a;
    }

}