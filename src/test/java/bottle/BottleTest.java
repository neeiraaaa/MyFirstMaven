package bottle;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import project.stuff.SparklingWater;
import project.vessel.Bottle;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class BottleTest {

    double volume;
    SparklingWater water;
    int temperature;


    public BottleTest (double volume, int temperature) {
        this.volume = volume * 10000;
        this.temperature = 21;
    }

    @Parameterized.Parameters
    public static List<Object[]> inputData() {
        return Arrays.asList(new Object[][]{
                {new Bottle (1), 21}
        });
    }

    // @Test
    //public void TestBottleBubbleVolume () {
    //Assert.assertEquals("бутылка заполняется массивом из пузырьков из рассчета 10000 на каждый литр ", volume);
    // }


    @Test
    public void warm (int temperature) {
        Assert.assertEquals("темература в бутылке", 21, temperature);

    }
}
