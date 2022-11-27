package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input maximum number: ");
        int max = Integer.parseInt(scanner.nextLine());

        //Positive
        boolean invalid = false;
        int count1 = max * (max + 1) / 2;
        for (int i = max; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                if (count1 > max) {
                    invalid = true;
                }
                else {
                    invalid = false;
                    System.out.print(count1 + " ");
                }
                count1 -= 1;
            }
            if (!invalid) {
                System.out.println();
            }
        }

        //Puts zero in the middle
        System.out.println(0);

        //Negative
        int rows = 1;
        int count2 = -1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count2 + " ");
                count2 = count2 - 1;
                if (count2 < max * -1) {
                    return;
                }
                else {
                    rows += 1;
                }
            }
            System.out.println();
        }
    }
}