class MyArray {
	//to eliminate the third warning we add the pragma non_null, 
	   // to specify that the -vA- field of any MyArray is always supposed to be non-null
  
/*@ non_null */ int[] vA; //values in array
  int nVA; //number of elements in the array

 
 
  //to eliminate the second warning we add the precondition  
  
//@ requires input != null;  
  MyArray(int[] input) {
    nVA = input.length;
    vA = new int[nVA];
    System.arraycopy(input, 0, vA, 0, nVA);
  }

 
 
  int GetMinValueInArray() {
    int minVal = Integer.MAX_VALUE;
    int minIndex = 0;
    //to eliminate the fourth warning we modify the values for the -i- variable
    //@ loop_invariant (\forall int j; 0 <= j & j < i;minVal <= vA[j]);
    for (int i = 0; i < nVA; i++) {
      if (vA[i] < minVal) {
        minIndex = i;
        minVal = vA[i];
      }
    }   
    return minVal;
  }
}
