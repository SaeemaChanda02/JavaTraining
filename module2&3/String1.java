
public class String1 {
	 public int lengthOfLastWord(final String a)
	 {
	  int s = 0;

	  
	  String x = a.trim();

	  for (int i = 0; i < x.length(); i++) {
	   if (x.charAt(i) == ' ')
	    s = 0;
	   else
	    s++;
	  }

	  return s;
	 }

	 // Driver code
	 public static void main(String[] args)
	 {
	  String input = "Hello World ";
	  String1 hw = new String1();
	  System.out.println( + hw.lengthOfLastWord(input));
	 }
	}


