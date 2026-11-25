package com.gsdevops.dsa.introduction;

public class MainApp2 {
    static void main() {
        checkNumber();
    }

    /**
     * 3 operations
     */
    static void checkNumber() {
        int no = 10;
        if (no > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }
    }
}
