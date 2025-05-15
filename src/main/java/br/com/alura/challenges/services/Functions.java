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
}