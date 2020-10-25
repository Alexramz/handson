package com.alexjavarestwebservices.alexramirez.pojo;

public class Division {
    public Double quotient;
    public Double remainder;

    public Division(Double dividend, Double divisor) {
        this.quotient = dividend / divisor;
        this.remainder = dividend % divisor;

    }
}
