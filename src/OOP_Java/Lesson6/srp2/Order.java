package OOP_Java.Lesson6.srp2;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class Order {

    private static int counter;
    private int number;
    private String clientName;
    private String product;
    private int qnt;
    private int price;

    {
        number = ++counter;
    }

    public Order(){

    }

    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public int getPrice() {
        return price;
    }

    public void saveOrder(String fileNaming, String extension) {
        String fileName = SaveFile.fileExtension(fileNaming, extension);
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("{\n");
            writer.write("\"order #" + LocalDate.now()+"-"+ number+ "\",\n");
            writer.write("\"order_time\":\"" + CurrentDateTime.strDate + "\",\n");
            writer.write("\"clientName\":\""+ clientName + "\",\n");
            writer.write("\"product\":\""+product+"\",\n");
            writer.write("\"qnt\":"+qnt+",\n");
            writer.write("\"price\":"+price+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    public void inputFromConsole(){
        clientName = prompt("Client name: ");
        product = prompt("Product: ");
        qnt = Integer.parseInt(prompt("Quantity: "));
        price = Integer.parseInt(prompt("Price: "));
    }
}

