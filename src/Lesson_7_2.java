public class Lesson_7_2 {
    public static void main(String[] args) {
        //todo Тут увольняем каждого 2го айтишника (только при помощи цикла while)
        int idPerson = 2;
        while (idPerson <= 100) {
            System.out.println("Уволен айтишник с id = " + idPerson);
            idPerson = idPerson +2;
        }
    }
}