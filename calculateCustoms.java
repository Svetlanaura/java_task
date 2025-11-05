public class calculateCustoms {
    public static int customsService;
    int customsService(int price, int weight) {
    final int customsService = 100;
    // Расчёт пошлины: 1 копейка за каждый рубль + 100 рублей за кг
    double customsFee = (price * 0.01) + (weight * customsService);
    return (int)customsFee;

    }
}