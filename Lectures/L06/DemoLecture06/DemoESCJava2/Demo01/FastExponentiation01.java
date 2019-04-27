class FastExponentiation
{


   
	public static int  Exponentiation(int x,int y){
		int product = 1;
		int i=0;
		while(i<y)
		{
			product = product * x;	
			i = i+1;
		}
		
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
		
		//no error, x>0 not checked
	
	    
		int noZ = Exponentiation(noX,noY);
		System.out.println(noX+"^"+noY+"="+noZ);
	
	}
}