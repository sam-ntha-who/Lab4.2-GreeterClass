
public class SimonGreeter extends Greeter {

	@Override
	public String greet(String name) {
		// i think some of this could be replaced w/ super();
		String greeting = getGreeting();
		String greetingName = "Simon Says, \"" + greeting + ", " + name + "!\"";
		
		System.out.println(greetingName);
		return greetingName;
	}
	
}
