
public class String2 {

	public int LengthOfLastWord(final String m) {
		
		int s = 0;
		
		String n = m.trim();
		for(int i=0; i < n.length(); i++) {
		if (n.charAt(i) == ' ')
			s = 0;
		else 
			s++;
		}
		return s;
	}
		public static void main(String[] args) {
			 String input = "  fly me  to  the moon ";
			  String1 s1 = new String1();
			  System.out.println( + s1.lengthOfLastWord(input));
			
		}

	}


