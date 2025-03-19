package ch09_classes.student;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studentCode = 2025001;
        student1.name = "김일";
        student1.score = 4.5;

        Student student2 = new Student(2025002);
        student2.name = "김이";
        student2.score = 100;

        Student student3 = new Student("김삼");
        student3.studentCode = 2025003;
        student3.score = 95.8;

        Student student4 = new Student(2025004,"김사");
        student4.score = 100;

        Student student5 = new Student(2025005, "김오", 80.7);

        Student2 student6 = new Student2();
        student6.studentCode = 2025006;
        student6.name = "김육";
        student6.score = 4.5;

        Student2 student7 = new Student2(2025007);
        student7.name = "김칠";
        student7.score = 100;

        Student2 student8 = new Student2("김팔");
        student8.studentCode = 2025008;
        student8.score = 95.8;

        Student2 student9 = new Student2(2025009,"김구");
        student9.score = 100;

        Student2 student10 = new Student2(2025010, "김십", 80.7);

        student1.showInfo();
        student2.showInfo();
        student3.showInfo();
        student4.showInfo();
        student5.showInfo();
        student6.showInfo();
        student7.showInfo();
        student8.showInfo();
        student9.showInfo();
        student10.showInfo();


    }
}
