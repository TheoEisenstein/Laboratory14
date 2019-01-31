package laboratory14eisenstein;

public abstract class Player {

	protected String name; //fields (aka instance variable)

	public Player() {  //no-arg construct
		
	}
	
	public Player(String name) { //overloaded constructor
		this.name = name;
	}
	
	public String getName() { //getter
		return name;
	}

	public void setName(String name) {  //setter
		this.name = name;
	}
	
	public abstract Roshambo generateRoshambo(); //concrete subclasses must override/implement this method
	

	@Override
	public String toString() {
		return "Player [name=" + name + "]";
	}
	
}
