
package com.mycompany.resturant;

import com.mycompany.resturant.Resturant.Item;
import com.mycompany.resturant.Resturant.Packing;

abstract class burger implements Item {
    @Override
    public Packing packing(){
        return new wrapper();}
       @Override
    public abstract float price();
}


