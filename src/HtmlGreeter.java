//	Create a class named HtmlGreeter. This is a subclass of Greeter.

public class HtmlGreeter extends Greeter {
	
//	tagName (a string)
	private String tagName = "h1";

	
//	2 Constructors
//	greeting (a string): sets greeting on the superclass.
//	Always sets tagName to "h1".
	
public HtmlGreeter(String greeting) {
	super(greeting);
	tagName = "h1";
	
}
//	Constructor Two:
//	greeting (a string): sets greeting on the superclass.
//	tagName (a string): sets the tagName property.

public String getTagName() {
	return tagName;
}

public void setTagName(String tagName) {
	this.tagName = tagName;
}

public HtmlGreeter(String greeting, String tagName) {
	super(greeting);
	this.tagName = tagName;
	
	
}

//	Override greet: Override the greet method to wrap the result in the specified HTML tag. For example, greet might return "<h1>Hello, Grant!</h1>".

@Override
public String greet(String name) {
	// i think some of this could be replaced w/ super();

	String greetingName = "<" + tagName + ">" + getGreeting() + ", " + name + "!" + "</" + tagName + ">";
	
	System.out.println(greetingName);
	return greetingName;
}


//	JUnit Tests: Test with different greetings, names, and tagNames. Also test the default "h1" tagName when the first constructor is used.

	
}
