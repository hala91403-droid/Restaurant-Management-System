
package com.mycompany.resturant;


public class mealbuilder {
    public meal preparingveg(){
        meal Meal=new meal();
        Meal.addItem(new veg());
        Meal.addItem(new coke());
        return Meal;
    }
     public meal preparingnoneveg(){
         meal Meal=new meal();
         Meal.addItem(new chiken());
         Meal.addItem(new pepsi());
         return Meal;
     }
}



