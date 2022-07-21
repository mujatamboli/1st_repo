package utilities;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import test.BaseTest;

public class Listeners extends BaseTest implements ITestListener{
	
			public void onTestFailure(ITestResult result)
			{
				try
				{
					ScreenShot.captureScreen(driver,result.getName());
				}catch(IOException e)
				{
					e.printStackTrace();
				}
			}

}
