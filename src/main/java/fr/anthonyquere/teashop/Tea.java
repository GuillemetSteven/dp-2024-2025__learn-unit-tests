package fr.anthonyquere.teashop;

import java.util.function.IntPredicate;

public class Tea {
    private String name;
    private int steepingTimeSeconds;
    private int idealTemperatureCelsius;
    private boolean isLoose; // loose leaf vs tea bag

    public Tea(String name, int steepingTimeSeconds, int idealTemperatureCelsius, boolean isLoose) {
        this.name = name;
        this.steepingTimeSeconds = steepingTimeSeconds;
        this.idealTemperatureCelsius = idealTemperatureCelsius;
        this.isLoose = isLoose;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSteepingTimeSeconds() {
        return steepingTimeSeconds;
    }

    public void setSteepingTimeSeconds(int steepingTimeSeconds) {
        this.steepingTimeSeconds = steepingTimeSeconds;
    }

    public int getIdealTemperatureCelsius() {
        return idealTemperatureCelsius;
    }

    public void setIdealTemperatureCelsius(int idealTemperatureCelsius) {
        this.idealTemperatureCelsius = idealTemperatureCelsius;
    }

    public boolean isLoose() {
        return isLoose;
    }

    public void setLoose(boolean loose) {
        isLoose = loose;
    }
}
