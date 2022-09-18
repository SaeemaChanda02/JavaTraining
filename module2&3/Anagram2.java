import java.util.Arrays;

public class Anagram2 {
	
	public static void main(String[] args) {
		String s = "rat";
		String t = "car";
		
		if(s.length()==t.length()) {
			char[] charArray1 = s.toCharArray();
			char[] charArray2 = t.toCharArray();
			
			 Arrays.sort(charArray1);
		      Arrays.sort(charArray2);

		     
		      boolean result = Arrays.equals(charArray1, charArray2);

		      if(result) {
		        System.out.println("True");
		      }
		      else {
		        System.out.println("false");
		      }
		    }
		    else {
		      System.out.println("false");
		    }
		}
	}


