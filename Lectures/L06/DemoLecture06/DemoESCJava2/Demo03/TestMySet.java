class TestMySet {
	
    void testConstructor() {
		MySet s = new MySet(2);
		//@ assert !s.IsInTheSet(5);
    }
    
    void testAdd() {
		MySet s = new MySet(2);
		s.AddAValue(5);
		//@ assert !s.IsInTheSet(4);
		//@ assert s.IsInTheSet(5);
		s.AddAValue(4);
		//@ assert s.IsInTheSet(4);
		s.AddAValue(4);
    }
    
}
