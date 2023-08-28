package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import pages.LoginPage;
import pages.ProductPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static utilities.DriverSetup.getDriver;

public class ProductStep {
    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();
//    @Given("user logged in with {string} {string}")
//    public void userLoggedInWith(String username, String password) {
//        getDriver().get(loginPage.login_page_url);
//        loginPage.writeOnByLocator(loginPage.username_input_field, username);
//        loginPage.writeOnByLocator(loginPage.password_input_field, password);
//        productPage.clickOnAElement(loginPage.login_button);
//    }


    @Then("user should see product url")
    public void userShouldSeeProductUrl() {
        assertEquals(getDriver().getCurrentUrl(),productPage.product_page_url);
    }



    @When("user click on add to cart button")
    public void userClickOnAddToCartButton() {

        productPage.clickOnAElement(productPage.bike_light_add_to_cart_btn);

    }

    @Then("user should see button on remove")
    public void userShouldSeeButtonOnRemove() {

        assertEquals(productPage.getElementText(ProductPage.remove_sauce_labs_backpack),"Remove");
    }



}
