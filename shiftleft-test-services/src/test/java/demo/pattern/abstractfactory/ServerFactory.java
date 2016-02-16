package demo.pattern.abstractfactory;

import demo.pattern.factory.initialaproaching.Computer;

public class ServerFactory implements IComputerAbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;

	public ServerFactory(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Computer createComputer() {
		System.out.println("Creating Server in ServerFactory");
		return new Server(ram, hdd, cpu);
	}

	@Override
	public String toString() {
		return "ServerFactory [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu
				+ "]";
	}

}
