import io.quarkus.test.junit.QuarkusTest;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

import org.junit.jupiter.api.Test;

@QuarkusTest
public class FilmResourceTest {
    @Test
    public void test() {
        given()
                .when().get("/film/5")
                .then()
                .statusCode(200)
                .body(containsString("AFRICAN EGG"));
    }
}
