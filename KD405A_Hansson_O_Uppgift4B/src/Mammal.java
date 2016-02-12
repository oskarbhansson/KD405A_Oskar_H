/** creates the abstract class Mammal, a subclass Animal, and a super class to Dog and Cat*/

public abstract class Mammal extends Animal {
	private int gestationTime;

	

	public Mammal(String latinName, int gestationTime) {
		super(latinName);
		this.gestationTime = gestationTime;
		
	}

	public int getGestationTime() {
		return gestationTime;
	}
	
	

}
