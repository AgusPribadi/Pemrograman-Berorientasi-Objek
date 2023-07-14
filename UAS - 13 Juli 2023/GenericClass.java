package finalexam;

public class GenericClass<T1, T2> {
    private T1 angkaBulat;
    private T2 teks;

    public GenericClass(T1 angkaBulat, T2 teks) {
        this.angkaBulat = angkaBulat;
        this.teks = teks;
    }

    public T1 getAngkaBulat() {
        return angkaBulat;
    }

    public T2 getTeks() {
        return teks;
    }
}
