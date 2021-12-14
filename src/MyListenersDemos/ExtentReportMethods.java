package MyListenersDemos;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportMethods {


    public static ExtentReports initExtent()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Report/report.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setReportName("Regression Report");
        reporter.config().setDocumentTitle("Stock Management System");

        extent.setSystemInfo("Project Name","Stock Management");
        extent.setSystemInfo("Testers Name","Sudhir");
        extent.setSystemInfo("Developers Name","Anjali");
        extent.setSystemInfo("Project Dead line","31-Dec-2021");

        return extent;

    }
}
