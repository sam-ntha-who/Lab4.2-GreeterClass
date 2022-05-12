
public class LoudGreeter extends Greeter {
	private String extra = "!";
	private int volume = 0;
	
	
	
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
		for (int i = 1; i <= volume; i++) {
			
			addVolume();
		}
		
		
	}

	public void addVolume() {
		extra += "!";
		
	}
	
	public LoudGreeter (String greeting) {
		super(greeting);
	}
	
		
	
	@Override
	public String greet(String name) {
		String greetingName = getGreeting() + ", " + name + "!" + extra;
		System.out.println(greetingName);
		return greetingName;
	}
}
