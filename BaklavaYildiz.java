package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n, i, j, k;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak sayýsýný giriniz: ");
        n = scanner.nextInt();
        for (i = 0; i < n; i++) {
            for (j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int x=n-1; x>0; x--){
            for( int y=0; y<=n-x; y++){
                System.out.print(" ");
            }
            for(int z=0; z<=2*x-1; z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

