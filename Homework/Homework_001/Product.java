package javaoop160723.Homework.Homework_001;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
/* Реализуйте класс Товар, содержащий данные о товаре, и 
ТорговыйАвтомат, содержащий в себе методы initProducts (List <Product>)
 сохраняющий в себе список исходных продуктов и getProduct(String name)
 */
public class Product {
    
    private String name;
    private int price;
    private int quantinity;
    private Calendar bestBefore;

    public Product(String name, int price, int quantinity, Calendar bestBefore) {
        this.name = name;
        this.price = price;
        this.quantinity = quantinity;
        this.bestBefore = bestBefore;
    }

    public Calendar getBestBefore() {
        return bestBefore;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantinity() {
        return quantinity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBestBefore(Calendar bestBefore) {
        this.bestBefore = bestBefore;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void setQuantinity(int quantinity) {
        this.quantinity = quantinity;
    }

    @Override
    public String toString() {
        return "Product [name-" + name + ", price-" + price + ", quantinity-" + quantinity +
         ", bestBefore-" + bestBefore.get(Calendar.YEAR)+ "/" + bestBefore.get(Calendar.MONTH) + "]";
    }
}
