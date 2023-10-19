public class Main {
    public static void main(String[] args) {
        Lada vesta = new Lada("Vesta", Transmition.auto, FourWeelCar.numWeels, 1, Fuel.gas);
        vesta.move();
        vesta.service();

        Tupolev Tu104 = new Tupolev("Tu104", Transmition.manual, TwoFlyingCar.numWings, Type.military, Fuel.diesel);
        Tu104.flight();
    }
}