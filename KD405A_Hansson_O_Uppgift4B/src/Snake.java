
public class Snake extends Animal {

	private boolean poisonous;
	
	public Snake(String latinName, boolean poisonous) {
		super(latinName);
		
		this.poisonous = poisonous;
		
	}
	public boolean isPoisonous(){
		return poisonous;
	}
	
	@Override
	public String getInfo() {
		String info;
		if(isPoisonous() == true){
			info = "The snake "  + getLatinName() + " is poisonous";
		}
		else{
			info = "The snake "  + getLatinName() + " is not poisonous";
		}
		
		return info;
	}

}
