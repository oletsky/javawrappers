package javatraining.oletsky.numerics;

/**
 * @author O.Oletsky
 * A class has two overloaded functions. One of them accepts long
 * and the other accepts Integer. An argument is int.
 * Which function would be called?
 */

public class NumericOverLoad {
    public static void main(String[] args) {
        var ekz = new NumericOverLoadClass();
        int x = 10;
        ekz.foo(x); //long
    }
}

class NumericOverLoadClass {
    public void foo(long x) {
        System.out.println("long");
    }

    public void foo(Integer x) {
        System.out.println("Integer");
    }
}
