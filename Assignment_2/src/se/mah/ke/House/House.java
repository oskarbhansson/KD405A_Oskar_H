package se.mah.ke.House;

public class House{
private int yearBuilt;
private int size;
private final int minSize = 10;
private final int maxSize = 1000;
private final int minYearBuilt = 1800;
private final int MaxYearBuilt = 2015;

public House(int yearBuilt,int size){ 
	this.yearBuilt = yearBuilt;
	this.size = size;
	
	if(size < minSize || size > maxSize){
		System.out.println("House must be between " + minSize + " and " + maxSize);
	}
	
	if(yearBuilt < minYearBuilt || yearBuilt > MaxYearBuilt){
		System.out.println("House must be built between " + minYearBuilt + " and " + MaxYearBuilt);
	}
}

public int getYearBuilt(){
	return this.yearBuilt;

	}
public int getSize(){ 
	return this.size;
} 

}