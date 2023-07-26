package com.obs.sample;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int i, a = 0, flag = 0;
        a = n / 2;
        if (n == 0 || n == 1) {
            System.out.println("not a prime number");
        } else {
            for (i = 2; i <= a; i++) {
                if (n % i == 0) {
                    System.out.println("not a prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("number is prime");
            }
        }
    }
}