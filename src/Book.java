import org.jetbrains.annotations.NotNull;

public class Book {
    private String title;
    private double price;
    private boolean hasImage;

    public Book(String title, double price, boolean hasImage) {
        this.title = title;
        this.price = price;
        this.hasImage = hasImage;
    }

    // Перегруженный конструктор без иллюстраций
    public Book(String title, double price) {
        this(title, price, false);
    }

    //Геттеры и сеттеры
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0){
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }

    public boolean isHasImage() {
        return hasImage;
    }

    public void setHasImage(boolean hasImage) {
        this.hasImage = hasImage;
    }

    //Методы для вывода информации о классе
    public void printTitle() {
        System.out.println("Название книги: " + title);
    }

    public void printPrice() {
        System.out.println("Цена книги: " + price + " рублей");
    }

    public void printIllustrationsInfo() {
        String illustrations = hasImage ? "Есть иллюстрации" : "Иллюстраций нет";
        System.out.println(illustrations);
    }

    //Статические методы
    public static double caculateTotalPrice(Book @NotNull [] books) {
        double totalPrice = 0;
        for (Book book : books) {
            totalPrice += book.getPrice();
        }
        return totalPrice;
    }

    public static int countBooksWithImage(Book @NotNull [] books) {
        int count = 0;
        for (Book book : books) {
            if (book.isHasImage()) {
                count++;
            }
        }
        return count;
    }
}
