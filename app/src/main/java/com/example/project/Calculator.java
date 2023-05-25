package com.example.project;

import java.io.Serializable;
import java.util.Random;

public class Calculator implements Serializable {

    Random r = new Random();
    public int num1;

    public int num2;

    public int answer1;


    public Calculator() {
        num1 = r.nextInt(50) + 1;
        num2 = r.nextInt(50) + 1;
        answer1 = num1 + num2;
    }
}
