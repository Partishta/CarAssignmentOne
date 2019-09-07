package Assignment;
abstract class Car {
    public int carId;
    public String carModel;
    double carPrice;


    public int getCarId() {
        return carId;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public String getCarModel() {
        return carModel;
    }

    abstract double getResalePrice();


}
