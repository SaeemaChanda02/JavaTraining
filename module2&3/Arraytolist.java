import java.util.*;   
public class Arraytolist 
{   
public static void main(String args[])   
{   
 
String arr[] = { "Saeema", "Majid", "Janvi", "Smit", "Priya", "Manav", "Amaan", "Faisal", "Janki", "Janki"};   

System.out.println("Array before conversion: "+ Arrays.toString(arr));   
 
List<String> list = ArrayToListConversion(arr);   
   
System.out.println("Array as List: " + list);   
}       

public static <T> List<T> ArrayToListConversion(T arr[])   
{   
  
List<T> list = new ArrayList<>();   
//using for-each loop to iterate over the array  
for (T t : arr)   
{   
//adding each element to the List  
list.add(t);   
}   
//returns the list converted into Array  
return list;   
}   
}  

