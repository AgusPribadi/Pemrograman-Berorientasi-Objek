package finalexam;

public abstract class AbstractKeluarga {
    private boolean value;

    public AbstractKeluarga(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public abstract void abstractMethod();
}
