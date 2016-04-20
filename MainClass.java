package com.example;

public class MainClass {


    public static void main(String[] args) {
        System.out.println("Hi hello java");

        NutritionFacts nutritionFacts = new NutritionFacts.Builder(240, 8).calories(8).fat(3).carbohydrate(83).sodium(6).build();

    }
}
