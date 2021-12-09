package TestNGDemos.demo2.demo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassThree {



    @Parameters({"myUrl","os"})
    @Test
    public void classThreeTest1(String u1,String oSystem)
    {
        System.out.println("url="+u1);
        System.out.println("Os="+oSystem);
        System.out.println("classThreeTest1");
    }
    @Test
    public void classThreeTest2()
    {
        System.out.println("classThreeTest2");
    }
    @Test
    public void classThreeTest3()
    {
        System.out.println("classThreeTest3");
    }
}
