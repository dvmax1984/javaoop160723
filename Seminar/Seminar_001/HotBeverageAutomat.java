package javaoop160723.Seminar.Seminar_001;

import java.util.ArrayList;
import java.util.List;

public class HotBeverageAutomat extends Automat{
     
    List <HotBeverage> hotDrinksList = new ArrayList<>();
    List <HotBeverage> resultFind = new ArrayList<>();
    
    public void HotBeverageAutomat(List<HotBeverage> list) {
        this.hotDrinksList = list;
    }

    public Product getProduct(String name) {
        
        resultFind.clear();
        for (HotBeverage el : hotDrinksList) {
            System.out.println(hotDrinksList.toString());
            if (el.getName().equals(name))  
            // resultFind.add(el);
            return el;
            
        }
        return null;
    }

    public Product getProduct(String name, int volume, int temperature) {
        for (HotBeverage el : hotDrinksList) {
            System.out.println(hotDrinksList.toString() && el.volume == volume);
            if (el.getName().equals(name))  
            // resultFind.add(el);
            return el;
            
        }
        return null;

    }
}
