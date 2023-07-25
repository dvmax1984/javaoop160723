package javaoop160723.Seminar.Seminar_001;

import java.math.BigDecimal;
import java.util.GregorianCalendar;

public class Beverage extends Product{
    private double volume;
    
    public Beverage(String name, BigDecimal bigDecimal, double d, int i, double volume) {
        super(name, bigDecimal, d, i);
        this.volume = volume;        
    }
    

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        if (volume > 0) this.volume = volume;
        else System.out.println("Объем должна быть больше нуля!");
    }
    
    @Override
    public String toString() {
        return "Beverage [объем=" + volume + "]";
    }
}