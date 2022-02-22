package com.javacore.hw11;

public class Main {
    public static void main(String[] args) {
        Calculator myCalc = Calculator.init.get();

        int x = 7;
        int y = 8;
        myCalc.println.accept(x + " + " +  y + " = " + myCalc.plus.apply(x, y));
        myCalc.println.accept(x + " - " +  y + " = " + myCalc.minus.apply(x, y));
        myCalc.println.accept(x + " * " +  y + " = " + myCalc.multiply.apply(x, y));
        myCalc.println.accept(x + " / " +  y + " = " + myCalc.divide.apply((double)x, (double)y));
        myCalc.println.accept(x + " в квадрате " + " = " + myCalc.pow.apply(x));
        myCalc.println.accept(-x + " по модулю " + " = " + myCalc.abs.apply(-x));
        myCalc.println.accept(x + " проверка на положительное значение " + " = " + myCalc.isPositive.test(x));
    }
}
