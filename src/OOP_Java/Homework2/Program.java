package OOP_Java.Homework2;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        Plate plate = new Plate(12);
        plate.info();
        
        Cat cat1 = new Cat("Барсик", 7);
        Cat cat2 = new Cat("Моня", 6);
        Cat cat3 = new Cat("Боцман", 4);

        List<Cat> catArrayList = new ArrayList<>();
        catArrayList.add(cat1);
        catArrayList.add(cat2);
        catArrayList.add(cat3);

        plate.feast(catArrayList);
        Cat.checkBellyStatus(catArrayList);

        plate.addFood(5);
        plate.info();

        plate.feast(catArrayList);
        Cat.checkBellyStatus(catArrayList);
    }
}
