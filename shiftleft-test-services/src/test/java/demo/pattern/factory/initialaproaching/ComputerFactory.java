package demo.pattern.factory.initialaproaching;

public class ComputerFactory {
	public static Computer getComputer(Class<? extends Computer> type, String ram, String hdd, String cpu) throws ExceptionInInitializerError{
						
		if(type.equals(PC.class)){
			return new PC(ram, hdd, cpu);
		}else if(type.equals(Server.class)){
			return new Server(ram, hdd, cpu);
		}else{
			throw new ExceptionInInitializerError(type.getName() + " is Incopatible type of " + Computer.class.getName());
		}
	}
}
