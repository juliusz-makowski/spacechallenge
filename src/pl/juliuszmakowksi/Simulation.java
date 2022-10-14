package pl.juliuszmakowksi;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

public ArrayList<Item> loadItems(String path) throws Exception{

    File file = new File(path);
    Scanner scanner = new Scanner(file);
    ArrayList<Item> itemList = new ArrayList<>();

    while(scanner.hasNextLine()){
        String zet = scanner.nextLine();

        String[] token = zet.split("=");

        itemList.add ( new Item(token[0], Integer.parseInt(token[1])));
    }
    return itemList;
}
public ArrayList<U1> loadU1(ArrayList<Item> list){

    ArrayList<U1> u1 = new ArrayList<>();

    int size = list.size();
    int total = 0;

    for(Item item: list){
       int mass = item.getWeight();
       total += mass;

        if (total <= u1.rocketCarriageWeight();){
            u1.add(item);
        }

    }

}


}
