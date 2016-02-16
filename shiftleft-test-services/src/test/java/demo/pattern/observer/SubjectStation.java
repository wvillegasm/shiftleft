package demo.pattern.observer;

public interface SubjectStation {
	void suscribe(Observer o);
	void unsuscribe(Observer o);
	void notifyObservers();
}
