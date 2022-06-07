package com.company;

public class Digit {

    int num;

    public Digit(int num){
        this.num = num;
    }


    public int Factorial(){
        int result = num;
        for(int i = num - 1; i > 1; i--){
            result *= i;
        }
        return result;
    }
}
