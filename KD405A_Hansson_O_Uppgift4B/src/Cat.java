
public class Cat extends Mammal {
	
	private int numberOfLives;

	public Cat(String latinName, String friendlyName, int gestationTime, int numberOfLives) {
		super(latinName, gestationTime);
		this.numberOfLives = numberOfLives;
		setFriendlyName(friendlyName);
	}

	public int getNumberOfLives() {
		return numberOfLives;
	}

	public void setNumberOfLives(int numberOfLives) {
		this.numberOfLives = numberOfLives;
	}

	@Override
	public String getInfo() {
		
		String info;
		
		info = "the animal " + getLatinName() + " is a cat called " + getFriendlyName() + ", nurses for " + getGestationTime() + " months,  and has " + getNumberOfLives() + "lives";
		
		return info;
	}

}
