import java.util.ArrayList;

public class mainTest {
	
	private static ArrayList<bike> bikeCity = new ArrayList<bike>();

	public mainTest() {
	
		
	}

	public static void main(String[] args) {
		
		int index = 1;
		
		bike bike0 = new bike("gul",5000,14);
		bikeCity.add(bike0);
		bike bike1 = new bike("röd",20000,10);
		bikeCity.add(bike1);
		bike bike2 = new bike("svart",17600,13);
		bikeCity.add(bike2);
		bike bike3 = new bike("blå",10000,20);
		bikeCity.add(bike3);
		bike bike4 = new bike("gul",1000,12);
		bikeCity.add(bike4);
		bike bike5 = new bike("grön",500,20);
		bikeCity.add(bike5);
		bike bike6 = new bike("vit",2000,13);
		bikeCity.add(bike6);
		bike bike7 = new bike("svart",10000,12);
		bikeCity.add(bike7);
		bike bike8 = new bike("röd",100,10);
		bikeCity.add(bike8);
		bike bike9 = new bike("rosa",25000000,0);
		bikeCity.add(bike9);
				
		
		for (bike bikes: bikeCity){
			System.out.println("cykeln nummer " + index++ +" är " + bikes.getColor() + " , kostar " + bikes.getPrice() +" och har storleken " + bikes.getSize());
		}
		
		/*for (int i = 0; i < constants.bikeColors.length; i++){
			for(bike bikes: bikeCity.getColor()equals(constants.bikeColors[i])){
				System.out.println("hej");
			}
		}
		
		public void addCat(Cat c){
		if ( allCats.size()<Constants.maxNumberOfCats){
			this.allCats.add(c);

		public void checkColor(){
			if (bike.getColor() = constants.bikeColors){
				System.out.println("hej");
			}
			
		}*/

	}
	

}
