package TestNGDemos.demo2.demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwo {

    @Parameters({"myUrl","os"})
    @Test
    public void classTwoTest1(String u1,String oSystem)
    {
        System.out.println("url="+u1);
        System.out.println("Os="+oSystem);
        System.out.println("classTwoTest1");
    }
    @Test //(enabled = false)
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
