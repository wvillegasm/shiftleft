package demo.pattern.factory.initialaproaching;



public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer(PC.class, "8", "250", "i7");
		Computer server = ComputerFactory.getComputer(Server.class, "32", "1T", "i7");
		
		System.out.println(pc);
		System.out.println(server);
	}

}
