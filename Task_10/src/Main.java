import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DeliveryService service = new DeliveryService();

        while (true) {
            System.out.println("\nЗаполнение нового заказа.");
            System.out.print("Введите страну (или end): ");
            String country = scanner.nextLine();

            if (country.equals("end")) {
                break;
            }

            System.out.print("Введите город: ");
            String city = scanner.nextLine();

            System.out.print("Введите вес (кг): ");
            int weight = Integer.parseInt(scanner.nextLine());

            Address address = new Address(country, city);

            if (!service.hasAddress(address)) {
                System.out.println("Доставки по этому адресу нет");
            } else {
                int cost = service.calculate(address, weight);

                System.out.println("Стоимость доставки составит: " + cost + " руб.");
                System.out.println("Общая стоимость всех доставок: "
                        + service.totalCost + " руб.");
                System.out.println("Количество уникальных стран доставки: "
                        + service.countries.size());
            }
        }

        System.out.println("Программа завершена");
    }
}

