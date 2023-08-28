package OOP_Java.Lesson1;

import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(String name, double volume){
        for (Product product : products) {
            if (product instanceof BottleOfWater){
                BottleOfWater bottleOfWater = (BottleOfWater)product;
                if (bottleOfWater.getName().equals(name) && bottleOfWater.getVolume() == volume){
                    return bottleOfWater;
                }
            }
        }
        return null;
    }

    public ChocolateBar getChocolateBar(String name, double weight){

        for (Product product : products) {
            if (product instanceof ChocolateBar) {
                ChocolateBar chocolateBar = (ChocolateBar) product;
                if (chocolateBar.getName().equals(name) && chocolateBar.getWeight() == weight) {
                    return chocolateBar;
                }
            }
        }
        return null;
    }

}
