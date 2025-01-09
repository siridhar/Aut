package Mobile.automation;
import java.io.File;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Scanner;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AgentApp {
	
	WebDriverWait wait;

	@Test
	public void appiumtest() throws MalformedURLException, InterruptedException
	{
		AppiumDriverLocalService service=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Microgrid\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();

		service.start();

		UiAutomator2Options options= new UiAutomator2Options();
		options.setDeviceName("emulator-5554");
		options.setApp("C:\\Users\\Microgrid\\eclipse-workspace\\automation\\src\\test\\java\\Resource\\application-3a7e45ae-fea4-445e-9d7e-3f151130a4f3.apk");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		assert driver.findElement(By.xpath("//android.widget.Button[@text='Allow']")).isDisplayed() : "The 'Allow' button is visible.";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//android.widget.Button[@text=\"Allow\"]")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Skip\")")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Get Started\")")).click();
		driver.findElement(By.className("android.widget.EditText")).sendKeys("9618960221");
		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Login\")")).click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement Mpin = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().text(\"Enter 4 Digit MPIN\")")));
		System.out.println(driver.isKeyboardShown());
		driver.pressKey(new KeyEvent(AndroidKey.DIGIT_3));
		driver.pressKey(new KeyEvent(AndroidKey.DIGIT_0));
		driver.pressKey(new KeyEvent(AndroidKey.DIGIT_8));
		driver.pressKey(new KeyEvent(AndroidKey.DIGIT_8));	 
		driver.hideKeyboard();
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Submit\"]")).click();
		//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement homepage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"Services\"]")));
		//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"Training Centre\"))"));
		//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"Services\"))"));

		//		Loans

		//		WebElement Loan_Module = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@content-desc=\"LOAN\"]/android.view.ViewGroup")));
		//		Loan_Module.click();
		//		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Name *\"]/android.widget.EditText")).sendKeys("Hello");
		//		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Phone Number *\"]/android.widget.EditText")).sendKeys("7896543329");
		//		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"PAN No\"]/android.widget.EditText")).sendKeys("HHHHH1234H");
		//		//		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
		//		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		//
		Scanner scanner=new Scanner(System.in);
		//		System.out.println("Enter the loantype:");
		//		String loantype=scanner.nextLine();
		//
		//		WebElement dropdown=driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Select Loan Type *, \"]"));
		//		dropdown.click();
		//
		//		WebElement loanoption;
		//
		//		switch(loantype)
		//		{
		//		case "Personal":
		//			loanoption= driver.findElement(By.xpath("//android.widget.TextView[@text=\"Personal Loan\"]"));
		//			break;
		//
		//		case "House":
		//			loanoption= driver.findElement(By.xpath("//android.widget.TextView[@text=\"House Loan\"]"));
		//			break;
		//
		//		case "Vehicle":
		//			loanoption=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Vehicle Loan\")"));
		//			break;
		//
		//		case "Business":
		//			loanoption = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Business Loan\")"));
		//			break;
		//
		//		case "Education":
		//			loanoption = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Education Loan\")"));
		//			break;
		//
		//		case "Others":
		//			loanoption = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Others\")"));
		//			break;
		//
		//		default:
		//			System.out.println("Invalid loan type provided.");
		//			return; // Exit if the loan type is invalid
		//
		//		}
		//
		//		loanoption.click();
		//
		//		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Salaried\"]")).click();
		//		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Gross\"]/android.widget.EditText")).sendKeys("900000");
		//		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Take Home\"]/android.widget.EditText")).sendKeys("80000");
		//		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Loan Required *\"]/android.widget.EditText")).sendKeys("500000");
		//		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Loan Tenure (In Yrs) *\"]/android.widget.EditText")).sendKeys("5");
		//		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Select Loan Priority, \"]")).click();
		//		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Low\"]")).click();
		//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"Submit\"));"));
		//		//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"Pin Code *\"));"));
		//		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Pin Code *\"]/android.widget.EditText")).sendKeys("530017");
		//		Thread.sleep(1000);
		//		//		wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		//		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Submit\"]")).click();
		//		WebElement Thankyou = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"Thank you!\"]")));
		//		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Back to Home\"]")).click();
		//		//		driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
		//		//		driver.findElement(By.xpath("//android.widget.TextView[@text=\"My Leads \"]")).click();
		//		//		WebElement Addlead = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"ADD LEAD\"]")));
		//		//		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"ADD LEAD\")")).click();



		//		Insurance



		//		WebElement Insurance_Module=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@content-desc=\"INSURANCE\"]/android.view.ViewGroup/android.widget.ImageView")));
		//		Insurance_Module.click();
		//
		//
		//		System.out.println("Enter select insurance:");
		//		String selectinsurance=scanner.nextLine();
		//
		//		WebElement Insurancedopdown=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Select Types of Insurance, \")"));
		//		Insurancedopdown.click();
		//		WebElement insuranceoption;
		//
		//		switch(selectinsurance)
		//		{
		//		case "Health":
		//			insuranceoption=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Health Insurance\")"));
		//			break;
		//
		//		case "Motor":
		//			insuranceoption=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Motor Insurance\")"));
		//			break;
		//
		//		case "Travel":
		//			insuranceoption=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Travel Insurance\")"));
		//			break;
		//
		//		case "Transit":
		//			insuranceoption=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Transit Insurance\")"));
		//			break;
		//
		//		case "life":
		//			insuranceoption=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Life/Term Insurance\")"));
		//			break;
		//
		//		case "Gadget":
		//			insuranceoption=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Gadget Insurance\")"));
		//			break;
		//
		//		case "Other":
		//			insuranceoption=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Others\")"));
		//			break;
		//
		//		default:
		//			System.out.println("Invalid insurance selection provided.");
		//			return;
		//		}
		//
		//		insuranceoption.click();
		//		if(insuranceoption.getText().equals("Health Insurance"))
		//		{
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)")).sendKeys("Testing");
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)")).sendKeys("7896543329");
		//
		//			System.out.println("Enter insurance type:");
		//			String insurancetype=scanner.nextLine();
		//
		//			WebElement type;
		//			//String type1;
		//
		//			switch(insurancetype)
		//			{
		//			case "New":
		//				type=driver.findElement(AppiumBy.accessibilityId("New"));
		//				break;
		//			case "Renewal":
		//				type=driver.findElement(AppiumBy.accessibilityId("Renewal"));
		//				break;
		//			default:
		//				System.out.println("Invalid insurance type");
		//				return;
		//			}
		//
		//			type.click();
		//			if(insurancetype.equals("New"))
		//			{
		//				driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(55)")).click();
		//				driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"Submit\"));"));
		//				driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Self Age, \")")).click();
		//				driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"6\")")).click();
		//				driver.findElement(AppiumBy.accessibilityId("None")).click();
		//				driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Submit\")")).click();	
		//				driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Back to Home\")")).click();
		//			}
		//
		//			else 
		//			{
		//				driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"Submit\"));"));
		//				driver.findElement(AppiumBy.accessibilityId("None")).click();
		//				driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Submit\")")).click();	
		//				driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Back to Home\")")).click();
		//			}
		//
		//		}
		//
		//		else if(insuranceoption.getText().equals("Motor Insurance")) 
		//		{
		//			//				driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"2 wheeler\")")).click();
		//
		//			WebElement MItype;
		//			System.out.println("Enter the Motor Insurance type (2 wheeler,4 wheeler,Other): ");
		//			String MIOption = scanner.nextLine(); // Capture the input
		//
		//
		//
		//			switch (MIOption.toLowerCase())
		//			{
		//			case "2 wheeler":
		//				MItype = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"2 wheeler\")"));
		//				break;
		//			case "4 wheeler":
		//				MItype = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"4 wheeler\")"));
		//				break;
		//			case "Other":
		//				MItype = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Other\")\")"));
		//				break;
		//			default:
		//				System.out.println("Invalid Vehical selected.");
		//				return; // Exit if the loan type is invalid
		//			}
		//
		//			MItype.click(); 
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)")).sendKeys("Ap21cw3088");
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)")).sendKeys("Testing");
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(2)")).sendKeys("7986543210");
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"New\")")).click();
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"Submit\"));"));
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Submit\")")).click();
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Back to Home\")")).click();
		//		}
		//		else if(insuranceoption.getText().equals("Travel Insurance"))
		//		{
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)")).sendKeys("Testing");
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)")).sendKeys("7890654321");
		//			System.out.println("Enter Travel insurance:");
		//			String travelinsurance=scanner.nextLine();
		//
		//
		//			if(travelinsurance.equals("Domestic Travel Insurance"))
		//			{
		//				driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"\").instance(2)")).click();
		//				driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Domestic Travel Insurance\")")).click();
		//				driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Enter the state you are travelling to ? *\"));"));
		//				driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Age\").instance(0)")).sendKeys("35");
		//				driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Enter your travelling state\"]/android.widget.EditText")).sendKeys("Hyderabad");
		//				driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Request Quote\"));"));
		//				driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"dd-mm-yyy\").instance(0)")).click();
		//				driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"2024-12-26\")")).click();
		//				driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"dd-mm-yyy\").instance(1)")).click();
		//				driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"2024-12-31\")")).click();
		//				driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Request Quote\")")).click();
		//				driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Back to Home\")")).click();
		//
		//			}
		//			else 
		//			{
		//				driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Enter the country you are travelling to ? *\"));"));
		//				driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Age\").instance(0)")).sendKeys("35");
		//				//driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(4)")).sendKeys("Hyderabad");
		//				driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Enter your travelling country\"]/android.widget.EditText")).sendKeys("USA");
		//				driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Request Quote\"));"));
		//				driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"dd-mm-yyy\").instance(0)")).click();
		//				driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"2024-12-26\")")).click();
		//				driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"dd-mm-yyy\").instance(1)")).click();
		//				driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"2024-12-31\")")).click();
		//				driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Request Quote\")")).click();
		//				driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Back to Home\")")).click();
		//			}
		//		}
		//
		//		else if(insuranceoption.getText().equals("Transit Insurance"))
		//		{
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)")).sendKeys("Testing");
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)")).sendKeys("7890654321");
		//			driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Pin Code *\"]/android.widget.EditText")).sendKeys("500046");
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Submit\"));"));
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)")).sendKeys("Clothes");
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(2)")).sendKeys("50000");
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"dd-mm-yyy\").instance(0)")).click();
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"2024-12-26\")")).click();
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"dd-mm-yyy\").instance(1)")).click();
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"2024-12-31\")")).click();
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(3)")).sendKeys("Vizag");
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(4)")).sendKeys("Guntur");
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Submit\")")).click();
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Back to Home\")")).click();
		//
		//		}
		//		else if(insuranceoption.getText().equals("Life/Term Insurance"))
		//		{
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)")).sendKeys("Testing");
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)")).sendKeys("7890654321");
		//			driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"DD-MM-YYYY *\"]/android.widget.TextView[1]")).click();
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"2024-12-01\")")).click();
		//			System.out.println("Enter salaried type:");
		//			String employementtype=scanner.nextLine();
		//			WebElement emptype;
		//
		//			switch(employementtype)
		//			{
		//			case "Salaried":
		//				emptype=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Salaried\")"));
		//				break;
		//
		//			case "Self-Employed":
		//				emptype=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Self-Employed\")"));
		//				break;
		//
		//			default:
		//				System.out.println("Invalid employement type");
		//				return;
		//			}
		//
		//			emptype.click();
		//
		//			System.out.println("Enter Annual Income:");
		//			String Annual=scanner.nextLine();
		//			WebElement AI;
		//
		//			switch(Annual)
		//			{
		//			case "5L - 10L":
		//				AI=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"5L - 10L\")"));
		//				break;
		//
		//			case "10L - 20L":
		//				AI=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"10L - 20L\")"));
		//				break;
		//
		//			case "20L & Above":
		//				AI=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"20L & Above\")"));
		//				break;
		//
		//			default:
		//				System.out.println("Invalid Annual income type");
		//				return;
		//			}
		//			AI.click();
		//			
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Submit\"));"));
		//			
		//			System.out.println("Enter coverage type:");
		//			String coverage=scanner.nextLine();
		//			
		//			WebElement coveragetype;
		//			
		//			switch(coverage)
		//			{
		//			case "50L - 1Cr":
		//				coveragetype=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"50L - 1Cr\")"));
		//				break;
		//				
		//			case "2Cr - 4Cr":
		//				coveragetype=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"2Cr - 4Cr\")"));
		//				break;
		//				
		//			case "5cr & Above":
		//				coveragetype=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"5cr & Above\")"));
		//				break;
		//				
		//				default:
		//					System.out.println("Enter valid coverage");
		//					return;
		//			}
		//			coveragetype.click();
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"None\")")).click();
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)")).sendKeys("500046");
		//			Thread.sleep(2000);
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Submit\")")).click();
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Back to Home\")")).click();
		//
		//		}
		//		
		//		else if(insuranceoption.getText().equals("Gadget Insurance"))
		//		{
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)")).sendKeys("Testing");
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)")).sendKeys("7890654321");
		//			System.out.println("Enter insurance type:");
		//			String insurancetype=scanner.nextLine();
		//			
		//			WebElement type;
		//			
		//			switch(insurancetype)
		//			{
		//			case "New":
		//				type=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"New\")"));
		//				break;
		//				
		//			case "Renewal":
		//				type=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Renewal\")"));
		//				break;
		//				
		//				default:
		//					System.out.println("Invalid insurance type:");
		//					return;
		//			}
		//			
		//			type.click();
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Select Gadget Type, \")")).click();
		//			System.out.println("Enter gadget type:");
		//			String gadget=scanner.nextLine();
		//			
		//			if(gadget.equals("Mobile"))
		//			{
		//				driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Mobile Phone\")")).click();
		//			}
		//			else if(gadget.equals("Laptop"))
		//			{
		//				driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Laptop\")")).click();
		//			}
		//			else if(gadget.equals("Tablet"))
		//			{
		//				driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Tablet\")")).click();
		//			}
		//			else if(gadget.equals("Others"))
		//			{
		//				driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Others\")")).click();
		//			}
		//			
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Submit\"));"));
		//			driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"DD-MM-YYYY *\"]/android.widget.TextView[1]")).click();
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"2024-12-01\")")).click();
		//			driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Remarks *\"]/android.widget.EditText")).sendKeys("Testing");
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Submit\")")).click();
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Back to Home\")")).click();
		//
		//		}
		//		
		//		else if(insuranceoption.getText().equals("Others"))
		//		{
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)")).sendKeys("Testing");
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)")).sendKeys("7890654321");
		//			driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Write Description\"]/android.widget.EditText")).sendKeys("Testing");
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"Submit\"));"));
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Submit\")")).click();
		//			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Back to Home\")")).click();
		//		}

		//Investment Type

		WebElement Investment_Module=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@content-desc=\"INVESTMENT\"]/android.view.ViewGroup")));
		Investment_Module.click();
		System.out.println("Enter investment type:");
		String investment=scanner.nextLine();

		WebElement investmenttype;

		switch(investment)
		{
		case "Mutual":
			investmenttype=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"MUTUAL FUNDS\")"));
			break;

		case "Stocks":
			investmenttype=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"STOCKS\")"));
			break;

		case "Realestate":
			investmenttype=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"REAL-ESTATE\")"));
			break;

		case "Fixed":
			investmenttype=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"FIXED DEPOSIT\")"));
			System.out.println(investmenttype.getText());
			break;

		case "NCD":
			investmenttype=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"NCD\")"));
			break;

		case "other":
			investmenttype=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"OTHERS\")"));
			System.out.println(investmenttype.getText());
			break;

		default:
			System.out.println("Invalid investment type.");
			return; // Exit if the loan type is invalid
		}
		investmenttype.click();

		if(investmenttype.getText().equals("MUTUAL FUNDS"))
		{
			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)")).sendKeys("Testing");
			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)")).sendKeys("7986543210");
			System.out.println("invest type:");
			String invest=scanner.nextLine();
			if(invest.equals("SIP"))
			{
				driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"SIP\")")).click();
			}
			else if(invest.equals("Lumpsum"))
			{
				driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Lumpsum\")")).click();
			}
			else 
			{
				driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"SWP\")")).click();
			}

			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(3)")).sendKeys("600");
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"Submit\"));"));
			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Submit\")")).click();	
			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Back to Home\")")).click();
		}

		else if(investmenttype.getText().equals("STOCKS"))
		{
			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)")).sendKeys("Testing");
			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)")).sendKeys("7890654321");
			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(3)")).sendKeys("700");
			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Submit\")")).click();
			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Back to Home\")")).click();
		}
		

		else if(investmenttype.getText().equals("REAL-ESTATE"))
		{
			wait = new WebDriverWait(driver, Duration.ofSeconds(40));
			WebElement realestatehomepage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"Select city\"]")));
			System.out.println("Enter Property Name:");
			String Property=scanner.nextLine();

			WebElement propertyname;
			switch(Property)
			{
			case "Hallmark Pinnacle":
				propertyname=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Hallmark Pinnacle \")"));
				break;

			case "Hallmark Sunnyside":	
				propertyname=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Hallmark Sunnyside\")"));
				break;

			case "Hallmark Oakshir":
				propertyname=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Hallmark Oakshir\")"));
				break;

			case "Hallmark Floresta":
				propertyname=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Hallmark Floresta \")"));
				break;

			case "Hallmark 5A":
				driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Hallmark Skyrena\"));"));
				propertyname=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Hallmark 5A\")"));
				break;

			case "Hallmark Vesta":
				driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Hallmark Skyrena\"));"));
				propertyname=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Hallmark Vesta\")"));
				break;

			case "Hallmark Treasor":
				driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Hallmark Skyrena\"));"));
				propertyname=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Hallmark Treasor\")"));
				break;

			case "Hallmark Skyrena":
				driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Hallmark Skyrena\"));"));
				propertyname=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Hallmark Skyrena\")"));
				break;

			default:
				System.out.println("Invalid Property type");
				return;
			}
			propertyname.click();
			WebElement realestatehome = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().description(\"Interested\")")));
			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Interested\")")).click();
			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)")).sendKeys("Testing");
			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)")).sendKeys("7890654321");
			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(3)")).sendKeys("Testing");
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"Submit\"));"));
			System.out.println("Enter Loan Assistance:");
			String LA=scanner.nextLine();
			scanner.close();
			if(LA.equals("No"))
			{
				driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"No\")")).click();
			}

			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Submit\")")).click();
			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Back to Home\")")).click();
		}

		else if(investmenttype.getText().equals("FIXED DEPOSIT"))
			
		{
			System.out.println("Testing");
			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)")).sendKeys("Testing");
			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)")).sendKeys("7890654321");
			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(3)")).sendKeys("700");
			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Submit\")")).click();
			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Back to Home\")")).click();
		}
		
		else if(investmenttype.getText().equals("NCD"))
		{
			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)")).sendKeys("Testing");
			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)")).sendKeys("7890654321");
			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(3)")).sendKeys("700");
			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Submit\")")).click();
			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Back to Home\")")).click();
		}
		
		else if(investmenttype.getText().equals("OTHERS"))
		{
			System.out.println("Hello");
			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)")).sendKeys("Testing");
			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)")).sendKeys("7890654321");
			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(3)")).sendKeys("700");
			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Submit\")")).click();
			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Back to Home\")")).click();
		}
		
		//		driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
		//		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Logout\")")).click();
		//		driver.pressKey(new KeyEvent(AndroidKey.HOME));

		service.stop();
	}



}
