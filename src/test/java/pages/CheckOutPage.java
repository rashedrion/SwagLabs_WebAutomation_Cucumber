package pages;

import org.openqa.selenium.By;

public class CheckOutPage extends BasePage{
    public By checkout_title= By.xpath("//span[@class='title']");
    public String checkout_title_text="Checkout: Your Information";
    public By checkout_overview = By.xpath("//span[@class='title']");
    public String checkout_overview_text = "Checkout: Overview";
    public String order_complete_msg="Checkout: Complete!";
    public By order_complete_locator= By.xpath("//span[@class='title']");
    public String checkout_url= "https://www.saucedemo.com/checkout-step-one.html";
    public By first_name_field = By.id("first-name");
    public  By last_name_field = By.id("last-name");
    public  By postal_code_field = By.id("postal-code");
    public  By continue_btn = By.id("continue");
    public  By cancle_btn = By.xpath("(//button[@id='cancel'])[1]");
    public By finish_btn = By.id("finish");

}
