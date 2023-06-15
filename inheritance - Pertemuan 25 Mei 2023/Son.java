package inheritance;

public class Son extends Father{
    String car = super.car;

    Son(){
        super();
    }

    Son(String village) {
        super(village);
    }

    int getMoney() {
        return super.getMoney() + 100000;
    }
}
