package org.lessons.java.shop;

import java.util.Random;

/*   -code
     -name
     -description
     -price
     -iva
     -use public/private, constructor, get n set

 -alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
 -Il codice prodotto sia accessibile solo in lettura
 -Gli altri attributi siano accessibili sia in lettura che in scrittura
 -Il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva
 -Il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome:
   il codice deve avere un pad left di zeri per arrivare a 8 caratteri (ad esempio codice 91 diventa 00000091,
       mentre codice 123445567 resta come è)
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
//price-default
    public double getDefPrice(){
        return price;
    }
//vatprice
    public double getVatPrice(){
        return  (price * VAT) / 100 ;
    }
//codename
    public String getCodeName(int number) {
        String num = String.valueOf(number);
        int addZero = 8 - num.length();

        StringBuilder zero = new StringBuilder();
        for (int i = 0; i < addZero; i++) ;{
            zero.append("0");
        }
        zero.append(num);
        return zero.toString();
    }
}

