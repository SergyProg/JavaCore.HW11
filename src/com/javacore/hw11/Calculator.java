package com.javacore.hw11;

import java.util.function.*;

public class Calculator {
    public static Supplier<Calculator> init = Calculator::new;

    public static BinaryOperator<Integer> plus = (x, y) -> x + y;
    public static BinaryOperator<Integer> minus = (x, y) -> x - y;
    public static BinaryOperator<Integer> multiply = (x, y) -> x * y;
    public static BinaryOperator<Double> divide = (x, y) -> x / y;

    public static UnaryOperator<Integer> pow = x -> x * x;
    public static UnaryOperator<Integer> abs = x -> (x > 0 ? x : x * (-1));

    public static Predicate<Integer> isPositive = x -> x > 0;

    public static Consumer<String> println = System.out::println;
    public static Consumer<Integer> intPrintln = System.out::println;
}
