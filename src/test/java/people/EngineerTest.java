package people;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class EngineerTest {

    Engineer engineer;
    int age, skill, experience;

    public EngineerTest(Engineer engineer, int age, int skill, int experience) {
        this.engineer = engineer;
        this.age = age;
        this.skill = skill;
        this.experience = experience;
    }

    @Parameterized.Parameters
    public static List<Object[]> inputData() {
        return Arrays.asList(new Object[][]{
                {new ManualEngineer(34, 5), 34, 10, 5},
                {new AutomatedEngineer(34, 5), 34, 15, 5}
        });
    }

    @Test
    public void TestAge () {
        Assert.assertEquals("Person age is not correct: ", age, engineer.getAge());
    }

    @Test
    public void  TestExperienceNew () {
        Assert.assertEquals("Person experience is not correct: ", experience, engineer.getExperience());
    }

    @Test
    public void  TestSkills () {
        Assert.assertEquals("Person skill is not correct: ", skill, engineer.getSkill());
    }

    @Test
    public void setterTestAge () {
        engineer.setAge(34);
        Assert.assertEquals("Person age is not correct: ", 34, engineer.getAge());
    }

    @Test
    public void setterTestExperience() {
        engineer.setExperience(5);
        Assert.assertEquals("Person experience is not correct: ", 5, engineer.getExperience());
    }

    @Test
    public void setterTestSkills() {
        engineer.setSkill(5);
        Assert.assertEquals("Person skills is not correct: ", 5, engineer.getSkill());
    }

}
