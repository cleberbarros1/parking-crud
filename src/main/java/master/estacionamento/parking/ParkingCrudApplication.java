package master.estacionamento.parking;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Welcome to Parking System Control"))
public class ParkingCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingCrudApplication.class, args);
	}

}
