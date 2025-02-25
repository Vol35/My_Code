import java.util.Scanner;

public class Phone {
    static String country = "";
    int numberPhone;
    String modelPhone;
    double weightPhone;

    // Конструктор пустой
    public Phone(){
}
    // Конструктор со всеми полями класса
    public Phone (int numberPhone, String modelPhone, double weightPhone){
        this.numberPhone = numberPhone;
        this.modelPhone = modelPhone;
        this.weightPhone = weightPhone;
}
    // Метод класса
    public void receiveCall(){
        System.out.println("Имя звонящего = ");
        new Scanner(System.in).nextInt();
}

}
