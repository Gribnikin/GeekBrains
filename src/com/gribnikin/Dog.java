package com.gribnikin;

public class Dog extends Animals {

    private int dlinaMax;
    private String nameAnimals;

    public Dog(int dlinaMax, int visotaMax, String nameAnimals) {
        super(dlinaMax, visotaMax, nameAnimals);
        this.dlinaMax=dlinaMax;
        this.nameAnimals=nameAnimals;
    }

    @Override
    public void swim(int d)  {
        if (d>dlinaMax)
            System.out.format("Животное %s не может проплыть на длину %d потому что оно максимально может проплыть - %d м. \n", this.nameAnimals, d,this.dlinaMax);
        else System.out.format("Животное %s проплыло на длину %d м.\n", this.nameAnimals, d);
    };

}
