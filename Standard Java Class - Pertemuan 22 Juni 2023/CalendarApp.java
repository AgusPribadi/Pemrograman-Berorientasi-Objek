package standardjavaclass;

import java.util.Calendar;

public class CalendarApp {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.YEAR));

        byte date = 27;
        byte month = 9;
        int year = 1999;
        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(Calendar.DATE, date);
        dateOfBirth.set(Calendar.MONTH, month);
        dateOfBirth.set(Calendar.YEAR, year);
        System.out.println(dateOfBirth.getTime());
    }
}
