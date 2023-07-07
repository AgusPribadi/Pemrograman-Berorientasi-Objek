package association.onetoone;

public class KTP {
    private String numberKTP;
    private Person owner;

    public KTP(String numberKTP) {
        this.numberKTP = numberKTP;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
