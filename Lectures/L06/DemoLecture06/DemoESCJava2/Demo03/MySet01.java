public class MySet01 {
	
	int vS[];
	int nVS;
	

	
	
	
	

	MySet01(int capacity) {
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
