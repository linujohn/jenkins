import java.io.IOException; 
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
  
        // Call warning method 
        logger.warning("Set WARNING = ERRORS"); 
    } 
} 
