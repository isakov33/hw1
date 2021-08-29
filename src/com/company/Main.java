package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String MyHome = "Привет";
        int NUM = 7;
        String Word = "hello";
        MyHome = NUM + Word;
        if (NUM > 0) {
            System.out.println("вы сохранили положительное число");
        } else if (NUM > 0) {
            System.out.println("вы сохранили отрицательное число");
        } else {
            System.out.println("вы сохраниль нуль");
        }
        {
            Scanner ALBA = new Scanner(System.in);
            System.out.println("введите свое имя :");
            String string = ALBA.nextLine();
            System.out.println("здравствуйте" + string);
        }
    }
}


