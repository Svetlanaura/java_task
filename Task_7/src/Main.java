import accounts.*;
import loggers.*;

public class Main {
    public static void main(String[] args) {

        // Счета
        SimpleAccount a1 = new SimpleAccount(1000);
        CreditAccount a2 = new CreditAccount(5000);

        a1.pay(300);
        a2.pay(2000);
        a2.add(1500);
        a1.transfer(a2, 500);

        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());

        // Логгеры
        Logger simple = new SimpleLogger();
        Logger smart = new SmartLogger();

        simple.log("Привет!");
        smart.log("Старт программы");
        smart.log("Ошибка соединения");
        smart.log("Окончание работы программы");
    }
}
