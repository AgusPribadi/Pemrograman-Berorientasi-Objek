package finalexam;

import java.util.ArrayList;
import java.util.Collection;

public class App {
    public static void main(String[] args) {
        Collection<AnggotaKeluarga> anggotaCollection = new ArrayList<>();
        anggotaCollection.add(new AnggotaKeluarga("John", 25, "Fam1", 4));
        anggotaCollection.add(new AnggotaKeluarga("Jane", 30, "Fam1", 4));
        anggotaCollection.add(new AnggotaKeluarga("Bob", 12, "Fam1", 4));
        anggotaCollection.add(new AnggotaKeluarga("Alice", 8, "Fam1", 4));
        anggotaCollection.add(new AnggotaKeluarga("Mark", 40, "Fam1", 4));

        for (AnggotaKeluarga anggota : anggotaCollection) {
            System.out.println("Nilai Bilangan Bulat: " + anggota.getJumlahAnggota());
        }
    }
}
