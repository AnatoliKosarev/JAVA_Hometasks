package org.example.java_classes.main_task;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Solution1 {

    public static void main(String[] args) {
        StudentData studentData = new StudentData();
        studentData.addStudentToList(new Student("Шарапов", "Родион", "Виталиевич", new GregorianCalendar(1990, Calendar.JANUARY, 2),
                "г. Гродно, ул. Врублевского, 21", "123456", Course.FIFTH, Faculty.CYBERNETICS, Group.CS2));
        studentData.addStudentToList(new Student("Андрух", "Евдоким", "Петрович", new GregorianCalendar(1992, Calendar.APRIL, 21),
                "г. Гродно, ул. Врублевского, 24", "123456", Course.SECOND, Faculty.CYBERNETICS, Group.CS1));
        studentData.addStudentToList(new Student("Кличко", "Шамиль", "Артёмович", new GregorianCalendar(1995, Calendar.DECEMBER, 1),
                "г. Гродно, ул. Врублевского, 20", "123456", Course.THIRD, Faculty.PHYLOSOPHY, Group.EC1));
        studentData.addStudentToList(new Student("Шестак", "Тарас", "Борисович", new GregorianCalendar(1994, Calendar.JUNE, 12),
                "г. Гродно, ул. Врублевского, 21", "123456", Course.FOURTH, Faculty.PHYLOSOPHY, Group.EC2));
        studentData.addStudentToList(new Student("Гелетей", "Гарри", "Эдуардович", new GregorianCalendar(1993, Calendar.AUGUST, 22),
                "г. Гродно, ул. Врублевского, 21", "123456", Course.FIFTH, Faculty.CHEMISTRY, Group.LAW1));
        studentData.addStudentToList(new Student("Рябов", "Чеслав", "Петрович", new GregorianCalendar(1989, Calendar.NOVEMBER, 24),
                "г. Гродно, ул. Врублевского, 25", "123456", Course.FIRST, Faculty.CHEMISTRY, Group.LAW2));
        studentData.addStudentToList(new Student("Гончар", "Феликс", "Петрович", new GregorianCalendar(1995, Calendar.OCTOBER, 13),
                "г. Гродно, ул. Врублевского, 23", "123456", Course.SECOND, Faculty.PSYCHOLOGY, Group.PSY1));
        studentData.addStudentToList(new Student("Титов", "Семён", "Львович", new GregorianCalendar(1993, Calendar.MAY, 3),
                "г. Гродно, ул. Врублевского, 23", "123456", Course.THIRD, Faculty.PSYCHOLOGY, Group.PSY2));

        studentData.printStudentListForCertainFaculty("Кибернетики");

        System.out.println();

        studentData.printStudentListForAllFacultiesAndCourses();

        System.out.println();

        studentData.printStudentListBornAfterCertainYear(1993);

        System.out.println();

        studentData.printStudentListForCertainGroup("Law-2");

    }
}
