package Assignment;
class Toyota  extends Car {

    public Toyota(final int carId, final String carModel, final double carPrice) {
        this.carId = carId;
        this.carModel = carModel;
        this.carPrice = carPrice;
    }

    @Override
    double getResalePrice() {
        return carPrice * 0.80;
    }
}