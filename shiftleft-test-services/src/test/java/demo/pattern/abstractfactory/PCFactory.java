package demo.pattern.abstractfactory;

import demo.pattern.factory.initialaproaching.Computer;

public class PCFactory implements IComputerAbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;

	public PCFactory(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Computer createComputer() {
		System.out.println("Creating PC in PCFactory");
		return new PC(ram, hdd, cpu);
	}

	@Override
	public String toString() {
		return "PCFactory [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + "]";
	}

}
