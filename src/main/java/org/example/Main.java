package org.example;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import helpers.HelperClass;
import pageobject.profile.Profile;
import java.net.MalformedURLException;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends HelperClass {
    public static void main(String[] args) throws MalformedURLException{
        ExtentReporter extentReporter=new ExtentReporter() {

        };

        ExtentReports extentReports=new ExtentReports();
        extentReports.attachReporter();

        ExtentTest extentTest=extentReports.createTest("24/7 First Test");
    }
}