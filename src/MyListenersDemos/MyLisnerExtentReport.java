package MyListenersDemos;

import TestNGDemos.sites.OpenCloseBrowser;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

import static MyListenersDemos.ExtentReportMethods.initExtent;
import static Util.ScreenShot.takingScreenshot;

public class MyLisnerExtentReport extends OpenCloseBrowser implements ITestListener {


    ExtentTest test;
    public void onTestStart(ITestResult result) {

        System.out.println("onTestStart");
        test = extent.createTest(result.getMethod().getMethodName());

    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess");
        test.pass("This test is passed");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure");
        test.info("This test is failed");
        test.fail(result.getThrowable());
        try {
            test.addScreenCaptureFromPath("./screenshots/"+takingScreenshot(driver));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped");
        test.skip("This test is skipped");
    }

    ExtentReports extent;

    public void onStart(ITestContext context) {
        System.out.println("onStart - Test tag");

        if (extent==null)
            extent = initExtent();
    }

    public void onFinish(ITestContext context) {
        System.out.println("onFinish - Test tag");

        extent.flush();
    }
}
