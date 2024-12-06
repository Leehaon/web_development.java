package c09_classes;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student(1332, "이하온", "A");

        student.showInfo();


        Student02 student2 = new Student02("이하온");
        Student02 student3 = new Student02(1332);
        Student02 student4 = new Student02(1332, "이하온");
        Student02 student5 = new Student02(1332, 100.0, "이하온");




    }
}
