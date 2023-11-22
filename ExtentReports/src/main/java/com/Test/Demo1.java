package com.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Demo1 {

	public static void main(String[] args) { 
		
		// Step 1: Set up Extent Reports configuration
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("C:\\Automation\\OOB_Project\\ExtentReports\\report\\report.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        // Step 2: Create an ExtentTest object for each test case
        ExtentTest test = extent.createTest("Your Test Case Name", "Description of your test case");

        // Step 3: Add steps, expected/actual results, and other details to the ExtentTest object
        String stepName = "Login to the application";
        String expectedResults = "Should be able to login to the application";
        String actualResults = "Successfully logged in to the application";

        test.log(Status.INFO, "Status: ");
        test.log(Status.INFO, "Timestamp: ");
        test.log(Status.INFO, "Step Name: " + stepName);
        test.info("Details:");
        test.info("Expected Results: " + expectedResults);
        test.info("Actual Results: " + actualResults);

        // Step 4: Mark the test as Pass, Fail, or Skip
        test.pass("Test case passed!");

        // Step 5: Generate the report
        extent.flush();

        System.out.println("Report generated successfully!");}

}
