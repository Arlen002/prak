package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cow cow1 = new Cow("kara ui", 5, "urgachy", 200);
        Cow cow2 = new Cow("Борка", 4, "Эркек", 220);
        Cow cow3 = new Cow("Ала-уй", 6, "urgachy", 190);
        Cow cow4 = new Cow("Курон", 7, "urgachy", 200);
        Cow cow5 = new Cow("Вася", 5, "urgachy", 186);
        Cow cow6 = new Cow("Вася", 5, "urgachy", 186);
        Cow[] cows = {cow1, cow2, cow3, cow4, cow5};
        Cow[] cows2 = {cow6};

        Sheep sheep1 = new Sheep("Кочкор", 4, "Эркек", 70);
        Sheep sheep2 = new Sheep("Ала-кой", 4, "ургачы", 50);
        Sheep sheep3 = new Sheep("Кара-кой", 4, "ургачы", 50);
        Sheep sheep4 = new Sheep("Кара-кой", 4, "ургачы", 50);
        Sheep[] sheeps = {sheep1, sheep2, sheep3};
        Sheep[] sheeps2 = {sheep4};

        Horse horse1 = new Horse("Бойка ", 10, "Эркек", 300, "Курон");
        Horse horse2 = new Horse("Ахилес ", 10, "Эркек", 300, "кара");
        Horse horse3 = new Horse("Ахилес2 ", 10, "Эркек", 305, "кара");
        Horse[] horses = {horse1, horse2};
        Horse[] horses2 = {horse3};

        Farm farm1 = new Farm("Kurbanabev Arlen", "Ул.Озерная 4", cows, sheeps, horses);
        Farm farm2 = new Farm("Болотбек уулу Эрмек ", "Ул.Озерная 4", cows2, sheeps2, horses2);
        System.out.println(" 1-Farmда 3 sheep, 5 cows, 2 horses бар.");
        farm1.getmethod();
        System.out.println();
        System.out.println(" 2-Farmда 1 sheep, 1 cow, 1 horse бар.");
        farm2.getmethod();

    }
}




