package com.kodluyoruz;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;
    int Sozlu1;
    int Sozlu2;
    int Sozlu3;


    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
        this.Sozlu1 = 0;
        this.Sozlu2 = 0;
        this.Sozlu3 = 0;

    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
    }

    void addSozluNote(int sozlu1, int sozlu2, int sozlu3) {
        if (sozlu1 >= 0 && sozlu1 <= 100) {
            this.Sozlu1 = sozlu1;
        }
        if (sozlu2 >= 0 && sozlu2 <= 100) {
            this.Sozlu2 = sozlu2;
        }
        if (sozlu3 >= 0 && sozlu3 <= 100) {
            this.Sozlu3 = sozlu3;
        }

    }

    void isPass() {
        this.avarage = (((this.c1.note * 0.8) + (this.Sozlu1) * 0.2) + ((this.c2.note * 0.8) + (this.Sozlu2) * 0.2) + ((this.c3.note * 0.8) + (this.Sozlu3) * 0.2)) / 3.0;
        if (this.avarage > 55) {
            System.out.println("Sinifi basarili sekilde gectiniz");
            this.isPass = true;
        } else {
            System.out.println("Sinifi gecemediniz");
            this.isPass = false;
        }
        printNote();
    }

    void printNote() {
        System.out.println(c1.name + " Notu\t:" + c1.note);
        System.out.println(c1.name + " Sozlu Notu:" + Sozlu1);
        System.out.println(c2.name + " Notu\t:" + c2.note);
        System.out.println(c2.name + " Sozlu Notu:" + Sozlu2);
        System.out.println(c3.name + " Notu:" + c3.note);
        System.out.println(c3.name + " Sozlu Notu:" + Sozlu3);

        System.out.println("Ortalamaniz : " + this.avarage);
        System.out.println("===============");
    }
}
