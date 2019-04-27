public class MySet06 {
	//@ non_null   //to eliminate warning 1 and warning 4
	int vS[];
	int nVS;
	//@ invariant nVS >= 0;
	//@ invariant nVS <= vS.length;
	
    //@ requires capacity >= 0;   //to eliminate the first warning
     
   	//@ ensures vS.length == capacity;
	//@ ensures nVS == 0;
	MySet06(int capacity) {
		vS = new int[capacity];
		nVS = 0;
	}
	//@ requires nVS < vS.length;  //to eliminate the first warning and the second warning
		
	//@ ensures \result == (nVS == \old(nVS+1));
	//@ ensures !\result == (nVS == \old(nVS));
	//@ ensures (\forall int j; (0 <= j && j < \old(nVS)) ==> vS[j] == \old(vS[j]));
	//@ ensures IsInTheSet(newVal);
	boolean AddAValue(int newVal) {
		if (IsInTheSet(newVal))
			return false;
		vS[nVS++]=newVal;
		return true;
	}
	
	
	
	//A pure function does not change the state of the object.
   //@ ensures \result == (\exists int j; 0 <= j && j < nVS && vS[j]==checkVal);
	public /*@ pure */ boolean IsInTheSet(int checkVal) {
		for (int j = 0; j < nVS; ++j)
			if (vS[j] == checkVal) {
				return true;
			}
		return false;
	}
}
