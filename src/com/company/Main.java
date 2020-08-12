package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String republicInCentralAsia = "Независимоя страна" + " " + " " + "Кыргызстан" + ".";
        System.out.println(republicInCentralAsia);
        String word = "Одна из красивейших стран в центральной Азии " + " ." + "Получивший не зависимость в августе";
        final int num = 1991;
        {
            System.out.println(republicInCentralAsia + " " + " " + word + " " + num);
        }
        final int num1 = 1991;
        {

        }
        if (num1 >1000) {
            System.out.println("Вы сохранили  ноль ");
        }
        if (num1 < 1000) {
            System.out.println("Вы сохранили отрецательное число ");
        } else {
            System.out.println("Вы  не  можите сохранили это число");
        }
    Scanner in = new Scanner(System.in);
        System.out.println("Input a name: Добрый день");
        String name=in.nextLine();
        System.out.println("Добрый день:name");

    }
}





