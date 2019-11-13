package Services;

import Models.Sneaker;

import java.util.ArrayList;

public class SneakerService {
    private static int nextId = 1;  // (1)

    private static ArrayList<Sneaker> inventory = new ArrayList<>();

    public static Sneaker create(String name, String brand, String sport, int size, int quantity, float price) {
        Sneaker createdSneaker = new Sneaker(nextId++, name, brand, sport, size, quantity, price);
        inventory.add(createdSneaker);
        return createdSneaker;
    }

}
