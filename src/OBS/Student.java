package obs;

public class Student {
    String name;
    String stuNo;
    String classes;
    Course c1;
    Course c2;
    Course c3;
    double average = 0.0;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    void addBulkExamNote(int note1, int note2, int note3, int sNote1, int sNote2, int sNote3) {
        if ((this.c1.note >= 0 && this.c1.note <= 100) && (this.c1.sozluNotu >= 0 && this.c1.sozluNotu <= 100)) {
            this.c1.note = note1 * this.c1.finalEtki;
            this.c1.sozluNotu = sNote1 * this.c1.sozluEtki;
            this.c1.note += this.c1.sozluNotu;
        }
        if ((this.c2.note >= 0 && this.c2.note <= 100) && (this.c2.sozluNotu >= 0 && this.c2.sozluNotu <= 100)) {
            this.c2.note = note2 * this.c2.finalEtki;
            this.c2.sozluNotu = sNote2 * this.c2.sozluEtki;
            this.c2.note += this.c2.sozluNotu;
        }
        if ((this.c3.note >= 0 && this.c3.note <= 100) && (this.c3.sozluNotu >= 0 && this.c3.sozluNotu <= 100)) {
            this.c3.note = note3 * this.c3.finalEtki;
            this.c3.sozluNotu = sNote3 * this.c3.sozluEtki;
            this.c3.note += this.c3.sozluNotu;
        } /*
           * if(this.c1.sozluNotu>=0 && this.c1.sozluNotu <= 100 ){
           * this.c1.sozluNotu = sNote1*this.c1.sozluEtki;
           * }if(this.c2.sozluNotu>=0 && this.c2.sozluNotu <= 100 ){
           * this.c2.sozluNotu = sNote2*this.c2.sozluEtki;
           * }if(this.c3.sozluNotu>=0 && this.c3.sozluNotu <= 100 ){
           * this.c3.sozluNotu = sNote3*this.c3.sozluEtki;
           * }
           */
        calcAverage();
        printNote();
    }

    void isPass() {
        if (this.average >= 55) {
            this.isPass = true;
        } else {
            this.isPass = false;
        }
    }

    void calcAverage() {
        this.average = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
        isPass();
    }

    void printNote() {
        System.out.println("Kimya Ortalaması: " + this.c1.note);
        System.out.println("Fizik Ortalaması: " + this.c2.note);
        System.out.println("Matematik Ortalaması: " + this.c3.note);
        System.out.println("Geçme Notu: " + this.average);
        System.out.println("Geçme Durumu: " + this.isPass);
    }
}
