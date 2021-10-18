package com.kodluyoruz;

import java.util.Arrays;

public class TekrarEdenSayi {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3, 6, 3, 6, 9, 9, 10, 21, 4, 33, 10, 4};
        int[] evenNum = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i] % 2 == 0 && list[j] % 2 == 0) {

                    if ((i != j) && (list[i] == list[j])) {
                        if (!isFind(evenNum, list[i])) {
                            evenNum[startIndex++] = list[j];
                        }
                        break;
                    }

                }

            }

        }
        System.out.println(Arrays.toString(evenNum));
    }
}


