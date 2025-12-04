import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PasswordChecker checker = new PasswordChecker();

        try {
            System.out.print("Введите мин. длину пароля: ");
            int min = Integer.parseInt(scanner.nextLine());
            checker.setMinLength(min);

            System.out.println();

            System.out.print("Введите макс. допустимое количество повторений символа подряд: ");
            int max = Integer.parseInt(scanner.nextLine());
            checker.setMaxRepeats(max);

        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка настройки: " + e.getMessage());
            System.out.println("Программа завершена");
            return;
        }

        System.out.println();

        while (true) {
            System.out.print("Введите пароль или end: ");
            String password = scanner.nextLine();

            if (password.equals("end")) {
                System.out.println("\nПрограмма завершена");
                break;
            }

            try {
                boolean result = checker.verify(password);
                if (result) {
                    System.out.println("Подходит!\n");
                } else {
                    System.out.println("Не подходит!\n");
                }
            } catch (IllegalStateException e) {
                System.out.println("Ошибка: " + e.getMessage());
                System.out.println("Программа завершена");
                break;
            }
        }
    }
}

