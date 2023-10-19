public class Lada extends Car {

    public int aditionalWeels;// количество запасных колес

    public Lada(String model, Transmition transmitionType, int numWeels, int aditionalWeels, Fuel fuelType) {
        // так как используем конкретную машину,брен не надо передавать,передаем строку
        // лада и не просим дополнительно пользователя это делать
        super("Lada", model, transmitionType, numWeels, fuelType);// дергаем родительский инициализатор
        this.aditionalWeels = aditionalWeels;// прописываем дописывам то свойство ,которого нет в родительском классе
    }

    @Override
    void move() {
        System.out.println("Lada is moving");
    }

    @Override
    void service() {
        System.out.println("Lada is servicing");
        System.out.println("Tuning is done");
    }

    @Override
    void turnOnHeadlights() {
        System.out.println("Headlights is on");
    }

}
