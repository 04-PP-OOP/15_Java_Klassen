public class Cat {

	// Property | Attribut | Field
	public String name;
	public String furColor;
	public int age;

	/**
	 * @param name
	 * @param furColor
	 * @param age
	 */
	public Cat(String name, String furColor, int age) {
		this.name = name;
		this.furColor = furColor;
		this.age = age;
	}

	public void tellYourName(){
		System.out.println(this.name);
	}
	
	public void tellYourFurColor(){
		System.out.println(this.furColor);
	}
	
	public void tellYourAge(){
		System.out.println(this.age);
	}
	
	public void tellYourAddress(){
		System.out.println("Address: " + this);
	}

}
