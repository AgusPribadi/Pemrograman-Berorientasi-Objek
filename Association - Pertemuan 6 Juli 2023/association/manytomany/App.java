package association.manytomany;

public class App {
    public static void main(String[] args) {
        Student roki = new Student("Nurul Roki");
        Student zuhrie = new Student("Zuhrie Zingdadil");
        Course pbo = new Course("Pemrograman Beorientasi Obyek");
        Course weblan = new Course("Pemrograman Web Lanjut");

        roki.coursesEnrolled(roki);
        zuhrie.coursesEnrolled(zuhrie);
        pbo.enrollStudent(pbo);
        weblan.enrollStudent(weblan);
    }
}
