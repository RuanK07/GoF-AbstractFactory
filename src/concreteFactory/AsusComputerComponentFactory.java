package concreteFactory;

import abstractFactory.ComputerComponentFactory;
import abstractProduct.Case;
import abstractProduct.Monitor;
import abstractProduct.Motherboard;
import abstractProduct.PowerSupply;
import abstractProduct.Processor;
import abstractProduct.RAM;
import concreteProduct.AsusCase;
import concreteProduct.AsusMonitor;
import concreteProduct.AsusMotherboard;
import concreteProduct.AsusPowerSupply;
import concreteProduct.AsusProcessor;
import concreteProduct.AsusRAM;

public class AsusComputerComponentFactory implements ComputerComponentFactory {
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
    
    public Motherboard createMotherboard() {
        return new AsusMotherboard();
    }
    
    public RAM createRAM() {
        return new AsusRAM();
    }
    
    public Processor createProcessor() {
        return new AsusProcessor();
    }
    
    public PowerSupply createPowerSupply() {
        return new AsusPowerSupply();
    }
    
    public Case createCase() {
        return new AsusCase();
    }
}
