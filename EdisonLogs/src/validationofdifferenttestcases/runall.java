package validationofdifferenttestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import frameworkpractice.setup;

public class runall extends setup {


	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String url= "https://tenforben.github.io/Movies/HoMe.html";
		setup.start(driver,url);
		lesscharacterinusername testcase= new lesscharacterinusername();
		testcase.minimun(driver, url);
		testcase.quitbrowser(driver);

	}

}
