package de.neuefische.laundry;

import java.util.Objects;

public class WashingMachine {

    private String contents = "";
    private boolean clean = true;

    public void fill(String item) {
        contents += item + ", ";
        clean = false;
    }

    protected void turnOn() {
    }

    public void waitUntilFinished() {
        clean = true;
    }

    public String empty() {
        String result = "";
        if (contents.isEmpty()) {
            return "Nothing";
        }
        if (clean) {
            result += "Clean";
        } else {
            result += "Dirty";
        }
        result += " ";
        result += contents.substring(0, contents.length() - 2);
        contents = "";
        return result;
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "contents='" + contents + '\'' +
                ", clean=" + clean +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WashingMachine that = (WashingMachine) o;

        if (clean != that.clean) return false;
        return Objects.equals(contents, that.contents);
    }

    @Override
    public int hashCode() {
        int result = contents != null ? contents.hashCode() : 0;
        result = 31 * result + (clean ? 1 : 0);
        return result;
    }
}
