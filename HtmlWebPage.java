package seleniumScript1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class HtmlWebPage {
public static void main(String[] args) {

ChromeOptions options = new ChromeOptions(); 
System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\selenium\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://127.0.0.1:5500/programming/web%20dev%20class/form.html");
driver.manage().window().maximize();
driver.findElement(By.id("fname")).sendKeys("Ayush");
driver.findElement(By.id("lname")).sendKeys("Chauhan");
driver.findElement(By.id("dob")).sendKeys("22-Sep-2002");
driver.findElement(By.id("email")).sendKeys("ayushchauhan0707@gmail.com");
driver.findElement(By.id("phone")).sendKeys("1234567890");
driver.findElement(By.id("submit")).click();
driver.findElement(By.id("reset")).click();
//check the id of the element by right click on the web page and 
//inspect the element or press F12 (or shift F12)
}
}