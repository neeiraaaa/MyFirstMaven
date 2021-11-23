package project.stuff;

import java.util.Arrays;

public class SparklingWater extends Water {

    private boolean isOpened;
    private Bubble[] bubbles;

    public SparklingWater(String color, String transparency, String smell, int temperature){
        isOpened();
    }
//содержит конструктор, который сетает нужное количество пузырьков из рассчета, что 1 литр воды содержит 10 тыс пузырьков
// и вызывает внутренний метод isOpened();
    public SparklingWater(double volume) {
        var count = (int) Math.round(volume * 10000);
        bubbles = new Bubble[count];
        for (int i = 0; i < count; i++) {
            bubbles[i] = new Bubble("air");
        }
        isOpened();
    }


    //есть публичный метод void setOpened(boolean isOpened), который меняет состояние воды на "открытое"
// public setOpen(), который переводит состояние открытости true
    public boolean setOpened(boolean isOpened) {
        this.isOpened = isOpened;
        return isOpened;
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
//у газировки есть метод degas(), который удаляет пузырьки по одному и вызывает их лопанье
    private void degas() {
        if (this.isSparkle(true)){
            System.out.println("Output part of bubbles every second");
            int expectedCount = (10 + 5) * this.getTemperature();
            int possibleBubblesAmount = Math.min(expectedCount, this.bubbles.length);
            for (int i = 0; i < possibleBubblesAmount; i++) {
                Bubble b = this.bubbles[i];
                b.cramp();
                this.bubbles = Arrays.copyOfRange(this.bubbles, possibleBubblesAmount, this.bubbles.length-1);
            }
        }
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
