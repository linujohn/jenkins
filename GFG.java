import java.io.IOException; 
import java.util.function.Supplier; 
import java.util.logging.*; 
  
public class GFG { 
  
    public static void main(String[] args) 
        throws SecurityException, IOException 
    { 
  
        // Create a Logger 
        Logger logger 
            = Logger.getLogger( 
                GFG.class.getName()); 
  
        // Set Logger level() 
        logger.setLevel(Level.WARNING); 
  
        // Create a supplier<String> method 
        Supplier<String> StrSupplier 
            = () -> new String("WARNING WARNING WARNING"); 
  
        // Call warning(Supplier<String>) 
        logger.warning(StrSupplier); 
    } 
} 
