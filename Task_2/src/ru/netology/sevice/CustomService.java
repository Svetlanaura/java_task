package ru.netology.sevice;
public class CustomService {
    static final int TAX_WEIGHT =100;
    static final double FEE = 0.01;
    public static int calculateCustoms(int price, int weight) {
        final int WEIGHT_TAX = 100; // пошлина за каждый кг
        // Расчёт пошлины: 1 копейка за каждый рубль + 100 рублей за кг
        double tax = (price * FEE) + (weight * WEIGHT_TAX);
        // Отбрасываем копейки, оставляем только рубли
        return (int) tax;
    }
}
