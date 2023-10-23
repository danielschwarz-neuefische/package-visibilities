package de.neuefische.laundry;

public class Main {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine();
        washingMachine.fill("T-Shirt");
        System.out.println(washingMachine);
        washingMachine.turnOn();
        washingMachine.waitUntilFinished();
        String result = washingMachine.empty();
        System.out.println(result);
    }
}