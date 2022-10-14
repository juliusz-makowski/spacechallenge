package pl.juliuszmakowksi;

public class U2 extends Rocket{
    //field

    int cost = 120000000;
    int rocketWeight = 18;
    int maxWeightWithCargo = 29;
    double launchExplosionChance = 0.04;
    double landingExplosionChance = 0.08;

    //methods


    @Override
    public boolean land() {
        return super.land();
    }

    @Override
    public boolean launch() {
        return super.launch();
    }


}
