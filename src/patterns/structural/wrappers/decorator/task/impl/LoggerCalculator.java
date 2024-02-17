package patterns.structural.wrappers.decorator.task.impl;

import patterns.structural.wrappers.decorator.task.Calculable;

public class LoggerCalculator implements Calculable {
    private Calculable calculable;

    public LoggerCalculator(Calculable calculable) {
        this.calculable = calculable;
    }

    @Override
    public void sum(double a, double b) {
        System.out.printf("Суммирую: %s, %s\n", a, b);
        calculable.sum(a,b);
        System.out.println(result());
    }

    @Override
    public void multiply(double a, double b) {
        System.out.printf("Умножаю: %s, %s\n", a, b);
        calculable.multiply(a,b);
        System.out.println(result());
    }

    @Override
    public void divide(double a, double b) {
        System.out.printf("Делю: %s, %s\n", a, b);
        calculable.divide(a,b);
        System.out.println(result());
    }

    @Override
    public void subtraction(double a, double b) {
        System.out.printf("Вычитаю: %s, %s\n", a, b);
        calculable.subtraction(a,b);
        System.out.println(result());
    }

    @Override
    public double result() {
        return calculable.result();
    }

    @Override
    public void clear() {
        calculable.clear();
    }
}
