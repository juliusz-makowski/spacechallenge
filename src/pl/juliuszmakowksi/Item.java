package pl.juliuszmakowksi;

import java.util.ArrayList;

public class Item {
    // field
    String name;
    int weight;

    // methods

    public Item(String n, int w){

        this.name = n;
        this.weight = w;
    }
    public String getName(){

       return name;
    }

    public int getWeight(){

        return weight;

    }


}
