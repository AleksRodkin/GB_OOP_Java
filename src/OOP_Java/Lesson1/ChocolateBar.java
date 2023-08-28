package OOP_Java.Lesson1;

public class ChocolateBar extends Product {

    private double calories; // Калории
    private double weight; // Вес

    public ChocolateBar(String name, String brand, double price, double calories, double weight) {
        super(name, brand, price);
        this.calories = calories;
        this.weight = weight;
    }

    public double getCalories() {
        return calories;
    }
    public double getWeight() { return weight;}

    @Override
    public String displayInfo() {
        return String.format("[Шоколадный батончик] %s - %s - %.2f рублей - cal: %.2f - w: %.2f", name, brand, price, calories, weight);
    }
}
