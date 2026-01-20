/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mainn;


class Student {

    String name;
    int age;
    String course;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println(); // space between students
    }
}

// This is the Main class named Mainn
public class Mainn{
    public static void main(String[] args) {

        System.out.println("Student Information\n");

        // 1st object
        Student student1 = new Student();
        student1.name = "Kate Catubay";
        student1.age = 28;
        student1.course = "BSIT";

        // 2nd object
        Student student2 = new Student();
        student2.name = "Mark Balunan";
        student2.age = 41;
        student2.course = "BSBA";

        student1.displayInfo();
        student2.displayInfo();
    }
}
