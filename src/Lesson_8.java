import java.util.Arrays;

public class Lesson_8 {
    public static void main(String[] args) {
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        //todo
        //int[] array = new int[10];
        int[] array = {0,1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < array.length; i++){
            array[i] = i; // array[i] = i+10; - что бы начать массив с 10
        }
        System.out.println("_____________________");
        //#2 Распечатать все значения массива начиная с 0 до последнего индексов.
        //todo
        for (int i = 0; i < array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println("_____________________");
        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        //todo
        for (int i = array.length-1; i >= 0 ;i--){
            System.out.println(array[i]);
        }
        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).?

        //??????????????????????????????????????????????????????????????????????????????????????????????????????

        //todo

    }
}
