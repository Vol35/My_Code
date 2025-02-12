public class Lesson_7_1 {
    public static void main(String[] args) {
        //todo Тут увольняем каждого 2го айтишника (только при помощи цикла for)
        for (int i=2; i<=100; i++){
            if (i % 2 == 0){
                System.out.println("Уволен айтишник с id = " + i);

        /* - Второй вариант:
        for (int i=2; i<=100;i=i+2){
            System.out.println("Уволен айтишник с id = " + i);
        }
        */
            }
        }

    }
}