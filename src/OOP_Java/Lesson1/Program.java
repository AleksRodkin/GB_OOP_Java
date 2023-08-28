package OOP_Java.Lesson1;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

//        Product product1 = new Product();
//        product1.name = "Product1";
//        product1.brand = "Brand1";
//        product1.price = 200;
//        System.out.println(product1.displayInfo());
//
//        Product product2 = new Product("Product2", "Brand2", 100);
//        System.out.println(product2.displayInfo());
//        product2.setPrice(400);
//        double price = product2.getPrice();
//        System.out.println(price);
//        System.out.println(product2.displayInfo());
//
//        Product product3 = new Product("Product3");
//        System.out.println(product3.displayInfo());

        Product bottleOfMilk1 =
                new BottleOfMilk("Бутылка1", "ООО Молоко", 350, 1.5, 15);

        Product bottleOfWater1 =
                new BottleOfWater("Бутылка c водой", "ООО Источник", 350, 1);
        Product bottleOfWater2 =
                new BottleOfWater("Бутылка c водой", "ООО Источник", 150, 1.5);
        Product bottleOfWater3 =
                new BottleOfWater("Бутылка c водой", "ООО Источник", 250, 2);

        Product chocolateBar1 =
                new ChocolateBar("Snikers", "MARS", 100, 300, 50);
        System.out.println(chocolateBar1.displayInfo());
        Product chocolateBar2 =
                new ChocolateBar("Mars", "MARS", 120, 320, 45);
        System.out.println(chocolateBar2.displayInfo());
        Product chocolateBar3 =
                new ChocolateBar("Twix", "MARS", 110, 310, 55);
        System.out.println(chocolateBar2.displayInfo());

        System.out.println("------------------");

        List<Product> products = new ArrayList<>();
        products.add(bottleOfMilk1);
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfWater3);
        products.add(chocolateBar1);
        products.add(chocolateBar2);
        products.add(chocolateBar3);

        VendingMachine vendingMachine = new VendingMachine(products);
        BottleOfWater bottleOfWater = vendingMachine.getBottleOfWater("Бутылка c водой", 2);
        if (bottleOfWater != null){
            System.out.println("Вы получили: ");
            System.out.println(bottleOfWater.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }

        ChocolateBar chocolateBar = vendingMachine.getChocolateBar("Mars", 45);
        if (chocolateBar != null) {
            System.out.println("Вы получили: ");
            System.out.println(chocolateBar.displayInfo());
        }
        else {
            System.out.println("Такого шоколадного батончика нет в автомате.");
        }
    }
}