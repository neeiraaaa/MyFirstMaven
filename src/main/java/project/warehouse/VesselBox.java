package project.warehouse;

import project.vessel.Containable;

import java.util.List;
import java.util.Objects;

public class VesselBox {

    private String name = "I am box with <25> <Bottles>";
    //вместимость ящика
    private int capacity;
    //коллекция обьектов типа Containable
    private List<Containable> box;
    //уникальный ID для каждого нового обьекта, имеет геттер, но не сеттера, инициализируются в конструкторе
    private long id;

    // //конструктор, где инициализируются все 3 переменные
    public VesselBox(String name, long id, List<Containable> box) {
        this.name = name;
        this.box = box;
        this.id = id;
    }

    //переписанный метод equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VesselBox vesselBox = (VesselBox) o;
        return capacity == vesselBox.capacity && id == vesselBox.id && Objects.equals(name, vesselBox.name) && Objects.equals(box, vesselBox.box);
    }

    //переписанный метод hashCode, причем у каждого нового ящика он должен быть уникальным
    @Override
    public int hashCode() {
        return Objects.hash(name, capacity, box, id);
    }

    // на все есть геттеры (но нет сеттеров)
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Containable> getBox() {
        return box;
    }

    public long getId() {
        return id;
    }
}
