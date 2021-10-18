package com.kodluyoruz;

public class Car {
    //Nitelikleri

    String type;
    String model;
    String color;
    int speed;
    int speedLimit=180;

    Car(String model, int speed, String color){
        this.model=model;
        this.speed=speed;
        this.color=color;
        this.type= "Sedan";


    }
    void increaseSpeed(int increment){
            this.speed+=increment;

        }

    void decreseSpeed(int decrease){
        if (speed>0){
            this.speed-=decrease;

        }
    }
    void printInfo(){
        System.out.println("Model \t:" + this.model);
        System.out.println("Speed \t:" + this.speed);
        System.out.println("Color \t:" + this.color);
    }
}
