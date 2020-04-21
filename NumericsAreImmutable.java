package javatraining.oletsky.numerics;

/**
 * A function would not change numeric argument
 */

public class NumericsAreImmutable {
    public static void main(String[] args) {
        Integer n = 100;
        changeNumeric(n);
        System.out.println(n); //100
    }

    static void changeNumeric(Integer n) {
        n++;
    }
}
