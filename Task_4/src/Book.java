// Класс Book
public class Book {
    // Поля класса
    private String title;
    private int releaseYear;
    private String author;
    private int pages;

    // Конструктор, принимающий все поля
    public Book(String title, int releaseYear, String author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }


    public boolean isBig() {
        return pages > 500;
    }


    public boolean matches(String word) {
        return title.contains(word) || author.contains(word);
    }


    public int estimatePrice() {
        int price = 3 * pages;
        return Math.max(price, 250);
    }


    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }
}