//Java program to change Collection to an array

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class ListtoArray {

 // Main driver method
 public static void main(String[] args)
 {

 List<String> l = new ArrayList<String>();           // created list
 
  l.add("I ");
  l.add("love ");
  l.add("to ");
  l.add("Code ");
  
  String[] str = l.toArray(new String[0]);

  //Iterating over elements of array
  for (int i = 0; i < str.length; i++) {
   String data = str[i];
   System.out.print(data);
  }
 }
}


