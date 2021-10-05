package com.practice;

import java.util.ArrayList;

public class Student implements Comparable<Student> {

    private int idNumber;

    public void setIdNumber(int idNumber){
        this.idNumber = idNumber;
    }

    public int getIdNumber(){
        return this.idNumber;
    }

    public static void initializeByArray(Student[] array) {

        for(int i = 0; i < array.length; i++) {
            array[i] = new Student();
            array[i].setIdNumber((int)(Math.random()*100));
        }
    }

    public static void initializeByArrayList(ArrayList<Student> arrayList) {
        for(int i = 0; i < arrayList.size(); i++) {
            arrayList.add(i, new Student());
            arrayList.get(i).setIdNumber((int)(Math.random()*100));
        }
    }

    public static void printArray(Student[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i].getIdNumber() + " ");
        }
        System.out.println();
    }

    public static void printArrayList(ArrayList<Student> arrayList) {
        for(int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i).getIdNumber() + " ");
        }
        System.out.println();
    }

    public static void insertionSort(Student[] array) {
        for (int i = 1; i < array.length; i++) {
            Student current = array[i];
            int j = i;
            while (j > 0 && array[j - 1].getIdNumber() > current.getIdNumber()) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = current;
        }
    }

    public int compareTo(Student student) {
        if(this.getIdNumber() == student.getIdNumber())
            return 0;
        else if(this.getIdNumber() > student.getIdNumber())
            return 1;
        else
            return -1;
    }
}
