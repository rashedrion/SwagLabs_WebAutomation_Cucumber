package step_definitions;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.CheckOutPage;

public class CheckoutStep {

    CheckOutPage checkOutPage = new CheckOutPage();




    @When("user input valid first name and last name and postal code")
    public void userInputValidFirstNameAndLastNameAndPostalCode() {
        checkOutPage.timeOut();
        checkOutPage.writeOnByLocator(checkOutPage.first_name_field,"Rashed");
        checkOutPage.writeOnByLocator(checkOutPage.last_name_field,"Rion");
        checkOutPage.writeOnByLocator(checkOutPage.postal_code_field,"1200");
        checkOutPage.timeOut();
    }

    @And("user click on continue button")
    public void userClickOnContinueButton() {
        checkOutPage.timeOut();
        checkOutPage.clickOnAElement(checkOutPage.continue_btn);
    }

    @Then("user should see checkout overview page")
    public void userShouldSeeCheckoutOverviewPage() {
        Assert.assertEquals(checkOutPage.getElementText(checkOutPage.checkout_overview),checkOutPage.checkout_overview_text);
    }

    @When("user click on finish button")
    public void userClickOnFinishButton() {
        checkOutPage.timeOut();
        checkOutPage.clickOnAElement(checkOutPage.finish_btn);
    }

    @Then("user should show checkout completed")
    public void userShouldShowOrderCompleted() {
        Assert.assertEquals(checkOutPage.getElementText(checkOutPage.order_complete_locator),checkOutPage.order_complete_msg);
    }
}
