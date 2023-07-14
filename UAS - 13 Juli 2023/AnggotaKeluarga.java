package finalexam;

public class AnggotaKeluarga extends Keluarga implements MyInterface {
    private String nama;
    private int umur;

    public AnggotaKeluarga() {
        super("Nama Keluarga", 0, true);
        this.nama = "Unknown";
        this.umur = 0;
    }

    public AnggotaKeluarga(String nama, int umur, String namaKeluarga, int jumlahAnggota) {
        super(namaKeluarga, jumlahAnggota, true);
        this.nama = nama;
        this.umur = umur;
    }

    @Override
    public void abstractMethod() {
        System.out.println("Implementasi dari abstractMethod dalam AnggotaKeluarga");
    }

    @Override
    public void methodDenganParameter(String teks) {
        System.out.println("Implementasi dari methodDenganParameter dalam AnggotaKeluarga");
        System.out.println("Parameter yang diterima: " + teks);
    }
}