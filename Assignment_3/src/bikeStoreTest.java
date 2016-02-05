
public class bikeStoreTest {
	

	public bikeStoreTest() {
		
	}

	public static void main(String[] args) {
		bikeStore testBikestore = new bikeStore();
		
		
		testBikestore.addBike("vit",10,20);
		
		testBikestore.addBike("blå",40000,10);
		
		testBikestore.addBike("fdsf",500000 , 4325435);
		
		
		System.out.println(testBikestore.getAllBikes());
		
		

	}

}
