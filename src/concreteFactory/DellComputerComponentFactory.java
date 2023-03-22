package concreteFactory;

import abstractFactory.ComputerComponentFactory;
import abstractProduct.Case;
import abstractProduct.Monitor;
import abstractProduct.Motherboard;
import abstractProduct.PowerSupply;
import abstractProduct.Processor;
import abstractProduct.RAM;
import concreteProduct.DellCase;
import concreteProduct.DellMonitor;
import concreteProduct.DellMotherboard;
import concreteProduct.DellPowerSupply;
import concreteProduct.DellProcessor;
import concreteProduct.DellRAM;

public class DellComputerComponentFactory implements ComputerComponentFactory {
    public Monitor createMonitor() {
        return new DellMonitor();
    }
    
    public Motherboard createMotherboard() {
        return new DellMotherboard();
    }
    
    public RAM createRAM() {
        return new DellRAM();
    }
    
    public Processor createProcessor() {
        return new DellProcessor();
    }
    
    public PowerSupply createPowerSupply() {
        return new DellPowerSupply();
    }
    
    public Case createCase() {
        return new DellCase();
    }
}