package demo.pattern.abstractfactory;

import demo.pattern.factory.initialaproaching.Computer;

public class ComputerAbstractFactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Computer c = ComputerFactory.getComputer(new PCFactory("4", "500", "i7"));
		Computer s = ComputerFactory.getComputer(new ServerFactory("4", "500", "i7"));
		
		
		System.out.println(" PC: " + c);
		
		System.out.println(" Server: " + s);

	}

}
