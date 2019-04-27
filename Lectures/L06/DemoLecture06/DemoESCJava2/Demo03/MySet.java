public class MySet {
	//@ non_null
	int vS[];
	int nVS;
	//@ invariant nVS >= 0;
	//@ invariant nVS <= vS.length;
	
   //@ requires capacity >= 0;
   
   	//@ ensures vS.length == capacity;
	//@ ensures nVS == 0;
	MySet(int capacity) {
		vS = new int[capacity];
		nVS = 0;
	}
	
	//@ requires nVS < vS.length;
	
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
	
//@ ensures \result == (\exists int j; 0 <= j && j < nVS && vS[j]==checkVal);
	boolean IsInTheSet(int checkVal) {
		for (int j = 0; j < nVS; ++j)
			if (vS[j] == checkVal) {
				return true;
			}
		return false;
	}
}
