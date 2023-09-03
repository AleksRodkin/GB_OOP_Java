package OOP_Java.Homework2;

import java.util.List;

public class Cat {
    private String name;
    private int appetite;
    private boolean bellyful = false;

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isBellyful() {
        if (bellyful == true) {
            System.out.println(String.format("%s сытый", getName()));
        }
        else {
            System.out.println(String.format("%s голодный", getName()));
        }
        return bellyful;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public int eat() {

        if (bellyful == true) {
            System.out.println(String.format("%s уже сытый", getName()));
            return Plate.getFood();
        }
        else {
            if (Plate.getFood() > 0) {
                int foodLeft = Plate.getFood() - getAppetite();
                if (foodLeft >= 0) {
                    bellyful = true;
                    System.out.println(String.format("%s наелся, съел %d еды, осталось %d еды", getName(), getAppetite(), foodLeft));
                    return foodLeft;
                }
                else if (Plate.getFood() - getAppetite() < 0){
                    System.out.println(String.format("В миске не хватает %d еды, %s не покушал", Math.abs(foodLeft), getName()));
                    return Plate.getFood();
                }
            }
            else {
                System.out.println(String.format("%s не покушал - миска пуста", getName()));
                return Plate.getFood();
            }
        }
        return Plate.getFood();
    }

    public static void checkBellyStatus(List<Cat> catArray){
        System.out.println("~~~~~~~~~~~~~~~~");
        for (Cat cat : catArray) {
            cat.isBellyful();
        }
        System.out.println("~~~~~~~~~~~~~~~~");
    }
}





