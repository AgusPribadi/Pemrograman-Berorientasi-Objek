package finalexam;

public class Keluarga extends AbstractKeluarga {
    private String namaKeluarga;
    private int jumlahAnggota;

    public Keluarga() {
        super(false);
        this.namaKeluarga = "Default";
        this.jumlahAnggota = 0;
    }

    public Keluarga(String namaKeluarga, int jumlahAnggota, boolean value) {
        super(value);
        this.namaKeluarga = namaKeluarga;
        this.jumlahAnggota = jumlahAnggota;
    }

    @Override
    public void abstractMethod() {
        System.out.println("Implementasi dari abstractMethod dalam Keluarga");
        if (getValue()) {
            System.out.println("Nilai value adalah true.");
        } else {
            System.out.println("Nilai value adalah false.");
        }
    }

    public String getNamaKeluarga() {
        return namaKeluarga;
    }

    public void setNamaKeluarga(String namaKeluarga) {
        this.namaKeluarga = namaKeluarga;
    }

    public int getJumlahAnggota() {
        return jumlahAnggota;
    }

    public void setJumlahAnggota(int jumlahAnggota) {
        this.jumlahAnggota = jumlahAnggota;
    }

    public void methodTanpaParameter() {
        System.out.println("Ini adalah method tanpa parameter dari Keluarga.");
    }

    public void operasiPercabangan(int nilai) {
        if (nilai > 0) {
            System.out.println("Nilai lebih besar dari 0");
        } else if (nilai < 0) {
            System.out.println("Nilai lebih kecil dari 0");
        } else {
            System.out.println("Nilai sama dengan 0");
        }
    }

    public boolean operasiLogika(boolean kondisi1, boolean kondisi2) {
        boolean hasil = kondisi1 && kondisi2;
        System.out.println("Hasil operasi logika: " + hasil);
        return hasil;
    }
}
