package ua.opnu;



public class Main {
    public static void main(String[] args) {

        String[] emptyCourses = {"", "", "", "", "", "", "", "", "", ""};
        Student oleg = new Student("Олег", 2, emptyCourses);

        oleg.addCourse("ООП");
        oleg.addCourse("Засоби ШІ у веб-технологіях");
        oleg.addCourse("Організація баз даних та знань");
        oleg.addCourse("Теория ймовіронстей та мат. статистика");
        oleg.addCourse("Теорія алгоритмів");

        System.out.print(oleg.getName());
        System.out.print(": кількість вивчаємих дисциплін - ");
        System.out.print(oleg.getCourseCount());
        System.out.println("\n");

        System.out.print(oleg.getName());
        System.out.print(": рік навчання - ");
        System.out.print(oleg.getYear());
        System.out.println("\n");

        System.out.print(oleg.getName());
        System.out.print(": заплатив за навчання - ");
        System.out.print(oleg.getTuition());
        System.out.println("\n");

    }
}
