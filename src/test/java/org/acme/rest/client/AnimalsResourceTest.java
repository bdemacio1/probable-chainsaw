package org.acme.rest.client;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
//import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class AnimalsResourceTest {

    @Test
    public void testAnimalsEndpoint() {
        given()
          .when().get("/animalResource")
          .then()
             .statusCode(200);
    }

    // @Test
    // public void testCountryNameAsyncEndpoint() {
    //     given()
    //     .when().get("/country/name-async/greece")
    //     .then()
    //         .statusCode(200)
    //         .body("$.size()", is(1),
    //             "[0].alpha2Code", is("GR"),
    //             "[0].capital", is("Athens"),
    //             "[0].currencies.size()", is(1),
    //             "[0].currencies[0].name", is("Euro")
    //         );
    //     }

}