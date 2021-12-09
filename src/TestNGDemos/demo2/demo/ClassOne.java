package TestNGDemos.demo2.demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassOne {



    @Parameters({"myUrl","os"})
    @Test
    public void classOneTest1(String u1,String oSystem)
    {
        System.out.println("url="+u1);
        System.out.println("Os="+oSystem);
        System.out.println("classOneTest1");
    }
    @Test
    public void classOneTest2()
    {
        System.out.println("classOneTest2");
    }
    @Test
    public void classOneTest3()
    {
        System.out.println("classOneTest3");
    }
}
