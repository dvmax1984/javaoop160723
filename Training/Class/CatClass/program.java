package Class.CatClass;

import javaoop160723.Training.Class.Cat;

public class program {

   public static void main(String[] args) {

    Cat3_gt barsik = new Cat3_gt("Барсик", 5, 4);
    String barsikName = barsik.getName();
    int barsikAge = barsik.getAge();
    int barsikWeight = barsik.getWeight();

    System.out.println("Имя кота: " + barsikName);
    System.out.println("Возраст кота: " + barsikAge);
    System.out.println("Вес кота: " + barsikWeight);

    barsik.sayMeow();


        Cat3_gt barsik2 = new Cat3_gt("Барсик", 5, 4);

       System.out.println("Изначальное имя кота — " + barsik2.getName());
       barsik2.setName("Василий");
       System.out.println("Новое имя кота — " + barsik2.getName());



       Cat3_gt barsik3 = new Cat3_gt("Барсик", 5, 4);
       barsik3.setAge(-1000);

       System.out.println("Возраст Барсика — " + barsik3.getAge() + " лет");
   }
}