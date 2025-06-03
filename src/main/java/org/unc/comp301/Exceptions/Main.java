package org.unc.comp301.Exceptions;

public class Main {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() throws RuntimeException {
        System.out.println("Line A was reached");
    }
}
