import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> todoList = new ArrayList<>();

        while (true) {
            printMenu();
            System.out.print("Ваш выбор: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Введите номер операции!");
                continue;
            }

            switch (choice) {
                case 0:
                    System.out.println("Выход из программы.");
                    return;

                case 1:
                    System.out.print("\nВведите название задачи: ");
                    String task = scanner.nextLine();

                    if (todoList.contains(task)) {
                        System.out.println("Такое дело уже есть!");
                    } else {
                        todoList.add(task);
                        System.out.println("Добавлено!");
                    }
                    printTodoList(todoList);
                    break;

                case 2:
                    printTodoList(todoList);
                    break;

                case 3:
                    System.out.print("\nВведите номер для удаления: ");
                    try {
                        int index = Integer.parseInt(scanner.nextLine()) - 1;
                        if (index >= 0 && index < todoList.size()) {
                            todoList.remove(index);
                            System.out.println("Удалено!");
                        } else {
                            System.out.println("Дела с таким номером нет.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Введите корректный номер!");
                    }
                    printTodoList(todoList);
                    break;

                case 4:
                    System.out.print("\nВведите задачу для удаления: ");
                    String taskToRemove = scanner.nextLine();

                    if (todoList.remove(taskToRemove)) {
                        System.out.println("Удалено!");
                    } else {
                        System.out.println("Дела с таким названием нет.");
                    }
                    printTodoList(todoList);
                    break;

                default:
                    System.out.println("Нет такой операции.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\nВыберите операцию:");
        System.out.println("0. Выход из программы");
        System.out.println("1. Добавить дело");
        System.out.println("2. Показать дела");
        System.out.println("3. Удалить дело по номеру");
        System.out.println("4. Удалить дело по названию");
    }

    private static void printTodoList(ArrayList<String> todoList) {
        System.out.println("\nВаш список дел:");
        if (todoList.isEmpty()) {
            System.out.println("Список пуст.");
        } else {
            for (int i = 0; i < todoList.size(); i++) {
                System.out.println((i + 1) + ". " + todoList.get(i));
            }
        }
    }
}
