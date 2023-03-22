package concreteProduct;

import abstractProduct.Processor;

public class DellProcessor implements Processor {
    public String getInfo() {
        return "Dell Processor";
    }
}