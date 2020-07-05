import java.util.*;
public class RawType{ 
	
	public static void main(String args[])
	{
		
		
		List words= new ArrayList(); 
		
		@SuppressWarnings({"rawtypes","unchecked"})
		words.add("hello");
		words.add("helloworld");

		
	}
 }
