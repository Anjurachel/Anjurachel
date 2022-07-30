package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class redbus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
			


		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("src")).sendKeys("Madiwala Bangalore",Keys.ENTER);
		driver.findElement(By.id("dest")).sendKeys("Koyembedu, Chennai",Keys.ENTER);
		//Finding date
		driver.findElement(By.id("onward_cal")).click();
		
		driver.findElement(By.xpath("//table/tbody/tr[7]/td[6]")).click();
		//Click on search
		Thread.sleep(4000);
		driver.findElement(By.id("search_btn")).click();
		
		
//		WebElement rowTag = driver.findElement(By.tagName("tr"));
//        String text = rowTag.getText();
//        System.out.println(text);
//       String header = driver.findElement(By.tagName("th")).getText();
//        System.out.println(header);
//        //get Size of row
//        List<WebElement> row = driver.findElements(By.xpath("//table//tr"));
//        int rowsize = row.size();
//        System.out.println(rowsize);
//        //get the size of coloumn
//        List<WebElement> colCount = driver.findElements(By.xpath("//table//th"));
//        int size2 = colCount.size();
//        System.out.println(size2);
//        //dynamic xpath
//        for (int i = 2; i <rowsize ; i++) {
//          
//        List<WebElement> colSize = driver.findElements(By.xpath("//table//tr["+i+"]/td"));
//        int coloumnsize = colSize.size();
//    
//        //System.out.println(coloumnsize);}

}}
