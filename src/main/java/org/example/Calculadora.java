package org.example;

public class Calculadora {

    public Calculadora(){}

    public Integer soma (Integer a, Integer b){
        return a+b;
    }

    public Integer subtrai (Integer a, Integer b){
        return a-b;
    }

    public Integer multiplica (Integer a, Integer b){
        return a*b;
    }
    public Integer divide (Integer a, Integer b){
        if (b == 0) {
            throw new IllegalArgumentException("Divisao por 0 nao é permitida.");
        }
        return a/b;
    }


}
