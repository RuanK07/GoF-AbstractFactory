package concreteProduct;

import abstractProduct.Motherboard;

public class DellMotherboard implements Motherboard {
    public String getInfo() {
        return "Dell Motherboard";
    }
}
