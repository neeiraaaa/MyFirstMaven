package project.runner;

import project.vessel.Bottle;

public class Runner {
    public static void main(String[] args) {

        Bottle bottle = new Bottle(1);
        bottle.open();
        bottle.warm(23);
        bottle.getWater();
        bottle.setWater(bottle.getWater());

    }
}
