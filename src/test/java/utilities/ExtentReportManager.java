package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import static testBase.BaseClass.captureScreenshot;

public class ExtentReportManager implements ITestListener {

    public ExtentSparkReporter sparkReporter;
    public ExtentReports extent;
    public ExtentTest test;

    String repName;

    @Override
    public void onStart(ITestContext testContext) {

        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        repName = "Test-Report-" + timeStamp + ".html";

        sparkReporter = new ExtentSparkReporter("./Reports/" + repName);
        sparkReporter.config().setDocumentTitle("PPBL Web Automation Report");
        sparkReporter.config().setReportName("PPBL Links and Titles Testing");
        sparkReporter.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        // System Information
        extent.setSystemInfo("Application", "Paytm Payments Bank Website");
        extent.setSystemInfo("Operating System", System.getProperty("os.name"));
        extent.setSystemInfo("User Name", System.getProperty("user.name"));
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("Tester", "Shivam Verma");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test = extent.createTest(result.getName());
        test.pass("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        test = extent.createTest(result.getName());
        test.fail(result.getThrowable());

        // Capture Screenshot
        try {
            String screenshotPath = captureScreenshot(result.getName());

            // Attach screenshot to Extent Report
            test.addScreenCaptureFromPath(screenshotPath);

        } catch (Exception e) {
            test.fail("Failed to attach screenshot: " + e.getMessage());
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test = extent.createTest(result.getName());
        test.skip("Test Skipped");
    }

    @Override
    public void onFinish(ITestContext testContext) {
        extent.flush();
    }
}
