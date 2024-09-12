import org.jetbrains.annotations.NotNull;

public class WriterInfo {
    // Метод для вывода всей информации о книге
    public void printBookInfo(@NotNull Book book) {
        book.printTitle();
        book.printPrice();
        book.printIllustrationsInfo();
    }
}
