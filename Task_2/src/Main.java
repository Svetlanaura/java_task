import ru.netology.sevice.CustomService;

import java.util.Scanner;

import static ru.netology.sevice.CustomService.calculateCustoms;

public class Main {

    public static void main(String[] args) {
        // Создаем сканнер для ввода данных
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в калькулятор расчёта пошлины!");
        System.out.print("Введите цену товара (в руб.): ");
        int price = scanner.nextInt();
        System.out.print("Введите вес товара (в кг.): ");
        int weight = scanner.nextInt();
        int customsTax = CustomService.calculateCustoms(price, weight);
        System.out.println("Размер пошлины (в руб.) составит: " + customsTax);

        // Закрываем сканнер
        scanner.close();
    }


}
