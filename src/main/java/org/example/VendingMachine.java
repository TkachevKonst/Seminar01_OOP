package org.example;

import java.util.List;

public class VendingMachine {


    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfMilk getBottleOfMilk(String name, double volume){
        for (Product product: products) {
            if (product instanceof BottleOfMilk){
                BottleOfMilk bottleOfMilk = (BottleOfMilk)product;
                if (bottleOfMilk.getName().equals(name) && bottleOfMilk.getVolume() == volume){
                    return bottleOfMilk;
                }
            }
        }
        return null;
    }
    public Chokolate getChokolate(String name, double kakao){
        for (Product product: products) {
            if (product instanceof Chokolate){
                Chokolate chokolate = (Chokolate)product;
                if (chokolate.getName().equals(name) && chokolate.getKakao() == kakao){
                    return chokolate;
                }
            }
        }
        return null;
    }
}
