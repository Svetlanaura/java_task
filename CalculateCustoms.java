public class CalculateCustoms {
    public static int calculateCustoms(int price, int weight) {
        // Посчитаем пошлину:
        // 1 копейка за каждый рубль (price * 0.01) +
        // 100 рублей за каждый килограмм (weight * 100)
        double calculateCustoms = (price * 0.01) + (weight * 100);

        // Округляем результат до целого числа (учитывая, что копейки игнорируем)
        return (int) Math.ceil(calculateCustoms);

    }
}