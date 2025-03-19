package ch10_setter_getter.univ_student;

import ch10_setter_getter.Person;

public class UnivStudentMain {
    public static void main(String[] args) {
        UnivStudent univStudent1 = new UnivStudent();
        UnivStudent univStudent2 = new UnivStudent();
        UnivStudent univStudent3 = new UnivStudent();
        UnivStudent univStudent4 = new UnivStudent();
        UnivStudent univStudent5 = new UnivStudent();

        univStudent1.setName("김일");
        univStudent1.setGarde(1);
        univStudent1.setScore(3.3);

        univStudent2.setName("김이");
        univStudent2.setGarde(3);
        univStudent2.setScore(-30);
        univStudent2.setScore(4.0);

        univStudent3.setName("김삼");
        univStudent3.setGarde(5);
        univStudent3.setGarde(2);
        univStudent3.setScore(2.7);

        univStudent4.setName("김사");
        univStudent4.setGarde(4);
        univStudent4.setScore(3.8);

        univStudent5.setName("김오");
        univStudent5.setGarde(2);
        univStudent5.setScore(1.0);

        univStudent1.showInfo();
        univStudent2.showInfo();
        univStudent3.showInfo();
        univStudent4.showInfo();
        univStudent5.showInfo();
    }
}
