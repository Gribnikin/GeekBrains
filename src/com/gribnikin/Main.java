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


/*
Урок 6. Продвинутое ООП
1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
В качестве параметра каждому методу передается величина, означающая
или длину препятствия (для бега и плавания), или высоту (для прыжков).
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true)
5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
 */

    public static void main(String[] args) {

        Cat cat = new Cat(30,2,"Кот");
        cat.run(50);
        cat.jump(4);
        cat.run(15);
        cat.jump(1);
        cat.swim(40);
        Dog dog = new Dog(20,3,"Собака");
        dog.run(30);
        dog.jump(4);
        dog.jump(1);
        dog.run(10);
        dog.swim(30);
        dog.swim(5);

        // task3_zagadat_chislo();

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

