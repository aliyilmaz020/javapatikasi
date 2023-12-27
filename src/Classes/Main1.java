package classes;

public class Main1 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ali Yılmaz", "TRH", "+9054323456");
        Teacher t2 = new Teacher("Murat Yılmaz", "FZK", "+9023456323");
        Teacher t3 = new Teacher("Serap Yılmaz", "BIO", "+902345664321");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "103", "BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("Hasan Yılmaz", "1234532", "4", tarih, fizik, biyo);
        s1.addBulkExamNote(100, 78, 50);
        s1.isPass();
        // s1.printNote();

        Student s2 = new Student("Caner Kara", "234512", "3", tarih, fizik, biyo);
        s2.addBulkExamNote(75, 35, 20);
        s2.isPass();
        // s2.printNote();
    }
}
