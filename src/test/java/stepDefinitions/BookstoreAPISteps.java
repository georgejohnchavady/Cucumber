package stepDefinitions;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BookstoreAPISteps {
	
	private static final String BASE_URL = "http://localhost:8081";
	private static Response response;
	private static String jsonString;
	private static String bookId;
	
	@Given("Bookstore API")
	public void bookstore_api() {
		RestAssured.baseURI = BASE_URL;
		
		
	}

	@When("Retrieve all books")
	public void retrieve_all_books() {
		RequestSpecification request = RestAssured.given();
		response = request.get("/books");
		Assert.assertEquals(200, response.getStatusCode());
		jsonString = response.asString();
	}

	@Then("I validate the book with id {int} as Harry Potter and the Sorcerer Stone")
	public void i_validate_the_book_with_id_as_harry_potter_and_the_sorcerer_stone(Integer int1) {
		RequestSpecification request = RestAssured.given();
		response = request.get("/books/1");
		Assert.assertEquals(200, response.getStatusCode());
		jsonString = response.asString();
	}

}
