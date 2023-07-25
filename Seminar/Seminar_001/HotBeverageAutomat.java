package javaoop160723.Seminar.Seminar_001;

import java.util.ArrayList;
import java.util.List;

public class HotBeverageAutomat extends Automat{
     
    List<HotBeverage> hotDrinksList = new ArrayList<>();
    
    public void initProduct2(List<HotBeverage> hotDrinksList2) {
        this.hotDrinksList = hotDrinksList2;
    }

    public HotBeverage getProduct2(String name) {
        for (HotBeverage el: hotDrinksList) {

            System.out.println("-//* " + hotDrinksList.toString());
            
            if (el.getName().equals(name)) {
                return el;
            }
        }
        return null;
    }

}
