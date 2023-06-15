package inheritance;

public class Father extends GrandFather{
    String house = super.house;
    String car = "Mazda 3";
    int money = 1000000;

    Father() {
        System.out.println("I am a ninja!");
    }

    Father(String village) {
        System.out.println("I am " + village + "ninja!");
    }

    int getMoney() {
        return this.money - 100000;
    }

    class Bijuu {
        int powerLevel = 99;
        String house = Father.this.house;
        int money = Father.this.money;
        String car = Father.this.car;
    }
}
