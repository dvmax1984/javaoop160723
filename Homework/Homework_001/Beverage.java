package javaoop160723.Homework.Homework_001;

import java.util.Calendar;

public class Beverage extends Product{

    double volume;

    public Beverage(String name, int price, int quantinity, Calendar bestBefore, double volume) {
        super(name, price, quantinity, bestBefore);
        this.volume = volume;
    }
    
    @Override
    public String toString() {
        return "Product [name-" + getName() + ", price-" + getPrice() + ", quantinity-" + getQuantinity() +
         ", bestBefore-" + getBestBefore().get(Calendar.YEAR)+ "/" + getBestBefore().get(Calendar.MONTH) + "volume" + volume + "]";
    }
}