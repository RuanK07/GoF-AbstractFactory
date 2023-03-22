package run;

import java.util.Scanner;

import abstractFactory.ComputerComponentFactory;
import abstractProduct.Case;
import abstractProduct.Monitor;
import abstractProduct.Motherboard;
import abstractProduct.PowerSupply;
import abstractProduct.Processor;
import abstractProduct.RAM;
import concreteFactory.AsusComputerComponentFactory;
import concreteFactory.DellComputerComponentFactory;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual o tipo de computador que você deseja (Dell ou Asus)?");
        String tipoComputador = scanner.nextLine().toLowerCase();
        
        ComputerComponentFactory fabricaComponentes = null;
        if (tipoComputador.equals("dell")) {
            fabricaComponentes = new DellComputerComponentFactory();
        } else if (tipoComputador.equals("asus")) {
            fabricaComponentes = new AsusComputerComponentFactory();
        } else {
            System.out.println("Tipo de computador inválido.");
            return;
        }
        
        System.out.println("Componentes do computador:");
        System.out.println("- Monitor: " + fabricaComponentes.createMonitor().getInfo());
        System.out.println("- Placa-mãe: " + fabricaComponentes.createMotherboard().getInfo());
        System.out.println("- Memória RAM: " + fabricaComponentes.createRAM().getInfo());
        System.out.println("- Processador: " + fabricaComponentes.createProcessor().getInfo());
        System.out.println("- Fonte de energia: " + fabricaComponentes.createPowerSupply().getInfo());
        System.out.println("- Gabinete: " + fabricaComponentes.createCase().getInfo());
    }
}