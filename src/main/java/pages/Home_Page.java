package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import baseclass.baseclass;

public class Home_Page extends baseclass {
	
	public Home_Page() {
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this);
	}

	
	
	
	@FindBy(xpath = "//div[@class='header-links-wrapper']/div[1]/ul/li[1]/a")
	private WebElement register;

	@FindBy(xpath = "//div[@class='header-links-wrapper']/div[1]/ul/li[2]/a")
	private WebElement login;

	@FindBy(xpath = "//div[@class='header-links-wrapper']/div[1]/ul/li[3]/a/span[1]")
	private WebElement shoppingcart;

	@FindBy(xpath = "//div[@class='header-links-wrapper']/div[1]/ul/li[3]/a/span[2]")
	private WebElement shoppingcartqty;

	@FindBy(xpath = "//div[@class='header-links-wrapper']/div[1]/ul/li[4]/a/span[1]")
	private WebElement wishlist;

	@FindBy(xpath = "//div[@class='header-links-wrapper']/div[1]/ul/li[4]/a/span[2]")
	private WebElement wishlistqty;
	
	
	@FindBy(xpath = "//body/div/div/div/ul[@class='top-menu']/li[1]/a")
	private WebElement topmenubooks;
	
	@FindBy(xpath = "//body/div/div/div/ul[@class='top-menu']/li[2]/a")
	private WebElement topmenucomputers;
	
	@FindBy(xpath = "//body/div/div/div/ul[@class='top-menu']/li[3]/a")
	private WebElement topmenuelectronics;
	
	@FindBy(xpath = "//body/div/div/div/ul[@class='top-menu']/li[4]/a")
	private WebElement topmenuapparelandshoes;
	
	@FindBy(xpath = "//body/div/div/div/ul[@class='top-menu']/li[5]/a")
	private WebElement topmenudigitaldownloads;
	
	@FindBy(xpath = "//body/div/div/div/ul[@class='top-menu']/li[6]/a")
	private WebElement topmenujewelry;
	
	@FindBy(xpath = "//body/div/div/div/ul[@class='top-menu']/li[7]/a")
	private WebElement topmenugiftcards;
	
	@FindBy(xpath = "//div[@class='block block-category-navigation']/div[2]/ul/li[1]/a")
	private WebElement categoriesbooks;
	
	@FindBy(xpath = "//div[@class='block block-category-navigation']/div[2]/ul/li[2]/a")
	private WebElement categoriescomputers;
	
	@FindBy(xpath = "//div[@class='block block-category-navigation']/div[2]/ul/li[3]/a")
	private WebElement categorieselectronics;
	
	@FindBy(xpath = "//div[@class='block block-category-navigation']/div[2]/ul/li[4]/a")
	private WebElement categoriesapparelandshoes;
	
	@FindBy(xpath = "//div[@class='block block-category-navigation']/div[2]/ul/li[5]/a")
	private WebElement categoriesdigitaldownloads;
	
	@FindBy(xpath = "//div[@class='block block-category-navigation']/div[2]/ul/li[6]/a")
	private WebElement categoriesjewelry;
	
	@FindBy(xpath = "//div[@class='block block-category-navigation']/div[2]/ul/li[7]/a")
	private WebElement categoriesgiftcards;
	
	@FindBy(xpath = "//div[@class='search-box']/form/input[1]")
	private WebElement searchstore;
	
	@FindBy(xpath = "//div[@class='search-box']/form/input[2]")
	private WebElement searchbutton;
	
	@FindBy(xpath = "//div[@class='block block-manufacturer-navigation']/div[2]/ul/li/a")
	private WebElement manufacturerstricentislink;
	
	@FindBy(xpath = "//div[@class='block block-popular-tags']/div[2]/div/ul/li")
	private WebElement populartags;
	
	@FindBy(xpath = "//div[@class='block block-popular-tags']/div[2]/div[2]/a")
	private WebElement populartagsviewall;
	
	
	

	public void register_link() {
		
		register.click();

	}

	public void login_link() {
		login.click();

	}

	public void shoppingCart_link() {
		shoppingcart.click();

	}

	public String shoppingCartQty_link() {
		
		String qty = shoppingcartqty.getText();
		
		return qty;

	}
	
	public void wishList_link() {
		wishlist.click();

	}
	
	public void wishListQty_link() {

	}
	
	public void topmanuBooks_link() {
		
		topmenubooks.click();

	}

	public void topmanuComputers_link() {
		

	}

	public void topmanuElectronics_link() {
		

	}

	public void topmanuApparelAndShoes_link(){

	}
	
	public void topmanuDigitalDownloads_link() {
		

	}
	
	public void topmanuJewelry_link() {

	}
	
	public void topmanuGiftCards_link() {

	}
	
	
	public void categoriesBooks_link() {
		
		

	}

	public void categoriesComputers_link() {
		

	}

	public void categoriesElectronics_link() {
		

	}

	public void categoriesApparelAndShoes_link(){

	}
	
	public void categoriesDigitalDownloads_link() {
		

	}
	
	public void categoriesJewelry_link() {

	}
	
	public void categoriesGiftCards_link() {

	}
	
	public void searchStore_link() {

	}
	
	public void searchButton_link() {

	}
	
	public void manufacturersTricentis_link() {

	}
	
	public void popularTags_link() {

	}
	
	public void popularTagsViewAll_link() {

	}

}
