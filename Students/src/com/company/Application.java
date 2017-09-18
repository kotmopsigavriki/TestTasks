package com.company;

public class Application {

    public static void main(String[] args) {

        int[] results = new int [5];
        results[0] = 1;
        results[1] = 2;
        results[2] = 3;
        results[3] = 4;
        results[4] = 5;

        System.out.println((results[0]+results[1]+results[2]+results[3]+results[4])/5);// write your code here
    }

    public class Student {

        public String name;
        public String lastName;

    public Student (String name,String lastName) {
        this.name = name;
        this.lastName = lastName;}

    public void main(String[] args) {

        Student[] students = new Student[5];

        students[0] = new Student("Ivan", "Ivanov");
        students[1] = new Student("Piotr", "Pietrov");
        students[2] = new Student("James", "Jameson");
        students[3] = new Student("Jack", "Daniels");
        students[4] = new Student("John", "Smith");
    }
    }
}