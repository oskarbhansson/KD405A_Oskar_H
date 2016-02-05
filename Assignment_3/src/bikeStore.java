import java.util.ArrayList;


public class bikeStore {
	
	
	
	private static  ArrayList<bike> bikeStore = new ArrayList<bike>();

	public bikeStore() {
		
	}

	public static String getAllBikes(){
		String allMyBikes = "";
		
		for (int i = 0; i < bikeStore.size(); i++){
			allMyBikes += "cykel nummer " + (i+1) + " har färgen " + bikeStore.get(i).getColor() + " och har hjulstorlek " + bikeStore.get(i).getSize()+ " och kostar " + bikeStore.get(i).getPrice() + "\n";
		
		
			
		}
		return allMyBikes;
	}
	
	public static void addBike(String color, int size, int price){
		
		bikeStore.add(new bike(color, size, price));

		
}
	
	
}
