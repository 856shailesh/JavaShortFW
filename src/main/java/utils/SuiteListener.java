package utils;



import com.aventstack.extentreports.utils.FileUtil;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import test.java.BaseTest;


import java.io.File;
import java.io.IOException;

public class SuiteListener implements ITestListener {

    @Override
    public void onTestStart (ITestResult iTestResult){

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        String filename = System.getProperty("user.dir")+ File.separator + "screenshots" + File.separator + iTestResult.getMethod().getMethodName();
        File f = ((TakesScreenshot) BaseTest.driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtil.copyFile(f, new File( filename + ".png"));
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
    }


    @Override
    public void onStart(ITestContext iTestContext) {
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
    }


}

