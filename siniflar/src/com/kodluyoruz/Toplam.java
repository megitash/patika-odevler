package com.kodluyoruz;

public class Toplam {
    public static void main(String[] args) {


        Employee e1 = new Employee("Sait", 900, 50, 2010);

        Maas maas = new Maas(e1);
        maas.printResult();
        maas.addBonusMaas();
        maas.addTax();
        maas.raiseSalary();
        maas.maasBonus();


    }
}





