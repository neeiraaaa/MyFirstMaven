package project.warehouse;

import java.util.Map;

public class Warehouse {

    //является хранилищем ящиков
    private Map<Integer, VesselBox> stock;

    //для добавления ящиков в хранилище
    public void addBox(VesselBox box) {

    }

    //для получения содержимого ящиков
    VesselBox getBox() {
        return null;
    }

    //для удаления ящиков
    void removeBox() {

    }

   //при добавлении/удалении ящиков Stocktaking обновляет информацию о состоянии склада
}
