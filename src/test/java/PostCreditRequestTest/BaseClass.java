package PostCreditRequestTest;

import Pojo.ConfigurationReader;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import static io.restassured.RestAssured.*;

import static io.restassured.RestAssured.reset;

public class BaseClass {

    @BeforeEach
    public void setUpTest(){

        baseURI = ConfigurationReader.getProperty("baseURL");
        basePath = "/offer";
    }

    @AfterAll
    public static void tearDown(){
        reset();
    }
}
