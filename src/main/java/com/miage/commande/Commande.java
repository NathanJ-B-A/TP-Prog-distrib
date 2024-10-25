package com.miage.commande;

import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class Commande {

    private final CarController carController;

    public Commande(CarController carController) {
        this.carController = carController;
    }

    @GetMapping("/cars/{plateNumber}")
    public Car getCar(@PathVariable String plateNumber) {
        return carController.getCarByPlateNumber(plateNumber);
    }

    @PutMapping("/cars/{plateNumber}")
    public String rentCar(@PathVariable String plateNumber,
            @RequestParam(value = "rent") boolean rent,
            @RequestBody RentalDates rentalDates) {
        if (rent) {
            if (rentalDates == null) {
                throw new IllegalArgumentException("Les dates de location doivent être fournies.");
            }
            return carController.rentOrGetBackCar(plateNumber, true, createCarWithDates(rentalDates));
        } else {
            return carController.rentOrGetBackCar(plateNumber, false, null);
        }
    }

    private Car createCarWithDates(RentalDates rentalDates) {
        Car car = new Car("", "", 0, true);
        car.setRentalStartDate(LocalDate.parse(rentalDates.getBegin(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        car.setRentalEndDate(LocalDate.parse(rentalDates.getEnd(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        return car;
    }
}
