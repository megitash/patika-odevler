package com.kodluyoruz;

public class MatrisTranspozu {
    public static void main(String[] args) {
        int m, n = 0, c, d;

        int[][] matris = new int[2][3];
        matris[0][0] = 1;
        matris[0][1] = 2;
        matris[0][2] = 3;
        matris[1][0] = 4;
        matris[1][1] = 5;
        matris[1][2] = 6;
        System.out.print("Matris: ");
        for (m = 0; m < matris.length; m++) {
            System.out.println();
            for (n = 0; n < matris[m].length; n++) {
                System.out.print(matris[m][n]+ "   ");
            }
        }
        System.out.println();
        System.out.println("Transpoze: ");
        int[][] transpose = new int[n][m];
        for (c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                transpose = new int[n][m];

        for (c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                transpose[d][c] = matris[c][d];

        for (c = 0; c < n; c++) {
            for (d = 0; d < m; d++)

                System.out.print(transpose[c][d] + "\t");

            System.out.print("\n");
        }
    }

}


