package Class.ExtClassSUPER;

public class Cat extends Animal {

    String tail;
    
    public Cat(String brain, String heart, String tail) {
        super(brain, heart);
        this.tail = tail;        
    }
 
    public static void main(String[] args) {
        Cat cat = new Cat("Мозг", "Сердце", "Хвост");
        System.out.println(cat.brain);
        System.out.println(cat.heart);
        System.out.println(cat.tail);
    }
}
