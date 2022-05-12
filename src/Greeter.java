
public class Greeter {

	private String greeting;
	private String name;
	
	
	public Greeter(String greeting) {
		super();
		this.greeting = greeting;
	}

	public Greeter () {
		
	}
	
	public String getGreeting() {
		return greeting;
	}
	
	public void setGreeting (String greeting) {
		this.greeting = greeting;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	// consider overriding toString method instead of doing output from here
	public String greet(String name) {
		String greeting = getGreeting();
		String greetingName = greeting + ", " + name + "!";
		
		System.out.println(greetingName);
		return greetingName;
	}

	
		
	
}
