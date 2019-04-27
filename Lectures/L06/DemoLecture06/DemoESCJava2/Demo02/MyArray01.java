class MyArray {
	
	
  
int[] vA; //values in array
  int nVA;
 //number of elements in the array

  
  
  
  
 
 MyArray(int[] input) {
   
 nVA = input.length;
   
 vA = new int[nVA];
   
 System.arraycopy(input, 0, vA, 0, nVA);
  }

 
 
 
 int GetMinValueInArray() {
  
  int minVal = Integer.MAX_VALUE;
    
int minIndex = 0;
    
 
   //@ loop_invariant (\forall int j; 0 <= j & j < i;minVal <= vA[j]); 
    for (int i = 1; i <= nVA; i++) {
      if (vA[i] < minVal) {
        minIndex = i;
        minVal = vA[i];
      }
    }
    return minVal;
  }
}
