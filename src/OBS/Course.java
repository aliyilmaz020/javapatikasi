package obs;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double sozluNotu;
    double sozluEtki;
    double finalEtki;

    Course(String name, String code, String prefix, double sozluEtki, double finalEtki) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.sozluEtki = sozluEtki;
        this.finalEtki = finalEtki;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("Bölüm Kodu Aynı Değil!");
        }
    }

    void printTeacher() {
        System.out.println("Öğretmenin adı: " + this.teacher.name);
        System.out.println("Bölümü: " + this.teacher.branch);
        System.out.println("Telefon Numarası: " + this.teacher.mpno);
        System.out.println("---------------------------");
    }
}
