package javaoop160723.Seminar.Seminar_001;

import java.util.GregorianCalendar;

public class Food extends Product{ 

    private double weight;

    public Food(String name, int price, int quantinity, GregorianCalendar gregorianCalendar, double weight) {
        super(name, price, quantinity, gregorianCalendar);
        this.weight = weight;        
    }
    
    /*public Food(String string, int i, int j, GregorianCalendar gregorianCalendar) {
    }*/

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) this.weight = weight;
        else System.out.println("Масса должна быть больше нуля!");
    }

    @Override
    public String toString() {
        return super.toString() + "масса = " + weight + " ";
    }
}