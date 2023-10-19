public abstract class FlyingCar {
    //!!!ко свойствам писать abstract не надо, а к метоттдам надо!!!
    String brand;//марка
    String model;//модель
    int wings;//крылья
    Fuel fuelType; // TODO: make enum
    Transmition transmitionType;

    FlyingCar(String brand, String model, Transmition transmitionType, int numWings, Fuel fuelType) { // это родительский инициализатор
        this.brand = brand;
        this.model = model;
        this.transmitionType = transmitionType;
        this.wings = wings;
        this.fuelType = fuelType;
    }

    abstract void flight();//полет

}
