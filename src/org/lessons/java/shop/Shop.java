package org.lessons.java.shop;

import java.util.Scanner;

/*
* Create shop(main?)
* create product class
*   -code
*   -name
*   -description
*   -price
*   -iva
*
* use public/private, constructor, get n set
*
* -alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
* -Il codice prodotto sia accessibile solo in lettura
* -Gli altri attributi siano accessibili sia in lettura che in scrittura
* -Il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva
* -Il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome:
*   il codice deve avere un pad left di zeri per arrivare a 8 caratteri (ad esempio codice 91 diventa 00000091,
*       mentre codice 123445567 resta come è)
* -
* */
public class Shop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Product Management");

        System.out.print("Insert Product");
            String productName = scan.nextLine();

        System.out.print("Insert Description");
            String productDesc = scan.nextLine();

        System.out.print("Insert Price");
            double productPrice = Double.parseDouble(scan.nextLine());

        System.out.print("Insert VAT");
        double productVat = Double.parseDouble(scan.nextLine());

        Product product = new Product(productName,productDesc,productPrice,productVat);

        System.out.println(product);



        scan.close();
    }
}
