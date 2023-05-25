package com.example.project;

import java.io.Serializable;
import java.util.Random;

    public class Minus implements Serializable {

        Random r = new Random();
        public int num1;

        public int num2;

        public int answer1;


        public Minus() {
            num1 = r.nextInt(50) + 1;
            num2 = r.nextInt(50) + 1;
            if (num1 < num2) {
                num1 += num2;
            }
            answer1 = num1 - num2;
        }
    }

