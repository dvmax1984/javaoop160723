package javaoop160723.Homework.Homework_001;

public class AutomatHotBeverage extends Automat{

    int temperature;
    
    public AutomatHotBeverage() {
        super();
        this.temperature = temperature;
    }

    public Automat getProduct(String name, double volume, int temperature) {
        Automat hotBeverage = new Automat(volume, temperature);
        return hotBeverage;
    }


}

