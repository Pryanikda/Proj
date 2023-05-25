package com.example.project;

import java.io.Serializable;
import java.util.Random;

    public class Minus implements Serializable {

        Random r = new Random();
        public int num1;

        public int num2;

        public int answer1;


        public Minus() {
            num1 = r.nextInt(50) + 25;
            num2 = r.nextInt(25) + 1;
            answer1 = num1 - num2;
        }
    }

