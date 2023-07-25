package Class.CatClass;

public class Cat3_gt {

   private String name;
   private int age;
   private int weight;

   public Cat3_gt(String name, int age, int weight) {
       this.name = name;
       this.age = age;
       this.weight = weight;
   }

   public Cat3_gt() {
   }

   public void sayMeow() {
       System.out.println("Мяу!");
   }

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public int getAge() {
       return age;
   }

    /*    public void setAge(int age) {
       this.age = age;
   } */

   public void setAge(int age) {
    if (age >= 0) {
        this.age = age;
    } else {
        System.out.println("Ошибка! Возраст не может быть отрицательным числом!");
    }
 }

   public int getWeight() {
       return weight;
   }

   public void setWeight(int weight) {
       this.weight = weight;
   }
}