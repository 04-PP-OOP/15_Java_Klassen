public class Yard {

	public static void main(String[] args) {
	
	Cat cat = new Cat("Alonzo", "black", 35);
	
	ausgabe(cat.tellYourName());
	ausgabe(cat.tellYourFurColor());
	ausgabe(cat.tellYourAge());
	
	System.out.println("------------------");

	Cat cat2 = new Cat("Grizabella", "white", 29);
	ausgabe(cat2.tellYourName());
	ausgabe(cat2.tellYourFurColor());
	ausgabe(cat2.tellYourAge());

	//ausgabe("hallo");
		
	}
	
	// Statische Methode // statischer Kontext
	public static void ausgabe(String outStr){
		System.out.println(outStr);
	}
	

}
