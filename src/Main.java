import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book("Мастер и Маргарита", 500.0, true);
        books[1] = new Book("Преступление и наказание", 300.0);

        // Ввод данных для третьей книги от пользователя
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nВведите информацию для третьей книги:");
        System.out.print("Введите название книги: ");
        String title = scanner.nextLine();

        System.out.print("Введите цену книги: ");
        double price = scanner.nextDouble();

        System.out.print("Есть ли иллюстрации? (true/false): ");
        boolean hasIllustrations = scanner.nextBoolean();

        books[2] = new Book(title, price, hasIllustrations);

        scanner.close();

        // Вывод информации о книгах
        WriterInfo writerInfo = new WriterInfo();
        for (int i = 0; i < books.length; i++) {
            System.out.println("\nИнформация о книге " + (i + 1) + ":");
            writerInfo.printBookInfo(books[i]);
        }

        // Подсчёт общей стоимости и количества книг с иллюстрациями
        double totalPrice = Book.caculateTotalPrice(books);
        int booksWithImages = Book.countBooksWithImage(books);

        System.out.println("\nОбщая стоимость всех книг: " + totalPrice + " рублей");
        System.out.println("Количество книг с иллюстрациями: " + booksWithImages);
    }
}