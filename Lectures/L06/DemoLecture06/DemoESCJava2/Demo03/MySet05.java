public class MySet05 {
	//@ non_null   //to eliminate warning 1 and warning 4
	int vS[];
	int nVS;
	//@ invariant nVS >= 0;    //to eliminate warning 1
	//@ invariant nVS <= vS.length;
	
   
   
   
   //@ requires capacity >= 0; //to eliminate the first warning
	MySet05(int capacity) {
		vS = new int[capacity];
		nVS = 0;
	}
	




	//@ requires nVS < vS.length; //to eliminate the first warning and the second warning
	boolean AddAValue(int newVal) {
		if (IsInTheSet(newVal))
			return false;
		vS[nVS++]=newVal;
		return true;
	}
	
	
	
	
	
	boolean IsInTheSet(int checkVal) {
		for (int j = 0; j < nVS; ++j)
			if (vS[j] == checkVal) {
				return true;
			}
		return false;
	}
}
