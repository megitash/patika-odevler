package com.kodluyoruz;

public class OgrenciBilgiSistemi {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut", "TRH", "05000000000");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "0000");
        Teacher t3 = new Teacher("Kulyutmaz", "BIO", "111");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);
        Course biyoloji = new Course("Biyoloji", "101", "BIO");
        biyoloji.addTeacher(t3);

        Student s1 = new Student("Saban", "123", "4", tarih, fizik, biyoloji);
        s1.addBulkExamNote(100, 90, 50);
        s1.addSozluNote(45, 80, 100);
        s1.isPass();

        Student s2 = new Student("Necmi", "124", "4", tarih, fizik, biyoloji);
        s2.addBulkExamNote(60, 50, 40);
        s2.addSozluNote(45, 80, 95);
        s2.isPass();
    }
}
