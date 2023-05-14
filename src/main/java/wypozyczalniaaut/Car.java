package wypozyczalniaaut;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

import static wypozyczalniaaut.Application.getCars;


@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue
    private Long id;

    String carPlate;
    String mark;
    String model;
    int seats;
    BigDecimal price;

    public Car(String carPlate, String mark, String model, int seats, BigDecimal price) {

        this.carPlate = carPlate;
        this.mark = mark;
        this.model = model;
        this.seats = seats;
        this.price = price;
    }

    /**
     * @param mark
     * @return lista pojazdów ograniczonych do danego modelu
     */

    public static List<Car> getListOfCars(String mark) {

        //TODO
        //do zrobienia implementacja która pozwoli na ograniczenie listy do składającej się z danej marki



        return Collections.emptyList();
    }

    public static List<Car> getListOfCars(String mark, String model) {

        //TODO
        //do zrobienia implementacja która pozwoli na ograniczenie listy do składającej się z danej marki oraz modelu

        return Collections.emptyList();
    }

}