package com.thrifty;

import java.util.Scanner;

public class Cars {

    public static void cars(String[] args) {


    }
    public int carSpeed(int s, int t){
        System.out.print("Введите расстояние между городами: ");
        Scanner scS = new Scanner(System.in);
        s = scS.nextInt();
        System.out.print("Введите время в дороге: ");
        Scanner scT = new Scanner(System.in);
        t = scT.nextInt();
        return s/t;
    }


}
