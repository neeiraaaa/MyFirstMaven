package project.stuff;

import project.stuff.Bubble;
import project.stuff.Water;

public class SparklingWater extends Water {

    private boolean isOpened;
    private Bubble[] bubbles;

//содержит конструктор, который сетает нужное количество пузырьков из рассчета, что 1 литр воды содержит 10 тыс пузырьков
// и вызывает внутренний метод isOpened();
    public SparklingWater(String color, String transparency, String smell, int temperature) {
        isOpened();
    }


    //есть публичный метод void setOpened(boolean isOpened), который меняет состояние воды на "открытое"
// public setOpen(), который переводит состояние открытости true
    public void setOpened(boolean isOpened) {
        this.isOpened = isOpened;
    }

//есть приватный метод void isOpened(), который в новом потоке проверят состояние воды на "открытость"
// и в случае, если она открыта запускает метод degas()

//---- private isOpened(), который раз в 2 секунды (используем Thread.sleep()) проверяет,
// состояние закрытости в бутылке и если бутылка открылась, то запускает внутренний метод degas()
    private void isOpened() {
        if (isOpened) {
            degas();
        }
    }

//есть публичный метод void pump(Bubble[] bubbles), который сетает массив из пузырьков в воду
    public void pump(Bubble[] bubbles) {
        //  1 литр воды =10 тыс пузырьков
    }

//есть приватный метод degas(), который каждую секунду выпускает по партии пузырьков
// из рассчета 10 + 5 * температура_воды

// private degas(), который каждую секунду выпускает по партии пузырьков из рассчета 10 + 5 * температура_воды
    private void degas() {

    }

//есть публичный метод boolean isSparkle(), возвращающий true если в воде еще есть пузырьки газа
    public boolean isSparkle(boolean isSparkle) {
        System.out.printf("This is Sparkle water? It is: ").println();
        return isSparkle;
    }

    @Override
    public void mix() {

    }

    @Override
    public void setOpened() {

    }

    @Override
    public void setTemperature(int temperature) {

    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public String getTransparency() {
        return null;
    }

    @Override
    public String getSmell() {
        return null;
    }

    @Override
    public int getTemperature() {
        return 0;
    }
}
