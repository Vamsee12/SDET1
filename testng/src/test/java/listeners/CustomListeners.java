package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners implements ITestListener {

	// belong to ITestListener and will execute before starting of test set/batch
	public void onStart(ITestContext arg) {
		System.out.println("starts test execution..." + arg.getName());
	}

	// belong to ITestListener and will execute after starting of test set/batch
	public void onFinish(ITestContext arg) {
		System.out.println("Finish test execution..." + arg.getName());
	}

	// belong to ITestListener and will execute before the main test start i.e.,
	// @Test
	public void onTestStart(ITestResult arg) {
		System.out.println("Starts test execution..." + arg.getName());
	}

	// belong to ITestListener and will execute when a test is skipped
	public void onTestSkipped(ITestResult arg) {
		System.out.println("skipped test..." + arg.getName());
	}

	// belong to ITestListener and will execute when a test is passed
	public void onTestSucess(ITestResult arg) {
		System.out.println("passed test..." + arg.getName());
	}

	// belong to ITestListener and will execute when a test is failed
	public void onTestFailure(ITestResult arg) {
		System.out.println("failed test..." + arg.getName());
	}

	// belong to ITestListener and not so imp ignore for now
	public void onTestFailedButWithSucessPercentage(ITestResult arg) {

	}

}
