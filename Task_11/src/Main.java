import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        // исходный список клиентов
        List<String> firstClients = List.of(
                "Anya", "Sveta", "Olya",
                "Alexandra", "Ruslana", "Olesya", "Vika"
        );

        // 1. создаём очередь и заполняем её
        Queue<String> queue = new LinkedList<>();
        queue.addAll(firstClients);

        // 2. разбираем очередь
        while (!queue.isEmpty()) {

            // берём следующего клиента
            String client = queue.poll();

            // "обработка" клиента
            System.out.println(client + " сделал(а) новый маникюр.");

            // 3. с вероятностью 50% добавляем друга
            if (Math.random() < 0.5) {
                String friendName = "a friend of " + client;
                queue.offer(friendName);
            }
        }
    }
}
