package javatraining.oletsky.numerics;

/**
 * @author O.Oletsky
 * Classical example of comparing numeric wrappers
 */

public class NumericComparison {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        System.out.println(a==b); //true
        Integer u = 200;
        Integer v = 200;
        System.out.println(u==v); //false
    }
}
