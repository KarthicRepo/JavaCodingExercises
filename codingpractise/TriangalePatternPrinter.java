package com.selenium.patterns.codingpractise;

public class TriangalePatternPrinter {
    public static void main(String[] args) {
        printTriangleOfSize(5);
        printInvertedTriangle(5);
        printNumberTriangle(5);
    }

    static void printTriangleOfSize(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= N - i; j++) {
                System.out.print(" ");
            }
            int k = 0;
            while (k != (i * 2) - 1) {
                System.out.print("*");
                ++k;
            }
            System.out.println();
        }
    }

    static void printInvertedTriangle(int N) {

        for (int i = N; i > 0; i--) {
            for (int j = 0; j <= N - i; j++) {
                System.out.print(" ");
            }
            int k = 0;
            while (k != (2 * i) - 1) {
                System.out.print("*");
                k++;
            }
            System.out.println();
        }
    }


    static void printNumberTriangle(int N) {

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= N - i; j++) {
                System.out.print(" ");
            }
            int k = 0,num=i;
            boolean inc=true;
            while (k != i ) {
                System.out.print(num);
                ++k;num++;
            }
            num--;
            int l=0;
            while(l<i-1){
                num--;
                System.out.print(num);
               l++;
            }
            System.out.println();
        }
    }
}
