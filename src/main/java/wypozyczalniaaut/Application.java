package wypozyczalniaaut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	public ArrayList<Car> listOfCars = new ArrayList<>();

	public static List<Car> getCars() {
		Car audia3 = new Car("TK 1", "Audi", "A3", 4, new BigDecimal("500"));
		Car audia4 = new Car("TK 1", "Audi", "A4", 4, new BigDecimal("500"));
		Car skodafabia = new Car("TK 2", "Skoda", "Fabia", 5, new BigDecimal("600"));
		Car skodafelicja = new Car("TK 2", "Skoda", "Felicja", 5, new BigDecimal("600"));
		return List.of(audia3, skodafabia);
	}
}
