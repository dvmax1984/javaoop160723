package Class.ExtClass;

public class Cat extends Animal {

    String tail;
    //private String brain;
    //private String heart;
    
    public Cat(String brain, String heart, String tail) {
        this.brain = brain;
        this.heart = heart;
        this.tail = tail;
    }
 
    public static void main(String[] args) {
        Cat cat = new Cat("Мозг", "Сердце", "Хвост");
    }
}
