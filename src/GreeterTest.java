import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreeterTest {

	@Test
	void greeterGetNameTest() {
		String name = "Sam";
		Greeter greeter = new Greeter();
		greeter.setName(name);
		String expected = "Sam";
		String actual = greeter.getName();;
		assertEquals(expected, actual);
	}
	@Test
	void greeterGetName2Test() {
		String name = "Bianca";
		Greeter greeter = new Greeter();
		greeter.setName(name);
		String expected = "Bianca";
		String actual = greeter.getName();;
		assertEquals(expected, actual);
	}
	
	@Test
	void greeterGetGreetingTest() {
		String greeting = "Good morning";
		Greeter greeter = new Greeter();
		greeter.setGreeting(greeting);
		String expected = "Good morning";
		String actual = greeter.getGreeting();
		assertEquals(expected, actual);
	}
	@Test
	void greeterGetGreeting2Test() {
		String greeting = "Guten morgen";
		Greeter greeter = new Greeter();
		greeter.setGreeting(greeting);
		String expected = "Guten morgen";
		String actual = greeter.getGreeting();
		assertEquals(expected, actual);
	}
	
	@Test
	void greeterGreetTest() {
		String greeting = "Good morning";
		String name = "Alaska";
		Greeter greeter = new Greeter();
		greeter.setGreeting(greeting);
		greeter.setName(name);
		String expected = "Good morning, Alaska!";
		String actual = greeter.greet(name);
		assertEquals(expected, actual);
	} 

	@Test
	void greeterGreet2Test() {
		String greeting = "Guten morgen";
		String name = "Bob";
		Greeter greeter = new Greeter();
		greeter.setGreeting(greeting);
		greeter.setName(name);
		String expected = "Guten morgen, Bob!";
		String actual = greeter.greet(name);
		assertEquals(expected, actual);
	} 
	
	@Test
	void greeterSimonGreetTest() {
		String greeting = "Good morning";
		String name = "Trixie";
		SimonGreeter greeter = new SimonGreeter();
		greeter.setGreeting(greeting);
		greeter.setName(name);
		String expected ="Simon Says, \"Good morning, Trixie!\"";
		String actual = greeter.greet(name);
		assertEquals(expected, actual);
	} 
	@Test
	void greeterSimonGreet2Test() {
		String greeting = "Bonjour";
		String name = "Sabin";
		SimonGreeter greeter = new SimonGreeter();
		greeter.setGreeting(greeting);
		greeter.setName(name);
		String expected ="Simon Says, \"Bonjour, Sabin!\"";
		String actual = greeter.greet(name);
		assertEquals(expected, actual);
	} 
	
	@Test
	void greeterLoudGreeterTest() {
		String greeting = "Good morning";
		String name = "Latrice";
		int volume = 0;
		LoudGreeter greeter = new LoudGreeter(greeting);
		greeter.setGreeting(greeting);
		greeter.setName(name);
		greeter.setVolume(volume);
		String expected ="Good morning, Latrice!!";
		String actual = greeter.greet(name);
		assertEquals(expected, actual);
	} 
	
	@Test
	void greeterLoudGreeter2Test() {
		String greeting = "Bienvenue";
		String name = "Yvie";
		int volume = 4;
		LoudGreeter greeter = new LoudGreeter(greeting);
		greeter.setGreeting(greeting);
		greeter.setName(name);
		greeter.setVolume(volume);
		String expected ="Bienvenue, Yvie!!!!!!";
		String actual = greeter.greet(name);
		assertEquals(expected, actual);
	} 
	
	@Test
	void greeterLoudGreeterNoVolumeCallTest() {
		String greeting = "Bienvenue";
		String name = "Sharon";
		LoudGreeter greeter = new LoudGreeter(greeting);
		greeter.setGreeting(greeting);
		greeter.setName(name);
		String expected ="Bienvenue, Sharon!!";
		String actual = greeter.greet(name);
		assertEquals(expected, actual);
	} 
	@Test
	void addVolumeTest() {
		String greeting = "";
		String name = "";
		LoudGreeter loudGreeter = new LoudGreeter(greeting);
		loudGreeter.addVolume();
		// greet method outputs greeting but doesn't innately call addVolume
		String expected = ", !!!";
		String actual = loudGreeter.greet(name);
		assertEquals(expected, actual);
	}
	@Test
	void addVolume2Test() {
		String greeting = "";
		String name = "";
		LoudGreeter loudGreeter = new LoudGreeter(greeting);
		loudGreeter.addVolume();
		loudGreeter.addVolume();
		loudGreeter.addVolume();
		// greet method outputs greeting but doesn't innately call addVolume
		String expected = ", !!!!!";
		String actual = loudGreeter.greet(name);
		assertEquals(expected, actual);
	}
	@Test
	void addVolumeNoneTest() {
		String greeting = "";
		String name = "";
		LoudGreeter loudGreeter = new LoudGreeter(greeting);
		// greet method outputs greeting but doesn't innately call addVolume
		String expected = ", !!";
		String actual = loudGreeter.greet(name);
		assertEquals(expected, actual);
	}
	@Test
	void greeterHTMLTest() {
		String greeting = "Bonjour";
		String name = "Sabin";
		HtmlGreeter greeter = new HtmlGreeter(name);
		greeter.setGreeting(greeting);
		greeter.setName(name);
		String expected ="<h1>Bonjour, Sabin!</h1>";
		String actual = greeter.greet(name);
		assertEquals(expected, actual);
	} 
	void greeterHTMLTagTest() {
		String greeting = "Bonjour";
		String name = "Sabin";
		String tagName = "p";
		HtmlGreeter greeter = new HtmlGreeter(name);
		greeter.setGreeting(greeting);
		greeter.setName(name);
		greeter.setTagName(tagName);
		String expected ="<p1>Bonjour, Sabin!</p1>";
		String actual = greeter.greet(name);
		assertEquals(expected, actual);
	} 
}
