package pl.juliuszmakowksi;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

public ArrayList<String> loadItems(String path) throws Exception{

    File file = new File(path);
    Scanner scanner = new Scanner(file);
    ArrayList<String> list = new ArrayList<String>();

    while(scanner.hasNextLine()){
        list.add(scanner.next());
    }
    return list;
}
public ArrayList<String> loadU1(ArrayList<String> list){


    int size = list.size();
}


}
