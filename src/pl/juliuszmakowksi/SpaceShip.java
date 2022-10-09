package pl.juliuszmakowksi;

public interface SpaceShip {

    boolean launch();       //return true or false if the launch was successful or if the rocket has crashed.
    boolean land();         //return true or false if landing was successful or not.
    boolean canCarry();     //takes Item as an argument and return true or false if rocket can carry such item or
                            //exceed the weight limit.
    int carry();            // takes Item as an argument and updates current weight of rocket
}
