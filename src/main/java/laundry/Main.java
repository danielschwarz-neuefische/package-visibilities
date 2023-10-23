package laundry;

public class Main {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine();
        washingMachine.fill("T-shirt");
        washingMachine.fill("Jeans");
        washingMachine.fill("Socks");
        washingMachine.turnOn();
        washingMachine.waitUntilDone();
        String clean = washingMachine.empty();

        System.out.println(clean);
    }
}
