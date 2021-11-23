package people;

import org.junit.Assert;
import org.junit.Test;

public class ManualTestAge {

    @Test
    public void manualTestAge () {

        ManualEngineer manualEngineer = new ManualEngineer(27, 4);
        Assert.assertEquals("Person age is not correct: ", 27, manualEngineer.getAge());
    }

    @Test
    public void manualTestExperienceNew () {

        ManualEngineer manualEngineer = new ManualEngineer(34, 5);
        Assert.assertEquals("Person experience is not correct: ", 5, manualEngineer.getExperience());
    }

    @Test
    public void manualTestSkills () {

        ManualEngineer manualEngineer = new ManualEngineer(34, 5);
        Assert.assertEquals("Person skills is not correct: ", 10, manualEngineer.getSkill());
    }

    @Test
    public void setterTestAge () {

        ManualEngineer manualEngineer = new ManualEngineer(34, 5);
        manualEngineer.setAge(34);
        Assert.assertEquals("Person age is not correct: ", 34, manualEngineer.getAge());
    }

    @Test
    public void setterTestExperience() {

        ManualEngineer manualEngineer = new ManualEngineer(34, 5);
        manualEngineer.setExperience(5);
        Assert.assertEquals("Person experience is not correct: ", 5, manualEngineer.getExperience());
    }

    @Test
    public void setterTestSkills() {

        ManualEngineer manualEngineer = new ManualEngineer(34, 5);
        manualEngineer.setSkill(5);
        Assert.assertEquals("Person skills is not correct: ", 5, manualEngineer.getSkill());
    }


}
