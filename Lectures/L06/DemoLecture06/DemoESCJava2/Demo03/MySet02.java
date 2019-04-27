public class MySet02 {
	
	int vS[];
	int nVS;
	
   
   
   
   
   
   //@ requires capacity >= 0;   //to eliminate the first warning
	MySet02(int capacity) {
		vS = new int[capacity];
		nVS = 0;
	}






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
