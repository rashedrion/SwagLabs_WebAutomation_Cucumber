package step_definitions;

import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.CartPage;
import pages.CheckOutPage;

import static utilities.DriverSetup.getDriver;


public class CartStep {
    CartPage cartPage = new CartPage();
    CheckOutPage checkOutPage = new CheckOutPage();


    @When("user click on cart icon")
    public void user_click_on_cart_icon() {
        cartPage.timeOut(2000);
        cartPage.clickOnAElement(cartPage.cart_icon);


    }
    @Then("user should show cart page title")
    public void user_should_show_cart_page_title() {
        Assert.assertEquals(cartPage.getElementText(cartPage.cartPage_title), "Your Cart");

    }

    @Then("user should see product name")
    public void userShouldSeeProductName() {
        Assert.assertEquals(cartPage.getElementText(cartPage.inventory_item_name), "Sauce Labs Bike Light");
    }

    @And("user should see product price")
    public void userShouldSeeProductPrice() {

        Assert.assertEquals(cartPage.getElementText(cartPage.inventory_item_price), "$9.99");
    }

    @When("user click on remove item button")
    public void userClickOnRemoveItemButton() {
        cartPage.timeOut(2000);
        cartPage.clickOnAElement(cartPage.remove_cart_button);
    }


    @Then("user should see Null")
    public void userShouldSeeNull() {

        Assert.assertTrue(cartPage.is_element_visibility(cartPage.remove_cart_button));
    }



    @When("user click on checkout_button")
    public void userClickOnCheckout_button() {
        cartPage.timeOut();
        cartPage.clickOnAElement(cartPage.checkout_btn);
    }

    @Then("user should go checkout page")
    public void userShouldGoCheckoutpage() {

        Assert.assertEquals(checkOutPage.getElementText(checkOutPage.checkout_title),checkOutPage.checkout_title_text);

    }


}
