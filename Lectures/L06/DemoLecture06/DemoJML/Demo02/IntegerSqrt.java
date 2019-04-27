import java.io.*;

public class IntegerSqrt {
    
    /*@ public normal_behavior
      @   requires x >= 0;
      @   assignable \nothing; 
      @   ensures \result <= Math.sqrt(x) && Math.sqrt(x) < \result+1;
      @ also
      @ public exceptional_behavior
      @   requires x < 0;
      @   signals (IllegalArgumentException) true;
      @   assignable \nothing; 
      @   signals_only IllegalArgumentException;
      @*/
    public static int isqrt(int x) throws IllegalArgumentException {
	if (x < 0)
	    throw new IllegalArgumentException();
	int r = x;
	while ((long)r*r > x) {
	    r = (r + (x/r))/2;
	}
	return r;
    }

    public static void main(String[] args){
	    
	    try {
			int value = Integer.parseInt(args[0]);
			int result = isqrt(value); 
			System.out.println("Sqrt of "+ value+ " is: "+result);
	    } catch (NumberFormatException ex) {
			System.out.println("Invalid Number: "+ex);
	    }	
    }
}    
