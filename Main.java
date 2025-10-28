import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    System.out.println("Привет, покупатель!");
    System.out.print("Введите цену товара (в руб.):");
            int price = scanner.nextInt();
    System.out.print("Введите вес товара (в кг.):");
            int weight = scanner.nextInt();
            int tax = CalculateCustoms.calculateCustoms(price, weight);
        System.out.println("Размер пошлины:" +tax+ "(в руб.)");
        return;
    }
}