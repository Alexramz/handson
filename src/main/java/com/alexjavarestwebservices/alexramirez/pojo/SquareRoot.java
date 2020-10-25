package com.alexjavarestwebservices.alexramirez.pojo;

public class SquareRoot {
    @Override
    public String toString() {
        return "SquareRoot{" +
                "square=" + square +
                '}';
    }

    public Double square;

    public SquareRoot() {

    }
    public SquareRoot(Double square) {
        this.square = square;
    }

    public Double getSquare() {
        return square*square;
    }

    public void setSquare(Double square) {
        this.square = square;
    }



}
