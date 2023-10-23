package org.example;

public class WashingMachine {

    private boolean running;
    private boolean clean;
    private String items = "";

    public void fill(String item) {
        items += item + ", ";
        clean = false;
    }

    public void turnOn() {
        running = true;
    }

    public void waitUntilDone() {
        if (running) {
            running = false;
            clean = true;
        }
    }

    public String empty() {
        String result = "";
        if (items.isEmpty()) {
            return "Nothing";
        }
        if (clean) {
            result += "Clean";
        } else {
            result += "Dirty";
        }
        result += " ";
        result += items.substring(0, items.length() - 2);
        items = "";
        return result;
    }
}
