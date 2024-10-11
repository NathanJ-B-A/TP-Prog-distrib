package com.miage.commande;

public class Car {
    private String plateNumber;
    private String brand;
    private float price;

    public Car(String plateNumber, String brand, float price) {

        this.plateNumber = plateNumber;
        this.brand = brand;
        this.price = price;
    }

    public String getPlateNumber() {
        return plateNumber;
    };

    public void setPlateNumber(String newPlateNumber) {
        this.plateNumber = newPlateNumber;
    };

    public String getBrand() {
        return brand;
    };

    public void setBrand(String newBrand) {
        this.brand = newBrand;
    };

    public float getPrice() {
        return price;
    };

    public void setPrice(float newPrice) {
        this.price = newPrice;
    };
}
