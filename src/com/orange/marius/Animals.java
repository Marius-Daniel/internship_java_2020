package com.orange.marius;

import java.util.ArrayList;

import static com.orange.marius.AnimalMethods.*;


public class Animals {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        Porc porkyPig = new Porc();
        Gaina chick = new Gaina();
        Vultur hawk = new Vultur();
        Crocodil croco = new Crocodil();

        animals.add(porkyPig);
        animals.add(chick);
        animals.add(hawk);
        animals.add(croco);


        getAnimals(animals);
        isInstanceOfAnimal(animals);
        isDomesticOrSalbatic(animals);
        modDeplasare(animals);

        chick.setNume("Twity");
        hawk.setNume("Hawk");
        croco.setNume("Croco");
        porkyPig.setNume("Porky");
        System.out.println(porkyPig.getNume());
        porkyPig.mananca();
        porkyPig.sunet();
        porkyPig.utilitate();
        porkyPig.merge();


    }
}