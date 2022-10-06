package PostCreditRequestTest;

import Pojo.ConfigurationReader;
import Pojo.CreateRequest;
import Pojo.CreditRequestPOJO;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.*;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class OppFIRequest extends BaseClass{

    String APIKey;

    @DisplayName("POST Request to Loan application Approve")
    @Test
    @Order(1)
    public void POSTLoanRequestWhereUserGetApproved(){
        CreditRequestPOJO Request = CreateRequest.GetLoanRequest("123456780","FL",100000,4000,"kgj25sdd2","test@example.com");
        //System.out.println(Request);
        APIKey = ConfigurationReader.getProperty("APIKey");
        given()
                .log().all()
                .header("x-api-key", APIKey)
                .contentType(ContentType.JSON)
                .body(Request)
        .when()
                .post().
        then()
                .log().all()
                .assertThat()
                .statusCode(is(200))
                .contentType(ContentType.JSON)
                .body("accepted", is(true))
                .body("status", is("APPROVED") )
                .body("request.socialSecurityNumber", equalTo("123456780"))
                .body("request.stateCode.",is(equalTo("FL")))
        ;
    }

    @DisplayName("POST Request to Loan application Decline")
    @Test
    @Order(2)
    public void POSTLoanRequestWhereUserGetDeclined(){
        CreditRequestPOJO Request = CreateRequest.GetLoanRequest("123450000","IL",100000,1500,"kgj25sdd2","test@example.com");
        //System.out.println(Request);
        APIKey = ConfigurationReader.getProperty("APIKey");
        given()
                .log().all()
                .header("x-api-key", APIKey)
                .contentType(ContentType.JSON)
                .body(Request)
        .when()
                .post().
        then()
                .log().all()
                .assertThat()
                .statusCode(is(200))
                .contentType(ContentType.JSON)
                .body("accepted", is(false))
                .body("status", is("DECLINED") )
                .body("request.socialSecurityNumber", equalTo("123450000"))
                .body("request.stateCode.",is(equalTo("IL")))
        ;
    }

    @DisplayName("POST Request to Loan application Where User Sends Missing Required Field")
    @Test
    @Order(3)
    public void POSTLoanRequestWhereUserSendsMissingRequiredField(){

        //System.out.println(Request);
        APIKey = ConfigurationReader.getProperty("APIKey");
        given()
                .log().all()
                .header("x-api-key", APIKey)
                .contentType(ContentType.JSON)
                .when()
                .post().
                then()
                .log().all()
                .assertThat()
                .statusCode(is(200))
                .contentType(ContentType.JSON)
                .body("accepted", is(false))
                .body("status", is("DECLINED") )
        ;
    }
    @AfterEach
    public void tearDownTest(){
        System.out.println("Tear Down running!");
    }
}
