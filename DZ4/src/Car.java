public abstract class Car {
    //!!!ко свойствам писать abstract не надо, а к метоттдам надо!!!
    String brand;//марка
    String model;//модель
    int weels;//колеса
    Fuel fuelType; // TODO: make enum
    Transmition transmitionType;

    Car(String brand, String model, Transmition transmitionType, int numWeels, Fuel fuelType) { // это родительский инициализатор
        this.brand = brand;
        this.model = model;
        this.transmitionType = transmitionType;
        this.weels = weels;
        this.fuelType = fuelType;
    }

    abstract void move();//движение

    abstract void service();//обслуживание

    abstract void turnOnHeadlights();//фонари
}
