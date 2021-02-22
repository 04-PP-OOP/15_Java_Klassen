public class Yard {

	public static void main(String[] args) {
	
	Cat cat = new Cat("Alonzo", "black", 35);
	
	cat.tellYourName();
	cat.tellYourFurColor();
	cat.tellYourAge();
	cat.tellYourAddress();
	
	System.out.println("------------------");

	Cat cat2 = new Cat("Grizabella", "white", 29);
	cat2.tellYourName();
	cat2.tellYourFurColor();
	cat2.tellYourAge();
	cat2.tellYourAddress();

	}

}
