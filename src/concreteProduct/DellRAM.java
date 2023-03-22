package concreteProduct;

import abstractProduct.RAM;

public class DellRAM implements RAM {
    public String getInfo() {
        return "Dell RAM";
    }
}