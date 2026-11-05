package org.example;

public class Fibonacci {

    public String generate(int n) {
        int a = 0, b = 1;
        String s = "";

        for (int i = 0; i < n; i++) {
            s += a + " ";
            int c = a + b;
            a = b;
            b = c;
        }
        return s.trim();
    }
}