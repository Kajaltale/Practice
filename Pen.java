package com.company;

import java.util.Scanner;

public class Pen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int arr[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(" print matrix ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("print both the diagonal of a matrix");
        if (row == column) {
            for (int i = 0; i < row; i++) {
                System.out.print(arr[i][i] + " ");
            }
        } else {
            System.out.println("diagonal is not possible");
        }
        System.out.println();
        int value = column - 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if ((i + j) == value) {
                    System.out.print(arr[i][j] + " ");
                    break;
                }

            }
        }

    }
}

