package Assignment;
class Maruti  extends Car {

    public Maruti(final int carId, final String carModel, final double carPrice){
        this.carId=carId;
        this.carModel=carModel;
        this.carPrice=carPrice;
    }

    @Override
    double getResalePrice() {
        return carPrice*0.80;
    }
}
