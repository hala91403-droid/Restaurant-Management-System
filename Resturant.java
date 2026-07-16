
package com.mycompany.resturant;


public class Resturant {
    interface Item{
        public String name();
        public Packing packing();
        public float price();
    }
    interface Packing{
        public String pack();
    }

    public static void main(String[] args) {
        mealbuilder mealBuilder = new mealbuilder();
        meal vegMeal = mealBuilder.preparingveg();
        System.out.println("Vegetarian Meal:");
        vegMeal.Show();
        System.out.println("Total Cost: " + vegMeal.getcost());
        System.out.println("---------------------");
        meal nonVegMeal = mealBuilder.preparingnoneveg();
        System.out.println("Non-Vegetarian Meal:");
        nonVegMeal.Show();
        System.out.println("Total Cost: " + nonVegMeal.getcost());
    }
}
    

