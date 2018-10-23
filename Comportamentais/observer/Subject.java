package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	
	public List<Observer> observers = new ArrayList<>();
	
	public abstract void addObserver(Observer observer);
	public abstract void removeObserver(Observer observer);
	public abstract void notifyObserver();
}
