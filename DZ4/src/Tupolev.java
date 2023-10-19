public class Tupolev extends FlyingCar {

    public Type types;// количество запасных колес

    public Tupolev(String model, Transmition transmitionType, int numWings, Type types, Fuel fuelType) {
        // так как используем конкретную машину,брен не надо передавать,передаем строку
        // лада и не просим дополнительно пользователя это делать
        super("Tupolev", model, transmitionType, numWings, fuelType);// дергаем родительский инициализатор
        this.types = types;// прописываем дописывам то свойство ,которого нет в родительском классе
    }

    @Override
    void flight() {
        System.out.println("Tupolev is flighting");
    }
}
