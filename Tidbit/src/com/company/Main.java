package com.company;

import java.util.*;
import java.io.*;

public class Main {


    private int Max;
    private int srngVal; //Secure Random Number Generator Value

    public static void main(String[] args) {

        Random rand = new Random();
        int Maxarray1[] = new int[50];

        for(int i = 0; i < 50; i++){

            Maxarray1[i] = rand.nextInt(1|9);
            System.out.println(Maxarray1[i]);

        }

    }
}
