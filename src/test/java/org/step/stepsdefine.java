package org.step;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepsdefine {
	WebDriver driver;
	@Given("user is on the Adactin page")

	public void user_is_on_the_Adactin_page() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
     	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	@When("user should enter {string},{string}")
	public void user_should_enter(String UserName, String Password) {
		WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys(UserName);
		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys(Password);
	}

	@When("user should Click Login")
	public void user_should_Click_Login() {
		WebElement btnClick = driver.findElement(By.id("login"));
		btnClick.click();
		
	}

	@When("user should select {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_select(String Location , String Hotel, String RoomType, String  NoOfRoom, String  ChkIn  , String ChkOut , String Adltroom, String Childroom) {
		WebElement locate = driver.findElement(By.id("location"));
		Select select=new Select(locate);
		select.selectByVisibleText(Location);
		
		//locate.sendKeys(Location);
		WebElement hoteltype = driver.findElement(By.id("hotels"));
		Select select1=new Select(hoteltype);
		select1.selectByVisibleText(Hotel);
		
		//hoteltype.sendKeys(Hotel);
		WebElement roomtpe = driver.findElement(By.id("room_type"));
		Select select2=new Select(roomtpe);
		select2.selectByVisibleText(RoomType);
		
		//roomtpe.sendKeys(RoomType);
		WebElement roomNumbers = driver.findElement(By.id("room_nos"));
		Select select3=new Select(roomNumbers);
		select3.selectByVisibleText(NoOfRoom);
		//roomNumbers.sendKeys(NoOfRoom);
		WebElement roomChkin = driver.findElement(By.id("datepick_in"));
		roomChkin.clear();
		roomChkin.sendKeys(ChkIn);
		WebElement roomChkout = driver.findElement(By.id("datepick_out"));
		roomChkout.clear();
		roomChkout.sendKeys(ChkOut);
		//Select select4=new Select(roomChkout);
		//select4.selectByVisibleText(ChkOut);
		WebElement adltRoom = driver.findElement(By.id("adult_room"));
		Select select5=new Select(adltRoom);
		select5.selectByVisibleText(Adltroom);
		
		//adltRoom.sendKeys(Adltroom);
		WebElement chldRoom = driver.findElement(By.id("child_room"));
		Select select6=new Select(chldRoom);
		select6.selectByVisibleText(Childroom);
		
		//chldRoom.sendKeys(Childroom);
		WebElement sltsubmit = driver.findElement(By.id("Submit"));
		sltsubmit.click();

	}@When("user should slect btn")
	public void user_should_slect_btn() {
		WebElement radioSlt = driver.findElement(By.id("radiobutton_0"));
		radioSlt.click();
		WebElement continueSlt = driver.findElement(By.id("continue"));
		continueSlt.click();
	}

	@When("user should seclt {string},{string},{string},{string},{string},{string},{string},{string},")
	public void user_should_seclt(String FirstName, String LastName, String Address, String CardNo, String CardType, String ExpyYr, String ExpryMnt, String CardCvv) throws InterruptedException {
		WebElement firstName = driver.findElement(By.id("first_name"));
		firstName.sendKeys(FirstName);
		WebElement lastName = driver.findElement(By.id("last_name"));
		lastName.sendKeys(LastName);
		WebElement adress = driver.findElement(By.id("address"));
		adress.sendKeys(Address);
		WebElement cardNum = driver.findElement(By.id("cc_num"));
		cardNum.sendKeys(CardNo);
		WebElement cardType = driver.findElement(By.id("cc_type"));
		cardType.sendKeys(CardType);
		WebElement expiryMont = driver.findElement(By.id("cc_exp_month"));
		expiryMont.sendKeys(ExpyYr);
		WebElement expiryYear = driver.findElement(By.id("cc_exp_year"));
		expiryYear.sendKeys(ExpryMnt);
		WebElement cardCcv = driver.findElement(By.id("cc_cvv"));
		cardCcv.sendKeys(CardCvv);
		WebElement btnBook = driver.findElement(By.id("book_now"));
		 btnBook.click();
		 WebElement textOrderno1 = driver.findElement(By.xpath("(//input[@class='disable_text'])[15]"));
		 String attribute = textOrderno1.getAttribute("value");
		 System.out.println("order id is="+"\n"+attribute);
		
	driver.quit();


/*	}



	@Then("user can get order Id")
	public void user_can_get_order_Id() {
		
	 WebElement textOrderno1 = driver.findElement(By.xpath("(//input[@class='disable_text'])[15]"));
		 String attribute = textOrderno1.getAttribute("value");
		 System.out.println("order id is="+"\n"+attribute);
		
	driver.quit();*/
	}


}
