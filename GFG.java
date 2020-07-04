import java.io.IOException; 
import java.util.function.Supplier; 
import java.util.logging.*; 
  
public class GFG { 
  
    public static void main(String[] args) 
       
    { 
      
  uncheckedGenerics();
      
    } 
  void uncheckedGenerics() {
    List words = new ArrayList();
 
    words.add("hello"); // this causes unchecked warning
}
} 
