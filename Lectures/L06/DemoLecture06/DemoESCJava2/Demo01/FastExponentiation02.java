class FastExponentiation
{


    //@ requires x>0 && y>=0;
	public static int  Exponentiation(int x,int y){
		int product = 1;
		int i=0;
		while(i<y)
		{
			product = product * x;	
			i = i+1;
		}
		product =-5;
		
		return product;			
	}
	public static void main(String args[])
	{
		int noX,noY;
		//First test
		//noX=2;noY=3;
		
		//Second test
		//noX=2;noY=0;
		
		//Third test
		noX=0;noY=2;
		//FastExponentiation02.java:30: Warning: Precondition possibly not established (Pre)
        //        int noZ = Exponentiation(noX,noY);
	    // Associated declaration is "FastExponentiation02.java", line 5, col 8:
    	//			//@ requires x>0 && y>=0;

	
	    
		int noZ = Exponentiation(noX,noY);
		System.out.println(noX+"^"+noY+"="+noZ);
	
	}
}