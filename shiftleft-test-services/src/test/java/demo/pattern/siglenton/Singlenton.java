package demo.pattern.siglenton;

import java.util.Date;

public class Singlenton {
	private static volatile Singlenton _instance;
	private Date dateCreated;

	private Singlenton() {
		this.dateCreated = new Date();
	}

	public static Singlenton getInstance() {
		synchronized (Singlenton.class) {
			if (_instance == null) {
				_instance = new Singlenton();
			}
			return _instance;
		}
	}
	
	public Date getDate(){
		return this.dateCreated;
	}

}
