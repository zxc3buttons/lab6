package com.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //insertionSort
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        /*Student[] students = new Student[length];

        Student.initializeByArray(students);
        Student.printArray(students);

        Student.insertionSort(students);
        Student.printArray(students);

        System.out.println();*/
        //Collections.sort

        //хз, чёт не выводит ничего. get(i) = 0 - странно.
        ArrayList<Student> students2 = new ArrayList<>(length);
        for(int i = 0; i < students2.size(); i++) {
            students2.set(i, new Student());
            students2.get(i).setIdNumber(1);
        }
        System.out.println(students2.get(0));
        //Student.initializeByArrayList(students2);
        //Student.printArrayList(students2);
        for(int i = 0; i < students2.size(); i++) {
            System.out.println(students2.get(i).getIdNumber());
        }
    }
}
