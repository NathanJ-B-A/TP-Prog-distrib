package com.miage.commande;

import java.util.ArrayList;
import java.util.List;

public class CarController {
    private List<Car> garage;

    public CarController() {
        garage = new ArrayList<>();
    }

    public void AddCar(Car car){
        garage.add(car);
    }

    public void RemoveCar()
}
