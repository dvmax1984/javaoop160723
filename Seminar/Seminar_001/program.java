package javaoop160723.Seminar.Seminar_001;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Product product1 = new Food("Twix", 80, 10, new GregorianCalendar(2023,10, 0), 0);
        Product product2 = new Food("Mars", 60, 15, new GregorianCalendar(2023,10,0), 0);
        Product product3 = new Food("Snikers", 50, 5, new GregorianCalendar(2023,10,0), 0);

        Automat list = new Automat();
        List<Product> myList = new ArrayList<>();
        myList.add(product1);
        myList.add(product2);
        myList.add(product3);
        list.initProduct(myList);

        String name = "Twix";
        System.out.println(list.getProduct(name).toString());

        //--------------------------------------------------------
      

        HotBeverage HotBeverage1 = new HotBeverage("Coffee", new BigDecimal(3), 0.3, 90, 10,5);
        HotBeverage HotBeverage2 = new HotBeverage("Tea", new BigDecimal(1), 0.4, 80, 10,5);
        HotBeverage HotBeverage3 = new HotBeverage("Milk", new BigDecimal(3), 1.0, 50,10,5);

        HotBeverageAutomat HotDrinks = new HotBeverageAutomat();
        List<HotBeverage> hotDrinksList = new ArrayList<>(); 

        hotDrinksList.add(HotBeverage1);
        hotDrinksList.add(HotBeverage2);
        hotDrinksList.add(HotBeverage3);
        HotDrinks.initProduct2(hotDrinksList);

        System.out.println("Поиск по названию: " + HotDrinks.getProduct2("Coffee"));
        //System.out.println(HotDrinks.getProduct2("Coffee"));

        //System.out.println("Поиск по цене <=: " + HotDrinks.getProduct(new BigDecimal(2.5)));
        //System.out.println("Поиск по температуре <=: " + HotDrinks.getProduct(70));
    }
}
