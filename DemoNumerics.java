package javatraining.oletsky.numerics;

/**
 * @author O.Oletsky
 * Illustrating basic features of numeric wrappers
 * Boxing and unboxing
 */

public class DemoNumerics {
    public static void main(String[] args) {
        Integer a = 10; //boxing
        Integer b = 20;
        int q = a+5; //Unboxing
        System.out.println(q); //15
        Object o = a+b; //Not recommended but technically OK
        System.out.println(o); //30
        //int r=o+15; Syntax error

    }
}
