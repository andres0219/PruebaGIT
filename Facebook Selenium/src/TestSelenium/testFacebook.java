package TestSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class testFacebook {

	public void loginFacebook(WebDriver driver) {
		String base = "https://www.facebook.com";
		driver.get(base);
		driver.manage().window().maximize();
		WebElement insertarE = driver.findElement(By.id("email"));
		insertarE.sendKeys("3122673902");
		WebElement insertarP = driver.findElement(By.id("pass"));
		insertarP.sendKeys("Nepentes0892");
		WebElement button = driver.findElement(By.id("u_0_2"));
		button.click();
	}

	public void Busqueda(WebDriver driver) throws AWTException, InterruptedException {
		Robot robot = new Robot();
		WebDriverWait espera = new WebDriverWait(driver, 10);
		
		WebElement buscar = driver.findElement(By.className("_1frb"));
		buscar.sendKeys("Felipe Molina Callejas");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		robot.mouseMove(531, 411);
		Thread.sleep(3000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
	}

}
