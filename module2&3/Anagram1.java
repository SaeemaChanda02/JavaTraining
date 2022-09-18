import java.util.Arrays;

class Anagram1 {
  public static void main(String[] args) {
    String str1 = "anagram";
    String str2 = "nagaram";
    
   // str1 = str1.toLowerCase();
  //  str2 = str2.toLowerCase();

    // check if length is same
    if(str1.length() == str2.length()) {

      // convert strings to char array
      char[] charArray1 = str1.toCharArray();
      char[] charArray2 = str2.toCharArray();

      // sort the char array
      Arrays.sort(charArray1);
      Arrays.sort(charArray2);

      // if sorted char arrays are same
      // then the string is anagram
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
