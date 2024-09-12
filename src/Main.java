import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Мастер и Маргарита", 500.0, true);
        Book book2 = new Book("Преступление и наказание", 300.0);

        WriterInfo writerInfo = new WriterInfo();

        System.out.println("Информация о книге 1:");
        writerInfo.printBookInfo(book1);

        System.out.println("\nИнформация о книге 2:");
        writerInfo.printBookInfo(book2);

        // Ввод данных для третьей книги от пользователя
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nВведите информацию для третьей книги:");
        System.out.print("Введите название книги: ");
        String title = scanner.nextLine();

        System.out.print("Введите цену книги: ");
        double price = scanner.nextDouble();

        System.out.print("Есть ли иллюстрации? (true/false): ");
        boolean hasIllustrations = scanner.nextBoolean();

        Book book3 = new Book(title, price, hasIllustrations);

        System.out.println("\nИнформация о книге 3:");
        writerInfo.printBookInfo(book3);

        scanner.close();
    }
}