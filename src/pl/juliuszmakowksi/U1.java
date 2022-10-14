package pl.juliuszmakowksi;

import java.util.ArrayList;

public class U1 extends Rocket{
    //fields

    int cost;
    int rocketWeight;
    int maxWeightWithCargo;
    double launchExplosionChance;
    double landingExplosionChance;

    public U1(ArrayList<Item> downloadedItems){
        this.cost = 100000000;
        this.rocketWeight = 10;
        this.maxWeightWithCargo = 18;
        this.launchExplosionChance = 0.05;
        this.landingExplosionChance = 0.01;
        ArrayList<Item> items = downloadedItems;
    }

    //methods
    public boolean land() {
        return super.land();
    }

    @Override
    public boolean launch() {
        return super.launch();
    }
    public int rocketCarriageWeight(int rocketWeight, int maxWeightWithCargo){
        int mass = (maxWeightWithCargo - rocketWeight) * 1000;

        return mass;
    }
}