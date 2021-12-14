package TestNGDemos.demo;


import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassTwo {

    @Test
    public void classTwoTest1()
    {
        System.out.println("classTwoTest1");
        Assert.assertEquals(true,false,"this test is failed");
    }
    @Test (groups = "email") //(enabled = false)
    public void classTwoTest2()
    {
        System.out.println("classTwoTest2");
    }
    @Test
    public void classTwoTest3()
    {
        System.out.println("classTwoTest3");
    }
}
