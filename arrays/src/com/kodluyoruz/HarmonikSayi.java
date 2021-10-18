package com.kodluyoruz;

public class HarmonikSayi {

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        double harmonik = 0.0;
        for (int i = 0; i < list.length; i++) {
            harmonik += (1 / (list[i]));

        }
        System.out.println(harmonik);
    }
}

