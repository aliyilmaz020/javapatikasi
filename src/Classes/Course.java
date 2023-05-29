package Classes;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozluNotu;
    int sozluNotEtki;
    int noteEtki;

    Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        int note = 0;
        int sozluNotu  = 0;
        int sozluNotEtki = 0;
        int noteEtki = 0;
    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            //printTeacher();
        }else {
            System.out.println("Hoca ve Ders Bölümleri Uyuşmuyor!");
        }
    }
    void printTeacher(){
        this.teacher.print();
    }
}
