package obs;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahir", "1234567", "CHE");
        Teacher t2 = new Teacher("Caner", "3345322", "PHY");
        Teacher t3 = new Teacher("Eren", "2212313", "MATH");

        Course c1 = new Course("Kimya", "102", "CHE", 0.30, 0.70);
        c1.addTeacher(t1);
        Course c2 = new Course("Fizik", "103", "PHY", 0.10, 0.90);
        c2.addTeacher(t2);
        Course c3 = new Course("Matematik", "104", "MATH", 0.25, 0.75);
        c3.addTeacher(t3);

        Student s1 = new Student("Ali", "1923421", "4", c1, c2, c3);

        c1.printTeacher();
        c2.printTeacher();
        c3.printTeacher();

        s1.addBulkExamNote(20, 30, 40, 45, 56, 87);
    }
}
