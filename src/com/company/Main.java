package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        String republicInCentralAsia ="Независимоя страна"+ " "+" " + "Кыргызстан"+  ".";
        System.out.println(republicInCentralAsia);
        String word = "Одина из красивейших стран в центральной Азии "+ " ."+ "Получивший не зависимость в августе";
        final int num = 1991;
        {
            System.out.println(republicInCentralAsia + " "+ " " +word + " " + num);
        }
        int num1 = 1991;
        {

        }
        if (num1 > 1000) {
            System.out.println("Вы сохранили положительное число");
        }
        if (num1 == 1000) {
            System.out.println("Вы сохранили сохранили ноль ");
        }
        if (num1 < 1000) {
            System.out.println("Вы сохранили отрецательное число ");
        } else {
            System.out.println("Вы  не  можите сохранили это число");
        }
    }
}

