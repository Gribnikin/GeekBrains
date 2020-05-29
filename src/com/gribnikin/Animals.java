package com.gribnikin;

/*
1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
В качестве параметра каждому методу передается величина, означающая
или длину препятствия (для бега и плавания), или высоту (для прыжков).
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true)
5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
 */

public abstract class Animals {
private int dlinaMax;
private int visotaMax;
private String nameAnimals;

    public Animals(int dlinaMax, int visotaMax, String nameAnimals) {
        this.dlinaMax = dlinaMax;
        this.visotaMax = visotaMax;
        this.nameAnimals = nameAnimals;
    }

    public void run(int d)
    {
        if (d>this.dlinaMax)
            System.out.format("Животное %s не может пробежать на длину %d потому что оно максимально может пробежать - %d м. \n", this.nameAnimals, d,this.dlinaMax);
        else System.out.format("Животное %s пробежало на длину %d м.\n", this.nameAnimals, d);
    };
    public abstract void swim(int d);
    public void jump(int h)
    {
        if (h>this.visotaMax)
            System.out.format("Животное %s не может прыгнуть в высоту %d потому что оно максимально может прыгнуть на - %d м. \n", this.nameAnimals, h,this.visotaMax);
        else System.out.format("Животное %s прыгнудо в выстоту %d м. \n", this.nameAnimals, h);
    };

}
