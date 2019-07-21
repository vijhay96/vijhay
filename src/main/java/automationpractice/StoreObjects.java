package automationpractice;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class StoreObjects extends MainPage {

	public StoreObjects() {
	PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="//div/ul/li[2]//a[@title='Dresses']")
	private WebElement dressestab;
	

	public WebElement getdressestab() {
		return dressestab;
	}
	public void clickdresses() {
		dressestab.click();
		}
	
	@FindBy(xpath="//div/ul/li/a[contains(@title,'You are looking for a dress')]")
	private WebElement casualdressestab;
	
	public WebElement getcasualdressestab() {
		return casualdressestab;
		
	}
	public void clickcasualdresses() {
		casualdressestab.click();
	}
	@FindBy (xpath="//*[@id=\"layered_id_attribute_group_1\"]")
	private WebElement small;
	
	public WebElement getSmall() {
		return small;
		}
	@FindBy (xpath= "//*[@id=\"layered_id_attribute_group_2\"]")
	private WebElement medium;
	
	public WebElement getMedium() {
		return medium;
	}
	@FindBy(xpath= "//*[@id=\"layered_id_attribute_group_3\"]")
	private WebElement large;
	
	public WebElement getLarge() {
		return large;
	}
	
	//have to find how many products are available
	
	@FindBy(xpath="//span[@class='heading-counter']")
	private WebElement headcount;
	
	public int getHeadcount() {
//	String text= headcount.getText();
//	String arr[]= text.split(" ");
//	String textnum = arr[2];
//	int totalcount= Integer.parseInt(textnum); //Parseint is used because we need to convert string to int
//	return totalcount;
	
	// last 4 lines are explanation. we can either write it directly
	
	return Integer.parseInt(headcount.getText().split(" ")[2]);
	}
	//how many products are shown or how many dresses are shown
	@FindBys(@FindBy(xpath ="//*[@id=\"center_column\"]/ul/li")) //findbys is used because we have to find how many number of dresses are available
	private List<WebElement> productcount;
	
	public int getproductcount() {
		return productcount.size();
	}
	@FindBy(xpath="//ul/li[1]//img[@title='Printed Dress']")
	private WebElement product;
	
	@FindBy(xpath= "//ul/li/div[1]/div[2]//a[@data-id-product='3']")
	private WebElement cart;
	
	public WebElement getproduct() {
	return product;
	}
	
	public WebElement addtocart() {
	return cart;
	}
	// subscribe the website first page scroll down to subscru=ibe
	
	@FindBy(id= "newsletter-input")
	private WebElement newsletter;
	
	@FindBy(name= "submitNewsletter")
	private WebElement submitnews;
	
	public WebElement sendSubscription() {
		return submitnews;
	}
	
	public void getsubscription() {
		Random num = new Random();
		int number= num.nextInt(50000);
		setText(newsletter, "automation"+ number +"@gmail.com");
		System.out.println(number);
		submitnews.click();
	}
	
	@FindBy(xpath="//p[@class='alert alert-success']")
	private WebElement subscriptionmessage;
	
	public WebElement getsubscribemessage() {
		return subscriptionmessage;
	}
	
	public String getsubscriptionmessage() {
		return subscriptionmessage.getText();
	}
	
	
	
	
	
}


	
