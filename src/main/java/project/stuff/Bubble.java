package project.stuff;

public class Bubble  {

    public static final double VOLUME = 03;
    private String gas;

//содержит конструктор Bubble(String gas), в который передается строка с названием газа пузырька
    public Bubble(String gas) {
        System.out.printf("Gas name is: %s", gas).println();
        this.gas = gas;
    }

    public String getGas() {
        return gas;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }

//есть публичный метод void cramp(), который в консоль выводит слово "Cramp!"
    public void cramp() {
        System.out.println("Cramp!");
    }

//есть публичный метод double getVolume(), возвращающий обьем пузырька
    public double getVolume() {
        System.out.printf("Volume of bubble is: %s", VOLUME).println();
        return VOLUME;
    }
}
