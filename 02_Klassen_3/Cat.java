public class Cat {

	// Property | Attribut | Field
	public String name = "nobody";
	
	public void tellYourAddress(){
		System.out.println("Address: " + this);
	}
	
	public void tellYourName(){
		System.out.println(this.name);
	}
	
	public void changeYourName(String name){
		this.name = name;
	}
	
}
