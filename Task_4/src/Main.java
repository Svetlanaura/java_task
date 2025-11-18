public class Main {
    public static void main(String[] args) {
        // Создание объекта Book
        Book book1 = new Book("Война и мир", 1869, "Лев Толстой", 1225);
        Book book2 = new Book("1984", 1949, "Джордж Оруэлл", 328);
        Book book3 = new Book("Мастер и Маргарита", 1967, "Михаил Булгаков", 480);

        // Демонстрация метода isBig()
        System.out.println("Книга \"" + book1.getTitle() + "\" большая? " + book1.isBig()); // true
        System.out.println("Книга \"" + book2.getTitle() + "\" большая? " + book2.isBig()); // false

        // Демонстрация метода matches(String word)
        System.out.println("В книге \"" + book1.getTitle() + "\" содержится слово \"мир\"? " + book1.matches("мир")); // true
        System.out.println("В книге \"" + book2.getTitle() + "\" содержится слово \"мир\"? " + book2.matches("мир")); // false
        System.out.println("В книге \"" + book3.getTitle() + "\" содержится слово \"Булгаков\"? " + book3.matches("Булгаков")); // true

        // Демонстрация метода estimatePrice()
        System.out.println("Оценочная цена книги \"" + book1.getTitle() + "\": " + book1.estimatePrice() + " рублей"); // 3*1225=3675
        System.out.println("Оценочная цена книги \"" + book2.getTitle() + "\": " + book2.estimatePrice() + " рублей"); // 3*328=984
        System.out.println("Оценочная цена книги \"" + book3.getTitle() + "\": " + book3.estimatePrice() + " рублей"); // 3*480=1440, но минимум 250 — так и есть
    }
}