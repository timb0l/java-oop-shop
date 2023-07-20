package org.lessons.java.shop;

import java.util.Random;

/*   -code
     -name
     -description
     -price
     -iva
 */
public class Product {

    private int code;
    private String name;
    private String description;
    private double price;
    private double VAT;

    //cons
    public Product(String name, String description, double price, double VAT) {
        Random random = new Random();

        int randomCode = random.nextInt(999999999) + 1;
        this.code = randomCode;
        this.name = name;
        this.description = description;
        this.price = price;
        this.VAT = VAT;
    }
//get-set

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVAT() {
        return VAT;
    }

    public void setVAT(double VAT) {
        this.VAT = VAT;
    }
//meth
    @Override
    public String toString() {
        return "Product ||" +
                " Code: " + code +
                " | Name: " + name +
                " | Description: " + description +
                " | Price: " + price +
                " | VAT: " + VAT +
                " ||";

    }
}

