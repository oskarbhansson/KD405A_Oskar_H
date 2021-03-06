package catGame;

import java.util.ArrayList;

public class CatFarm {
	private ArrayList<Cat> allCats;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CatFarm(String name){
		allCats = new ArrayList <Cat>();
		this.name = name;
	}
	
	public void addCat(Cat c){
		if (allCats.size()<101){
			this.allCats.add(c);
		}
	}
	
	public void killCat(){
		allCats.remove(0);
	}
	
	public String getCats(){
		String s = this.name+"\n";
		for (Cat cat : allCats){
			s = s + cat.getName() + "\n";
		}
		return s;
	}

}
