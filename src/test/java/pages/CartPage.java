package pages;

import org.openqa.selenium.By;

public class CartPage extends BasePage{
    public By checkout_btn = By.id("checkout");
    public By cartPage_title = By.xpath("//span[@class='title']");
    public By cart_icon = By.className("shopping_cart_link");
    public By continue_shopping = By.xpath("//button[@id='continue-shopping']");
    public By quantity = By.xpath("//div[@class='cart_quantity_label']");
    public By description = By.xpath("//div[@class='cart_desc_label']");
    public By remove_cart_button = By.xpath("(//*[@class='btn btn_secondary btn_small cart_button'])[1]");
    public By inventory_item_name= By.xpath("(//*[@class='inventory_item_name'])[1]");
    public By inventory_item_price= By.xpath("(//*[@class='inventory_item_price'])[1]");




}
