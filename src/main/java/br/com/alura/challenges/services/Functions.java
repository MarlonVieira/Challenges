package br.com.alura.challenges.services;

public class Functions implements iFunctions {

    @Override
    public Integer multiplicate(Integer a, Integer b) {
        return a * b;
    }

    @Override
    public String primeNumber(Integer a) {
        if (a % 2 == 1) {
            return "Is prime!";
        } else {
            return "Isn't prime!";
        }
    }

    @Override
    public Integer divide(Integer a, Integer b) {
        if ((b == 0) || (a == 0)) {
            throw new ArithmeticException("Error: Division by zero!");
        } else {
            return a / b;
        }
    }
}