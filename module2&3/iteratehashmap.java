// Java Program to Iterate over HashMap
// Using Iterator

// Importing classes from java.util package
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class iteratehashmap {

 // Main method
 public static void main(String[] arguments)
 {
  
  Map<Integer, String> intType
   = new HashMap<Integer, String>();

  
  intType.put(1, "Pizza");
  intType.put(2, "Panipuri");
  intType.put(3, "Samosa");
  intType.put(4, "Franky");

  Iterator<Entry<Integer, String> > new_Iterator
   = intType.entrySet().iterator();

  // Iterating every set of entry in the HashMap
  while (new_Iterator.hasNext()) {
   Map.Entry<Integer, String> new_Map
    = (Map.Entry<Integer, String>)
     new_Iterator.next();

   System.out.println(new_Map.getKey() + " = "
       + new_Map.getValue());
  }
 }
}


