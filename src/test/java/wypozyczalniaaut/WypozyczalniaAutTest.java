package wypozyczalniaaut;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static wypozyczalniaaut.Car.getListOfCars;

class WypozyczalniaAutTest {

    List listOfCars = new ArrayList<>();
    Car audia3 = new Car("TK 1", "Audi", "A3", 4, new BigDecimal("500"));
    Car audia4 = new Car("TK 2", "Audi", "A4", 4, new BigDecimal("500"));
    Car skodafabia = new Car("TK 3", "Skoda", "Fabia", 5, new BigDecimal("600"));
    Car skodafelicja = new Car("TK 4", "Skoda", "Felicja", 5, new BigDecimal("600"));
    @BeforeEach
    void setUp() {
        listOfCars.add(audia3);
        listOfCars.add(audia4);
        listOfCars.add(skodafabia);
        listOfCars.add(skodafelicja);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("test biznesowy sprawdzający pseudologikę pobrania samochodów z bazy")
    void afterCorrectDatabaseRepositoryInitCheckIfICanListAllCars() {
        //given
        //mam już zainicjalizowaną listę zamochodów
        System.out.println(listOfCars.toString());

    }

    @Test
    @DisplayName("test sprawdzający możliwośc filtracji po marce")
    void shouldReturnListOfCarsBasedOnMark() {
        //given
        System.out.println(listOfCars.toString());

        //when

        List<Car> shouldBeListOfAudi = getListOfCars("Audi");
        System.out.println(shouldBeListOfAudi);

        //then
        assertEquals(2, shouldBeListOfAudi.size());
        assertTrue(shouldBeListOfAudi.contains(audia3));
        assertTrue(shouldBeListOfAudi.contains(audia4));

        //assertEquals(shouldBeListOfAudi.size(), 2);
        //assertEquals(shouldBeListOfAudi.contains(List.of(audia3, audia4)), true);

    }

    @Test
    @DisplayName("test sprawdzający możliwośc filtracji po marce oraz modelu danej marki")
    void shouldReturnListOfCarsBasedOnMarkAndModel() {
        //given
        System.out.println(listOfCars.toString());

        //when
        List shouldBeListOfAudi = getListOfCars("Audi", "A3");

        //then
        assertEquals(shouldBeListOfAudi.size(), 1);
        assertEquals(shouldBeListOfAudi.contains(audia3), true);

    }


}