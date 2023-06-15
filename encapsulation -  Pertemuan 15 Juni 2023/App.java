package encapsulation;

import encapsulation.product.*;

public class App {
    public static void main(String[] args) {
        User john = new User();
        john.setUsername("johndoe");
        System.out.println(john.getUsername());

        Product nissanGTR = new Product();
        Warehouse firstHouse = new Warehouse();

        encapsulation.delivery.Delivery delivery = new encapsulation.delivery.Delivery();
    }
}
