package pl.juliuszmakowksi;

public class U2 extends Rocket{
    //field

    int cost = 120000000;
    double rocketWeight = 18.0;
    double maxWeightWithCargo = 29.0;
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
