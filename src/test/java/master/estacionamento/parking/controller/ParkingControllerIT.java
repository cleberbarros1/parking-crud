package master.estacionamento.parking.controller;

import io.restassured.RestAssured;
import master.estacionamento.parking.controller.dto.ParkingCreateDTO;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ParkingControllerIT  extends AbstractContainer{

    @LocalServerPort
    private int randomPort;

    @BeforeEach
    public void setUpTest(){
        System.out.println(randomPort);
        RestAssured.port = randomPort;
    }

    @Test
    void whenfindAllThenCheckResult() {
        RestAssured.given()
                .auth()
                .basic("user", "dio")
                .when()
                .get("/parking")
                .then()
                .statusCode(HttpStatus.OK.value());

    }

    @Test
    void whenCreateThenCheckIsCreated() {

        var createDTO = new ParkingCreateDTO();
        createDTO.setColor("AMARELO");
        createDTO.setLicense("WRT-5555");
        createDTO.setModel("BRASILIA");
        createDTO.setState("SP");

        RestAssured.given()
                .auth()
                .basic("user", "123")
                .when()
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .body(createDTO)
                .get("/parking")
                .then()
                .statusCode(HttpStatus.CREATED.value())
                .body("License", Matchers.equalTo("WRT-5555"))
                .body("color", Matchers.equalTo("AMARELO"));
    }
}