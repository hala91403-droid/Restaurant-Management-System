
package com.mycompany.resturant;
import com.mycompany.resturant.Resturant.Item;
import com.mycompany.resturant.Resturant.Packing;

abstract class drink implements Item{
    @Override
    public Packing packing(){
        return new bottle();
    }
    @Override
    public abstract float price();
}

