package association.onetomany;

public class App {
    public static void main(String[] args) {
        Lecturer sucipto = new Lecturer("Sucipto");
        Lecturer asrul = new Lecturer("Asrul Abdullah");
        Department ti = new Department ("Teknik Informatika");
        ti.addLecturers(sucipto);
        ti.addLecturers(asrul);

        Lecturer dewi = new Lecturer("Dewi Yanti");
        Lecturer izhan = new Lecturer("Izhan Fakhruzi");
        Department si = new Department("Sistem Informasi");
        si.addLecturers(dewi);
        si.addLecturers(izhan);
    }
}
