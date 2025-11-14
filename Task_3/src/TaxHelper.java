import java.util.Scanner;

public class TaxHelper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int earnings = 0;   // сумма доходов
        int spendings = 0;  // сумма расходов

        while (true) {
            System.out.println();
            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать систему налогообложения");
            System.out.println("Введите 'end' для завершения.");

            String input = scanner.nextLine();

            if ("end".equalsIgnoreCase(input)) {
                break; // выход из программы
            }

            int operation;
            try {
                operation = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Введите номер операции или 'end'!");
                continue;
            }

            switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода:");
                    earnings += readMoney(scanner);
                    break;

                case 2:
                    System.out.println("Введите сумму расхода:");
                    spendings += readMoney(scanner);
                    break;

                case 3:
                    chooseTaxSystem(earnings, spendings);
                    break;

                default:
                    System.out.println("Такой операции нет");
            }
        }

        System.out.println("Программа завершена!");
    }

    // Метод для чтения суммы денег с консоли
    public static int readMoney(Scanner scanner) {
        while (true) {
            String moneyStr = scanner.nextLine();
            try {
                int money = Integer.parseInt(moneyStr);
                if (money < 0) {
                    System.out.println("Сумма не может быть отрицательной. Повторите ввод:");
                } else {
                    return money;
                }
            } catch (NumberFormatException e) {
                System.out.println("Введите число!");
            }
        }
    }

    // УСН доходы (6% от доходов)
    public static int taxEarnings(int earnings) {
        return earnings * 6 / 100;
    }

    // УСН доходы минус расходы (15% от разницы)
    public static int taxEarningsMinusSpendings(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;
        return Math.max(tax, 0); // налог не может быть отрицательным
    }

    // Метод выбора лучшей налоговой системы
    public static void chooseTaxSystem(int earnings, int spendings) {
        int taxEarnings = taxEarnings(earnings);
        int taxMinus = taxEarningsMinusSpendings(earnings, spendings);

        System.out.println();
        System.out.println("Расчёт налогов...");
        System.out.println("Доходы: " + earnings + " руб.");
        System.out.println("Расходы: " + spendings + " руб.");
        System.out.println("УСН доходы: " + taxEarnings + " руб.");
        System.out.println("УСН доходы минус расходы: " + taxMinus + " руб.");

        if (taxEarnings < taxMinus) {
            System.out.println();
            System.out.println("Мы советуем вам УСН доходы");
            System.out.println("Ваш налог составит: " + taxEarnings + " рублей");
            System.out.println("Налог на другой системе: " + taxMinus + " рублей");
            System.out.println("Экономия: " + (taxMinus - taxEarnings) + " рублей");
        } else if (taxMinus < taxEarnings) {
            System.out.println();
            System.out.println("Мы советуем вам УСН доходы минус расходы");
            System.out.println("Ваш налог составит: " + taxMinus + " рублей");
            System.out.println("Налог на другой системе: " + taxEarnings + " рублей");
            System.out.println("Экономия: " + (taxEarnings - taxMinus) + " рублей");
        } else {
            System.out.println("Можете выбрать любую систему налогообложения — налоги одинаковы.");
        }
    }
}
