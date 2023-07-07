package association.onetoone;

public class App {
    public static void main(String[] args) {
        Person sukojo = new Person("Hadi Sukojo");
        KTP ktpSukojo = new KTP ("34324324343423");
        sukojo.setKTP(ktpSukojo);
        ktpSukojo.setOwner(sukojo);
    }
}
