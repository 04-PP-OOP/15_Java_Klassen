public class Cat {

	// Property | Attribut | Field
	public String name;
	public String furColor;
	public int age;
	public boolean isFemale;
	
	public int level;	

	public Cat(String name, String furColor, int age, boolean isFemale) {
		this.name = name;
		this.furColor = furColor;
		this.age = age;
		this.isFemale = isFemale;
	}

	public String tellYourAttributes(String flag){		
		switch (flag) {
		case "#name":
			return this.name; 		
		case "#color":
			return this.furColor;		
		case "#age":
			return this.checkCompliance();
		default:
			return "Something went wrong!";		
		}		
	}
	
	public String checkCompliance(){
		if (isFemale) {
			return checkEscalationLevel();
		} else {
			return String.valueOf(this.age);
		}
	}
	
	
	public String checkEscalationLevel(){
		
		// 1. --> "This is an inappropriate question!"
		// 2. --> "I've told you once!"
		// 3. --> "Talk to the hand!"
		// 3. --> "something else ..."
			
		this.level++;  // +1
		
		switch (this.level) {
			case 1:
				return "This is an inappropriate question!";			
			case 2:
				return "I've told you once!";			
			case 3:
				return "Talk to the hand!";
			default:
				return "something else ...";			
		}
	}
	
	
}
