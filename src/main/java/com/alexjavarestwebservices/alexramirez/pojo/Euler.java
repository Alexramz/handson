package com.alexjavarestwebservices.alexramirez.pojo;

public class Euler {
    public double euler;

    public Euler() {
    }

    public Euler(double euler) {
        this.euler = Math.pow(2.782,euler);
    }

    public double getEuler() {
        return Math.pow(2.782,euler);
    }

    public void setEuler(double euler) {
        this.euler = euler;
    }
}
