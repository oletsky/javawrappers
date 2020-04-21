package javatraining.oletsky.numerics;

/**
 * @author O.Oletsky
 * A you sure that if x==y and y==z then x==z?
 * If you think so you are wrong
 */

public class NonTransitiveComparisons {
    public static void main(String[] args) {
        Integer x = 200;
        int y = 200;
        Integer z = 200;
        System.out.println(x==y); //true
        System.out.println(y==z); //true
        System.out.println(x==z); //false
    }
}
