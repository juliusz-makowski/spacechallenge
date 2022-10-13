package pl.juliuszmakowksi;

public class U1 extends Rocket{
    //fields

    int cost = 100000000;
    double rocketWeight = 10.0;
    double maxWeightWithCargo = 18.0;
    double launchExplosionChance = 0.05;
    double landingExplosionChance = 0.01;


    //methods
    public boolean land() {
        return super.land();
    }

    @Override
    public boolean launch() {
        return super.launch();
    }

}