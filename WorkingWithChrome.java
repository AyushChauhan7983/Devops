package seleniumScript1;
import org.openqa.selenium.chrome.ChromeDriver;
public class WorkingWithChrome {
ChromeDriver driver;
String url="https://www.youtube.com/";
public void invokeBrowser(){
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dell\\\\selenium\\\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get(url);
}
 public void getTitle(){
 String titleofthepage=driver.getTitle();
 System.out.println("Title of the page:::::"+titleofthepage);
 }
 public void closeBrowser(){
 //driver.close();
 driver.quit();
 }
 public static void main(String[] args) {
WorkingWithChrome wc=new WorkingWithChrome();
wc.invokeBrowser();
wc.getTitle();
wc.closeBrowser();
}
}