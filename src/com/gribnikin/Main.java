package com.gribnikin;

import java.util.Random;
import java.util.Scanner;

public class Main {
    /*

    TASK 3.
    1. Написать программу, которая загадывает случайное число от 0 до 9,
    и пользователю дается 3 попытки угадать это число.
    При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
    После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
    */

    public static void main(String[] args) {
       task3_zagadat_chislo();

    }

    static void task3_zagadat_chislo()
    {


        int tryChislo;
        Scanner in = new Scanner(System.in);
        int exitPr=3;
        do {

            int tryCount=0;
            int chislo = (int)(Math.random()*10);
            boolean win=false;
            boolean exit=false;
        while (!exit)
        {

            System.out.println ("Загадайте число от 0 до 9 за 3 поптыки" );
            tryChislo = in.nextInt();
            if (tryChislo==chislo)
            win=true;
            else
            {
                if (tryChislo<chislo)
                System.out.println("Ваше число меньше определенного!");
                else
                System.out.println("Ваше число больше определенного!");
            };

            tryCount++;
            if ((tryCount==3)||win)
                exit=true;
        }
        if (win)
            System.out.println("Вы выйграли");
        else
            System.out.format("Вы проиграли, загаданное число - %s \n", chislo);
            System.out.println("Повторить игру еще раз? 1 – да , 0 – нет»(1 – повторить, 0 – нет)");
            exitPr=in.nextInt();

     }
        while (exitPr==1);
    }
    }

