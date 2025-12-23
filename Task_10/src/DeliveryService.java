import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DeliveryService {

    Map<Address, Integer> costPerAddress = new HashMap<>();
    int totalCost = 0;
    Set<String> countries = new HashSet<>();

    public DeliveryService() {
        costPerAddress.put(new Address("Россия", "Москва"), 200);
        costPerAddress.put(new Address("Россия", "Казань"), 200);
        costPerAddress.put(new Address("США", "Нью-Йорк"), 500);
    }

    public boolean hasAddress(Address address) {
        return costPerAddress.containsKey(address);
    }

    public int calculate(Address address, int weight) {
        int price = costPerAddress.get(address);
        int cost = price * weight;

        totalCost += cost;
        countries.add(address.country);

        return cost;
    }
}


