package net.mightypixel;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

	private List<Memento> savedStates;
	
	public Caretaker() {
		savedStates = new ArrayList<>();
	}
	
	public void addMemento(Memento memento) {
		savedStates.add(memento);
	}
	
	public Memento restoreMemento(int index) {
		return savedStates.get(index);
	}

}
