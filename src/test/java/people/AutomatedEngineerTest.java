package people;

import org.junit.Assert;
import org.junit.Test;

public class AutomatedEngineerTest {

    @Test
    public void automatedTestAge () {

        AutomatedEngineer automatedEngineer = new AutomatedEngineer (28, 4);
        Assert.assertEquals("Person age is not correct: ", 28, automatedEngineer.getAge());
    }

    @Test
    public void automatedTestExperienceNew () {

        AutomatedEngineer automatedEngineer = new AutomatedEngineer (34, 3);
        Assert.assertEquals("Person experience is not correct: ", 3, automatedEngineer.getExperience());
    }

    @Test
    public void automatedTestSkills () {

        AutomatedEngineer automatedEngineer = new AutomatedEngineer(34, 2);
        Assert.assertEquals("Person skills is not correct: ", 6, automatedEngineer.getSkill());
    }

    @Test
    public void setterTestAge () {

        AutomatedEngineer automatedEngineer = new AutomatedEngineer(34, 5);
        automatedEngineer.setAge(34);
        Assert.assertEquals("Person age is not correct: ", 34, automatedEngineer.getAge());
    }

    @Test
    public void setterTestExperience() {

        AutomatedEngineer automatedEngineer = new AutomatedEngineer(34, 5);
        automatedEngineer.setExperience(5);
        Assert.assertEquals("Person experience is not correct: ", 5, automatedEngineer.getExperience());
    }

    @Test
    public void setterTestSkills() {

        AutomatedEngineer automatedEngineer = new AutomatedEngineer(34, 5);
        automatedEngineer.setSkill(5);
        Assert.assertEquals("Person skills is not correct: ", 5, automatedEngineer.getSkill());
    }
}
