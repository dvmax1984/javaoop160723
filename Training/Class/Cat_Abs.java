package Class;

public class Cat_Abs {

    String name;
    int age;

    public Cat_Abs(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        Cat_Abs barsik = new Cat_Abs("Барсик", 5);
        System.out.println(barsik.name);
        System.out.println(barsik.age);
    }
}