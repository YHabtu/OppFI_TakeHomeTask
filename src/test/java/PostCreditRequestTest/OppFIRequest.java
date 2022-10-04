package PostCreditRequestTest;

import Pojo.ConfigurationReader;
import Pojo.CreateRequest;
import Pojo.CreditRequestPOJO;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.*;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class OppFIRequest {

    String BaseURL;
    String APIKey;
    @BeforeEach
    public void setUpTest(){
        BaseURL = ConfigurationReader.getProperty("OppFI.baseURL");
        APIKey = ConfigurationReader.getProperty("OppFI.APIKey");
    }

    @AfterEach
    public void tearDownTest(){
        System.out.println("Tear Down running!");
    }
    @DisplayName("POST Request to Loan application")
    @Test
    public void POSTLoanRequest(){
        CreditRequestPOJO Request = CreateRequest.GetLoanRequest();
        System.out.println(Request);

        given()
                .log().all()
                .header("x-api-key", APIKey)
                .contentType(ContentType.JSON)
                .body(Request).
                when()
                .post().
                then()
                .log().all()
                .assertThat()
                .statusCode(is(201))
        ;
    }
}
