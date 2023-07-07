package standardjavaclass;

import java.util.Date;

public class DateApp {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);

        long nowMilis = now.getTime();
        System.out.println(nowMilis);
    }
}
