package javaoop160723.Homework.Homework_001;

import java.util.ArrayList;
import java.util.List;

public class Automat {
    
    List <Product> listProduct = new ArrayList<>();

    public Automat(double volume, int temperature) {
    }

    public Automat() {
    }

    public void initProduct(List <Product> myList) {
        listProduct = myList;
    }

    public Product getProduct(String name, int i, int j) {
        for (Product el: listProduct) {
            if (el.getName().equals(name)) {
                return el;
            }
        }
        return null;
}

    public AutomatHotBeverage getProduct(String name, int i, int j) {
        return null;
    }
}
