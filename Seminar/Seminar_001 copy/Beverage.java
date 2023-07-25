package javaoop160723.Seminar.Seminar_001;

public class Beverage {
    private double volume;
    
    public Beverage(double volume) {
        this.volume = volume;
    }
    
    public double getVolume() {
        return volume;
    }
    
    @Override
    public String toString() {
        return "Beverage [volume=" + volume + "]";
    }
}
