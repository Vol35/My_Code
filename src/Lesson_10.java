import java.util.Scanner;

public class Lesson_10 {
    static String booksInfo = "";

    public static void main(String[] args) {
        while (true) {
            String name = inputBookName();
            int pageCount = inputPageCount();
            int priceBook = priceBook();
            addBook(name, pageCount, priceBook);
            //todo использовать новый метод тут
            printInfo();
        }
    }

    public static String inputBookName() {
        System.out.println("Введите название книги:");
        return new Scanner(System.in).nextLine();
    }

    public static int inputPageCount() {
        System.out.println("Введите кол-во страниц:");
        return new Scanner(System.in).nextInt();
    }
    public static int priceBook() {
        System.out.println("Введите цену книги:");
        return new Scanner(System.in).nextInt();
    }

    public static void addBook(String bookName, int pageCount, int priceBook) {
        booksInfo = booksInfo + bookName + " - "
                + (pageCount > 0 ? pageCount : "N/A") + " стр."  + " - "
                + (priceBook > 0 ? priceBook : "N/A") + " руб.\n";
    }
    public static void printInfo() {
        System.out.println(booksInfo);
    }

}