package com.kodluyoruz;

public class Maas {
    Employee e1;

    Maas(Employee e1) {
        this.e1 = e1;
    }

    void addTax() {
        if (this.e1.salary > 1000) {
            System.out.println("Vergi : " + this.e1.salary * 0.03);
        } else {
            System.out.println("Vergi : " + 0);
        }
    }

    void addBonusMaas() {
        if (this.e1.workHours > 40) {
            System.out.println("Bonus : " + (this.e1.workHours - 40) * 30);
        } else {
            System.out.println("Bonus : " + 0);
        }
    }

    void raiseSalary() {
        if ((2021 - this.e1.hireYear) < 10) {
            System.out.println("Maas Artisi : " + (this.e1.salary + (this.e1.salary * 0.05)));
        } else if ((2021 - this.e1.hireYear) > 9 && (2021 - this.e1.hireYear) < 20) {
            System.out.println("Maas Artisi : " + (this.e1.salary + (this.e1.salary * 0.1)));
        } else if ((2021 - this.e1.hireYear) > 19) {
            System.out.println("Maas Artisi : " + (this.e1.salary + (this.e1.salary * 0.15)));
        }
    }

    void printResult() {
        System.out.println("Adi : " + this.e1.name + "\n" + "Maasi : " + this.e1.salary + "\n" + "Calisma saati : " + this.e1.workHours + "\n" + "Baslangic Yili : " + this.e1.hireYear);

    }

    void maasBonus() {
        if ((this.e1.salary > 1000) && (this.e1.workHours > 40)) {
            System.out.println("Vergi ve Bonuslar ile birlikte maaş :" + (this.e1.salary + ((this.e1.salary - (this.e1.salary * 0.03)) + ((this.e1.workHours - 40) * 30))));
        }
        if ((this.e1.salary > 1000) && (this.e1.workHours < 40)) {
            System.out.println("Vergi ve Bonuslar ile birlikte maaş :" + (this.e1.salary + ((this.e1.salary - (this.e1.salary * 0.03)))));
        }
        if ((this.e1.salary < 1000) && (this.e1.workHours > 40)) {
            System.out.println("Vergi ve Bonuslar ile birlikte maaş :" + (this.e1.salary + ((this.e1.workHours - 40) * 30)));
        }
        if ((this.e1.salary < 1000) && (this.e1.workHours < 40)) {
            System.out.println("Vergi ve Bonuslar ile birlikte maaş :" + (this.e1.salary));
        }
    }

}








