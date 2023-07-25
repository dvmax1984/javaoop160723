package javaoop160723.Homework.Homework_001;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Food extends Product{

    double weight;

    public Food(String name, int price, int quantinity, GregorianCalendar gregorianCalendar, double weight) {
        super(name, price, quantinity, gregorianCalendar);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Product [name-" + getName() + ", price-" + getPrice() + ", quantinity-" + getQuantinity() +
         ", bestBefore-" + getBestBefore().get(Calendar.YEAR)+ "/" + getBestBefore().get(Calendar.MONTH) + "weight" + weight + "]";
    }
  
}
