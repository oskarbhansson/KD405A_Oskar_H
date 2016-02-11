
public class Dog extends Mammal {
	
	private boolean stupid;

	public Dog(String latinName, int gestationTime, boolean stupid) {
		super(latinName, gestationTime);
		this.stupid = stupid;
		
	}

	public Dog(String latinName, String friendlyName, int gestationTime, boolean stupid){
		super(latinName, gestationTime);
		
		this.stupid = stupid;
		
		setFriendlyName(friendlyName);
		
		
	}
	
	public boolean isStupid(){

		return stupid;

	}

	@Override
	public String getInfo() {
		
		String Info;
		if(isStupid() == true){
		Info = "The animal " + getLatinName() + " is a dog called " + getFriendlyName() + ", she nurses for " + getGestationTime() +  "months, and is pretty stupid"; 
		}
		else {
			Info = "The animal " + getLatinName() + " is a dog called " + getFriendlyName() + ", she nurses for " + getGestationTime() +  "moths, and is pretty clever"; 		}
		return Info;
	}
}
