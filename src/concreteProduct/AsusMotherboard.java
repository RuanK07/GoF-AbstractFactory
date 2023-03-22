package concreteProduct;

import abstractProduct.Motherboard;

public class AsusMotherboard implements Motherboard {
    public String getInfo() {
        return "Asus Motherboard";
    }
}