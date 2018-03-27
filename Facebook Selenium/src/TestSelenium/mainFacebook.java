package TestSelenium;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainFacebook extends testFacebook{
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\andres.molina\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		mainFacebook face = new mainFacebook();
		face.loginFacebook(driver);
		face.Busqueda(driver);
		//face.toma_Captura(driver);
		
	} 
}
