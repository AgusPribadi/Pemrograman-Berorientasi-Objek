package inheritance;

public class App {
    public static void main(String[] args) {
//        Father.Bijuu kyuubi = new Father.Bijuu();


        GrandFather minato = new GrandFather();
        System.out.println(minato.house);
        Father naruto = new Father("Konoha");
        System.out.println(naruto.car);
        System.out.println(naruto.house);

        Father.Bijuu kyuubi = naruto.new Bijuu();
        System.out.println(kyuubi.powerLevel);
        System.out.println(kyuubi.car);
        System.out.println(kyuubi.money);
        System.out.println(kyuubi.house);


        System.out.println(naruto.getMoney());
        Son boruto = new Son("Desa Kapoor");
        System.out.println(boruto.car);
        System.out.println(boruto.getMoney());
        System.out.println(boruto.house);

        Daughter himawari = new Daughter();
        System.out.println(himawari.money);
        System.out.println(himawari.house);
        System.out.println(himawari.car);
    }
}
