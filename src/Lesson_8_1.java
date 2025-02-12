import java.util.Random;
public class Lesson_8_1 {
    public static void main(String[] args) {
        double sumWaight = 0;
        double peopleCount = 0;
        double[] waightPeople =  new double[10];
        for(int i = 0; i < waightPeople.length; i++){
            waightPeople[i] = (new Random().nextDouble() * 60) + 40;
            sumWaight = sumWaight + waightPeople[i];
            if (waightPeople[i] >= 60 && waightPeople[i] <= 80 ) {
                peopleCount ++;
            }
        }
        for (int i = 0; i < waightPeople.length; i++){
            System.out.println(waightPeople[i]);
        }
        System.out.println("__________________________________________");
        System.out.println("Средний вес всех людей = " + sumWaight/waightPeople.length);
        System.out.println ("_______________________________________");
        System.out.println ("Количество людей у которых вес находится " +
                "в промежутке от 60 до 80 кг включительно " + peopleCount);
    }
}