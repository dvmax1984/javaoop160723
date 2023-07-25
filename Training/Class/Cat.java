package Class;
public class Cat {

// https://javarush.com/groups/posts/1949-znakomstvo-s-klassami-napisanie-sobstvennihkh-klassov-konstruktorih

    String name;
    int age;

    public static void main(String[] args) {
        Cat barsik = new Cat();
        barsik.age = 3;
        barsik.name = "Барсик";

        System.out.println("Мы создали кота по имени " + barsik.name + ", его возраст - " + barsik.age);
    }

    public void sayMeow() {
    }

}