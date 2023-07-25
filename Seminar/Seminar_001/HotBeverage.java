package javaoop160723.Seminar.Seminar_001;

import java.math.BigDecimal;
import java.util.GregorianCalendar;

public class HotBeverage extends Beverage{
    private int temperature;
    
    public HotBeverage(String name, BigDecimal bigDecimal, double d, int i, double volume, int temperature) {
        super(name, bigDecimal, d, i, volume);
        this.temperature = temperature;        
    }    


    public int getTemperature() {
    return temperature;
    }

    public void getTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String getName() {
        return "name=" + name + "]";
    }
    
    @Override
    public String toString() {
        return "Beverage [объем=" + temperature + "]";
    }
}
