package lesson9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    static List<Student> course;

    public static void main(String[] args) {
        CourseGB courseGB1 = new CourseGB("Java. Быстрый старт");
        CourseGB courseGB2 = new CourseGB("Основы языка Python");

        CourseGB courseGB3 = new CourseGB("Основы языка C#");
        CourseGB courseGB4 = new CourseGB("Java.Уровень2");
        CourseGB courseGB5 = new CourseGB("С#. Мини- программы");
        CourseGB courseGB6 = new CourseGB("JavaCore");


        List<CourseGB> courseGBS = new ArrayList<>();
        courseGBS.add(courseGB1);
        courseGBS.add(courseGB2);
        courseGBS.add(courseGB3);
        courseGBS.add(courseGB4);
        courseGBS.add(courseGB5);
        courseGBS.add(courseGB6);


        StudentGB studentGB1 = new StudentGB("Дашкова", Arrays.asList(courseGB1, courseGB2));
        StudentGB studentGB2 = new StudentGB("Семёнов", Arrays.asList(courseGB3, courseGB6));
        StudentGB studentGB3 = new StudentGB("Линёв", Arrays.asList(courseGB1, courseGB3, courseGB4));
        StudentGB studentGB4 = new StudentGB("Ильина", Arrays.asList(courseGB1, courseGB2, courseGB3, courseGB5));
        StudentGB studentGB5 = new StudentGB("Давыдов", null);
        StudentGB studentGB6 = new StudentGB("Стенина", Arrays.asList(courseGB2, courseGB3, courseGB6));

        List<StudentGB> studentGBS = new ArrayList<>();
        studentGBS.add(studentGB1);
        studentGBS.add(studentGB2);
        studentGBS.add(studentGB3);
        studentGBS.add(studentGB4);
        studentGBS.add(studentGB5);
        studentGBS.add(studentGB6);
        System.out.println("***************************************************************************");
        System.out.println("Список студентов");
        System.out.println("***************************************************************************");

       // System.out.println(studentGBS);
        studentGBS.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println("***************************************************************************");

        System.out.println("Список уникальных курсов, на которые подписаны студенты");
        System.out.println("***************************************************************************");
        studentGBS.stream()
                .map(Student::getAllCourses)
                .flatMap(Collection::stream)
                .distinct()
                .forEach(System.out::println);
        System.out.println("***************************************************************************");
        System.out.println("Список и трех самых любознательных студента " +
                "(любознательность определяется количеством курсов).");
        System.out.println("***************************************************************************");

        studentGBS.stream()
                .sorted((o1, o2) -> {
                    List<Course> c1 = o1.getAllCourses();
                    List<Course> c2 = o2.getAllCourses();
                    return Integer.compare(
                            c2 == null ? 0 : c2.size(),
                            c1 == null ? 0 : c1.size()
                    );
                })
                .limit(3)
                .forEach(System.out::println);
        System.out.println("***************************************************************************");



    }
}














