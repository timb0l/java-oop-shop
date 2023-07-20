package org.lessons.java.shop;

import java.util.Scanner;

/** Create shop(main?)
* create product class(secondary
*    ASK
*   -code
*   -name
*   -description
*   -price
*   -iva
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
        System.out.println("Product Code: " + product.getCodeName(product.getCode()));
        System.out.println("Total Price:" + product.getDefPrice());
        System.out.println("VAT:" + product.getVatPrice());

        scan.close();
    }
}
