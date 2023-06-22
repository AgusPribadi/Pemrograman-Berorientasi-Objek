package standardjavaclass;

public class NumberApp {
    public static void main(String[] args) {
        // int myHeight = 175;
        // double herHeight = 165.50;
        // System.out.println(herHeight.equals(myHeight));

        Number height = 180.8;
        Number hisHeight = 170.4;
        System.out.println(height.equals(hisHeight));

        Double herHeight = 165.50;
        System.out.println(herHeight.equals(hisHeight));

        String annaHeight = herHeight.toString(); // Konversi ke String
        int annaHeightInt = herHeight.intValue(); // ke int
        Long annaHeightLong = herHeight.longValue(); //ke Long
    }
}
