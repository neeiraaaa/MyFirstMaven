package project.warehouse;

import project.materials.Material;
import project.stuff.Transformable;
import project.vessel.Containable;

public class Factory {

    //обьект склада для хранения ящиков с геттерами и сеттерами
    private Warehouse warehouse;

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    //метод для создания ящика, прнимающий его вместимость, обьем тары, материал тары, содержимое тары, класс тары
    public void createVesselBox(int capacity, double volume, Material material, Transformable stuff, Class<?> clazz) {

    }

    // метод для создания бутылки с содержимым, прнимающий обьем тары, материал тары, содержимое тары, класс тары,
    // вызывается в методе createVesselBox
    private Containable createVessel(double volume, Material material, Transformable stuff, Class<?> clazz) {
        return null;
    }
}
