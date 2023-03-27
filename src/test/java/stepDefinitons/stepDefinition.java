package stepDefinitons;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


//@RunWith(Cucumber.class)

public class stepDefinition {
	
	@Given("^validate the browser$")
    public void validate_the_browser() throws Throwable {
        System.out.println("Chrome");
    }

    @When("^Browser is Triggered$")
    public void browser_is_triggered() throws Throwable {
        System.out.println("hello Chrome");
    }

    @Then("^check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
        System.out.println("bye Chrome");
    }
	
	@Given("^User is on NetBanking Landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        System.out.println("Net Banking Landing Page");
    }

  //  @When("^User login into application with username and password$")
  //  public void user_login_into_application_with_username_and_password() throws Throwable {
  //  	System.out.println("username and password");
  //  } 

    @Then("^home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("home page is populated");
    }
    
    @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1);
        System.out.println(strArg2);
    }

    @And("^Cards are displayed \"([^\"]*)\"$")
    public void cards_are_displayed_something(String strArg1) throws Throwable {
        System.out.println(strArg1);
    }
    @When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
    List<List<String>> obj =  data.asLists();
    System.out.println(obj.get(0).get(0));
    System.out.println(obj.get(0).get(1));
    System.out.println(obj.get(0).get(2));
    System.out.println(obj.get(0).get(3));
    System.out.println(obj.get(0).get(4));
    //System.out.println(obj.get(0).get(5));
        
    }
	
    @When("^User login in to application with (.+) and password (.+)$")
    public void user_login_into_application_with_and_password(String Username, String password) throws Throwable {
        System.out.println(Username);
        System.out.println(password);
    }
	

}
