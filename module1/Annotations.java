// Java Program to Demonstrate Type Annotation

import java.lang.annotation.Target;

// Using target annotation to annotate a type
//@Target(ElementType.TYPE_USE)

// Declaring a simple type annotation
//@interface TypeAnnoDemo{}

// Main class
public class Annotations {

	// Main driver method
	public static void main(String[] args) {

		// Annotating the type of a string
		 String string = "I am annotated with a type annotation";
		System.out.println(string);
		abc();
	}

	// Annotating return type of a function
	static  int abc() {
	
		System.out.println("This function's return type is annotated");
	
		return 0;
	}
}

