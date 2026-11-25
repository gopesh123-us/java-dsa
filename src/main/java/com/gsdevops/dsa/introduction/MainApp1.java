/**
 * No of operations are 4 - this is what is counted
 * The statement that executes at runtime.
 */
package com.gsdevops.dsa.introduction;

public class MainApp1 {

    static void main() {
        long startTime = System.nanoTime();
        System.out.println("Hello");
        long endTime = System.nanoTime();
        System.out.println("Time: " + (endTime - startTime) + " nano seconds.");
    }
}
