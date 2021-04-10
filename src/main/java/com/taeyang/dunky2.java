package com.taeyang;

import org.json.simple.JSONArray;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.Arrays;


public class dunky2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        grade10 gr2[] = new grade10[3];
        for (int i = 0; i < gr2.length; i++) {
            gr2[i] = new grade10(sc.next(),sc.nextInt(),sc.nextInt());
        }
        System.out.println(Arrays.toString(gr2));
    }
}


