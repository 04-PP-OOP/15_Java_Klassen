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

	public String tellYourName(){	
		return this.name;
	}
	
	public String tellYourFurColor(){
		return this.furColor;
	}
	
	public String tellYourAge(){
		return String.valueOf(this.age);
	}
	

}
