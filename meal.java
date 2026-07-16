
package com.mycompany.resturant;
import com.mycompany.resturant.Resturant.Item;
import java.util.ArrayList;

public class meal {
    private ArrayList<Item>items=new ArrayList<Item>();
    void addItem(Item item){
        items.add(item);}
    public float getcost(){
        float cost=0.0f;
        for(Item item:items){
            cost+=item.price();}
        return cost;
        }
    public void Show (){
        for(Item item:items){
            System.out.println(" the item :"+item.name());
            System.out.println("the price :"+item.price());
            System.out.println("the packing "+item.packing().pack());
        }
        
    }
    }
