package catGame;

public class TestCat {
	
	public static void main(String[] args){
		System.out.println("testar Catklass");
		System.out.println("hejhej");
		Cat c = new Cat();
		Cat a = new Cat("svart", "basse");
		System.out.println("en katt är " + c.getName() + " och den andra är " + a.getName());
		
		}

}
