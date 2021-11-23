package project.vessel;

import project.vessel.Containable;
import project.stuff.Transformable;
import project.vessel.Vessel;

public class Can extends Vessel implements Containable {

    @Override
    public void addStuff(Transformable stuff) {

    }

    @Override
    public Transformable removeStuff() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }


    @Override
    public void open() {

    }


    @Override
    public void warm(int temperature) {

    }
}
