package project.vessel;

import project.stuff.Transformable;
import project.stuff.SparklingWater;

import java.util.Arrays;
import java.util.Objects;

public class Bottle extends Vessel implements Containable {

//содержит приватные поля double volume, SparklingWater water
    private double volume;
    private SparklingWater water;
    private int [] arrayBubbles;

//содержит конструктор Bottle(double volume), в котором бутылка заполняется массивом из пузырьков из рассчета 10000 на каждый литр
    public Bottle(double volume) {
        this.volume = volume;
        this.arrayBubbles = new int[(int) (volume * 10000)];
    }

    //есть публичный метод void open(), который меняет состояние воды в "открытое" (приблизительно, как this.water.setOpened(true);)
    public void open() {
       this.water.setOpened(true);
   }

    //есть публичный метод void warm(int temperature), который устанавливает температуру воды в бутылке
    public void warm(int temperature) {
        water.setTemperature(temperature);
    }

    //есть публичный метод SparklingWater getWater() возвращающий обьект воды
    public  SparklingWater getWater() {
        return new SparklingWater(water.getColor(), water.getTransparency(), water.getSmell(), water.getTemperature());
    }

//есть публичный метод setWater(SparklingWater water) добавляющий новый обьект воды
    public SparklingWater setWater(SparklingWater water) {
        return new SparklingWater(water.getColor(), "normal", "powerful", 213);
    }

    @Override
    public double getVolume() {
        return volume;
    }

    @Override
    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int[] getArrayBubbles() {
        return arrayBubbles;
    }

    public void setArrayBubbles(int[] arrayBubbles) {
        this.arrayBubbles = arrayBubbles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bottle bottle = (Bottle) o;
        return Double.compare(bottle.volume, volume) == 0 && Objects.equals(water, bottle.water) && Arrays.equals(arrayBubbles, bottle.arrayBubbles);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(volume, water);
        result = 31 * result + Arrays.hashCode(arrayBubbles);
        return result;
    }

    @Override
    public String toString() {
        return "Bottle{" +
                "volume=" + volume +
                ", water=" + water +
                ", arrayBubbles=" + Arrays.toString(arrayBubbles) +
                '}';
    }

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
}
