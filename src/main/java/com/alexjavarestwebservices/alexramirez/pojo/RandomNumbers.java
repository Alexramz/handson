package com.alexjavarestwebservices.alexramirez.pojo;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumbers {
    public ArrayList<Integer> arrayList;

    public RandomNumbers(Integer n, Integer min, Integer max) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random rand = new Random();

        for (int i=0;i<n;i++){
            Integer integer = (int) (Math.random() * (max - min + 1) + min);
            arrayList.add(integer);
        }
        this.arrayList = arrayList;
    }
}
