import java.util.Scanner;

public class GreeterApp {

	public static void main(String[] args) {
		// prompt user for their name 
		System.out.println("Hello, what's your name?");
		Scanner scnr = new Scanner(System.in);
		String name = scnr.nextLine();
		// create new instance of class greeter
		Greeter greeter = new Greeter();
		// setter
		greeter.setName(name);
		// prompt user for desired greeting
		System.out.println("Hi, " + name + " what is your preferred greeting?");
		String greeting = scnr.nextLine();
		// setter
		greeter.setGreeting(greeting);
		// call greet class + print greeting
		greeter.greet(name);
		// simon greeter
		SimonGreeter simonGreeter = new SimonGreeter();
		// simon setters
		simonGreeter.setGreeting(greeting);
		simonGreeter.setName(name);
		simonGreeter.greet(name);
		// loud greeter
		LoudGreeter loudGreeter = new LoudGreeter(greeting);
		System.out.println("How loud would you like the greeting? Enter an integer between 1-10:");
		// maybe add in functionality to limit volume to 10
		int volume = scnr.nextInt();
		if (volume > 10) {
			System.out.println("Too loud, enter an integer between 1-10:");
			volume = scnr.nextInt();
		}
		// loud volume setter
		loudGreeter.setVolume(volume);
		loudGreeter.greet(name);
		// html greeter
		System.out.println("Which html tag would you like?");
		String tagName = scnr.next();
		HtmlGreeter htmlGreeter = new HtmlGreeter(name, tagName);
		htmlGreeter.setGreeting(greeting);
		htmlGreeter.setName(name);
		htmlGreeter.setTagName(tagName);
		htmlGreeter.greet(name);
		
		
		scnr.close();
	}
	
}
