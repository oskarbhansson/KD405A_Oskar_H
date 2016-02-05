/** the public class bike */
public class bike {
	private String color;
	private int price;
	private int size;
	
	
	/** constructor for the class bike*/
	
	public bike(){
		
	}
	public bike(String color, int size){
		this.color = color;
		this.size = size;
		
		
	}
	
	
/** constructor for the class bike*/
	public bike(String color, int size, int price) {
		this.color = color;
		this.price = price;
		this.size = size;
		
		/** limits the values of the class bike */
		if (size>= constants.MIN_SIZE && size <= constants.MAX_SIZE){
			this.size = size;
		}
		else if(size<constants.MIN_SIZE){
			this.size = constants.MIN_SIZE;
		}
		else if(size>constants.MAX_SIZE){
			this.size = constants.MAX_SIZE;
		}
		if (price>= constants.MIN_PRICE && price <= constants.MAX_PRICE){
			this.price = price;
		}
		else {
			this.price = constants.MAX_PRICE;
		}
		for(int i = 0; i < constants.bikeColors.length; i++){
		if (0 == color.compareTo(constants.bikeColors[i].toString())){
			this.color = color;
			break;
		}
			else {
				//this.color = constants.bikeColors[0];
				
				this.color = "!ERROR!";
			}
		
		}	

		}
		
		/**methods used in main.java for the variables size,price and color*/
	public int getSize() {
		return size;
	}

	
	public void setPrice(int price) {
		
			this.price = price;
		}
	
	
	public String getColor() {
		
		return color;
	}

	public int getPrice() {
		return this.price;
	}
	
}
