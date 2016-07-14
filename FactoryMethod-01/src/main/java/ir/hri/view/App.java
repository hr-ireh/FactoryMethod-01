package ir.hri.view;

import ir.hri.bl.Creator;
import ir.hri.bl.IProduct;

public class App {
    public static void main(String[] args) {
        Creator creator = new Creator();
        IProduct product;

        for (int i = 1; i <= 12; i++) {
            product = creator.FactoryMethod(i);
            System.out.println("Avocados " + product.ShipFrom());
        }
    }
}
