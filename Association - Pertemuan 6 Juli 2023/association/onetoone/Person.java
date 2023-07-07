package association.onetoone;

public class Person {
    private String name;
    private KTP ktp;

    public Person(String name) {
        this.name = name;
    }

    public void setKTP(KTP ktp) {
        this.ktp = ktp;
    }
}
