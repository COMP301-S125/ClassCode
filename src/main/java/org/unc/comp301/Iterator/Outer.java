package org.unc.comp301.Iterator;

class Outer {
    private String message = "Hello from Outer!";
    private int value = 50;
    class Inner {
        private int value = 25;
        void display() {
            System.out.println(value + ", " + message + ", " +  Outer.this.value); // Accessing outer class variable
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}
