package ua.opnu;


import java.util.Objects;

public class Student {

    String name;
    int year;
    String[] course;

    public Student(String name, int year, String[] course) {
        this.name = name;
        this.year = year;
        this.course = course;
    }

    void addCourse(String courseName) {
        int count = 0;
        while(!Objects.equals(this.course[count], "")) {
            ++count;
        }
        this.course[count] = courseName;
    }

    void dropAll() {
        int count = 0;
        while (!Objects.equals(this.course[count], "")) {
            this.course[count] = "";
            count++;
        }
    }

    int getCourseCount() {
        int count = 0;
        while (!Objects.equals(this.course[count], "")) {
            count++;
        }
        return count;
    }

    String getName() {
        return this.name;
    }

    long getTuition() {
        return (long) getYear() * 20000;
    }

    int getYear() {
        return this.year;
    }

}
