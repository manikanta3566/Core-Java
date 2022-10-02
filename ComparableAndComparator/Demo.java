package com.sorting.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student(10,"ram",89.09));
        students.add(new Student(8,"arvind",70.09));
        students.add(new Student(4,"mahesh",60));
        students.add(new Student(1,"sundar",99));
        students.add(new Student(17,"vishnu",56.09));

        //sorting student list using comparable interface
        Collections.sort(students);
        System.out.println(students);

        //sorting student list using comparable interface with java 8 stream
        List<Student> sortedStudentsWithComparbale = students.stream().sorted((s1, s2) ->{
            if(s1.getId()==s2.getId()){
                return 0;
            } else if (s1.getId()>s2.getId()) {
                return 1;
            }else {
                return -1;
            }
        }).collect(Collectors.toList());
        System.out.println(sortedStudentsWithComparbale);

        //sorting student list using compartor interface
        //sorting student list by student id
        Collections.sort(students,new StudentIdComparator());
        System.out.println(students);

        //sorting student list by student name
        Collections.sort(students,new StudentNameComparator());
        System.out.println(students);

        //sorting student list by student percentage
        Collections.sort(students,new StudentPercentageComparator().reversed());
        System.out.println(students);

        //sorting student list using comparator interface with java 8 stream
        //by id
        List<Student> studentById= students.stream().sorted(Comparator.comparing(Student::getId)).collect(Collectors.toList());
        System.out.println(studentById);

        //By Name
        List<Student> studentByName = students.stream().sorted(Comparator.comparing(Student::getName).reversed()).collect(Collectors.toList());
        System.out.println(studentByName);

        //by percentage
        List<Student> studentByPercentage = students.stream().sorted(Comparator.comparing(Student::getPercentage)).collect(Collectors.toList());
        System.out.println(studentByPercentage);

    }
}
