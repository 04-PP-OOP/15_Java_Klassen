public class Yard {

	public static void main(String[] args) {
	
	// Cat --> Klasse
	// cat --> Referenz auf das Objekt/Instanz (Referenz-Variable)
		
	Cat	cat = new Cat();
	System.out.println("Blick von aussen: " + cat);
	cat.tellYourAddress();
	
	System.out.println("------------------");
	
	Cat cat2 = new Cat();
	System.out.println("Blick von aussen: " + cat2);
	cat2.tellYourAddress();


	}

}
