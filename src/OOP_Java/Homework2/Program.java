package OOP_Java.Homework2;

import OOP_Java.Lesson1.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        Plate plate = new Plate(5);
        plate.info();
        
        Cat cat1 = new Cat("Барсик", 5);
        Cat cat2 = new Cat("Моня", 4);
        Cat cat3 = new Cat("Боцман", 3);

        List<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);

        for (Cat cat: cats) {
            plate.setFood(cat.eat());
        }
        for (Cat cat: cats) {
            cat.isBellyful();
        }

        plate.addFood(7);
        plate.info();

        for (Cat cat: cats) {
            plate.setFood(cat.eat());
        }
        for (Cat cat: cats) {
            cat.isBellyful();
        }
    }
}
