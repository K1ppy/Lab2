package com.company;

import java.util.Scanner;

import com.sun.media.sound.InvalidFormatException;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter natural n : ");
            int n = scanner.nextInt();
            if (n < 1) {
                throw new InvalidFormatException("n should be natural");
            }
            System.out.println("Enter natural m : ");
            int m = scanner.nextInt();
            if (m < 1) {
                throw new InvalidFormatException("m should be natural");
            }
            int minColumn = minimumColumn(n, m);
            if (minColumn == -1) {
                throw new InvalidFormatException("Check input settings :");
            }
            System.out.println(minColumn);
        } catch (Exception ex) {
            System.out.println("Error while reading value : " + ex);
        }
    }

    public static int minimumColumn(int n, int m) {
        int[][] matrix = new int[n][m];
        int l = 1; //границы диапозона рандома
        int r = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (int) (Math.random() * r) + l;
            }
        }
        System.out.println("Matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
        int flagMin1 = 0;
        int flagNumber = 0;
        int min1 = 0;
        int index = -1;
        for (int i = 0; i < m; i++) {
            int pr = 1;
            flagNumber = 0;
            for (int j = 0; j < n; j++) {
                if (Math.abs(matrix[i][j]) > n) {
                    flagNumber = 1;
                }
                pr *= matrix[i][j];
            }
            if (flagNumber == 0) {
                if (flagMin1 == 0) {
                    min1 = pr;
                    flagMin1 = 1;
                    index = i;
                } else {
                    if (min1 > pr) {
                        min1 = pr;
                        index = i;
                    }
                }
            }
        }
        return index;
    }
}
