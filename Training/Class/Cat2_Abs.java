package Class;

public class Cat2_Abs {
    String name;
    int age;

    static int count = 0;

    public Cat2_Abs() {
        count++;
        this.name = "Уличный кот номер " + count;
    }

    public Cat2_Abs(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        Cat2_Abs streetCat1 = new Cat2_Abs();
        Cat2_Abs streetCat2 = new Cat2_Abs();
        System.out.println(streetCat1.name);
        System.out.println(streetCat2.name);
    }
}
