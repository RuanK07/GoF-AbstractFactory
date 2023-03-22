package abstractFactory;

import abstractProduct.Case;
import abstractProduct.Monitor;
import abstractProduct.Motherboard;
import abstractProduct.PowerSupply;
import abstractProduct.Processor;
import abstractProduct.RAM;

public interface ComputerComponentFactory {
	Monitor createMonitor();
    Motherboard createMotherboard();
    RAM createRAM();
    Processor createProcessor();
    PowerSupply createPowerSupply();
    Case createCase();
}
