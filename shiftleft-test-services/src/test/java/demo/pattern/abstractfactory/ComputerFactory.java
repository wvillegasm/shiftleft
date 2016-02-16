package demo.pattern.abstractfactory;

import demo.pattern.factory.initialaproaching.Computer;

public class ComputerFactory {
	public static Computer getComputer(IComputerAbstractFactory factory){
		return factory.createComputer();
	}
}
