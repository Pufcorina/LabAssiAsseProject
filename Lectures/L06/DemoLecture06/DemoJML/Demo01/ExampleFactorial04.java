public class ExampleFactorial04 {
		/*@ requires 1 <= n;
			ensures \result == (\product int i; 1<=i && i<=n; i);
			@*/
		static int Factorial (int n) {
			int f = 1;
			int i = 1;
			//modificare 3) modificam la invariant (j<=i) in (j>i)
			               						
			//modificare 2) eliminam loop si modificare din (i<n) in (i<=n)
			//@ loop_invariant i<=n && f==(\product int j; 1<=j && j>i; j); 		
			while (i <= n) {       //modificare 1) din (i<n) in (i<=n) 
				i = i + 1;		   // ==> Exception in thread "main"
				f = f * i;         //       org.jmlspecs.jmlrac.runtime.JMLLoopInvariantError:
			}return f;
		}
		
		public static void main(String[] args) {
			int n = Integer.parseInt(args[0]);
			System.out.println("Factorial of " + n + " = " + Factorial(n));
}

}