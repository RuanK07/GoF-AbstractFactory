package concreteProduct;

import abstractProduct.Monitor;

public class DellMonitor implements Monitor {
    public String getInfo() {
        return "Dell Monitor";
    }
}
