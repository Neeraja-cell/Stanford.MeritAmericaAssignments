package week2;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {

	int x = 0;
	int y = 1;
	public void run() {
		println("This program lists the Fibonacci sequence");
		while (x < 10000) {
			int z = x + y;
			System.out.println(x);
			x = y;
			y = z;
			
			
		}
	}
}
	
		
//		int term = 0;
//		int i = 0;
//		while(term < MAX_TERM_VALUE) {
//			term = fib(i);
//			if(term < MAX_TERM_VALUE) {
//				println(term);
//			}
//			i++;
//		}
//
	
//	private int fib(int n) {
////				Fib(0) = 0
////				Fib(1) = 1
////				Fib(2) = 1 (0 + 1)
////				Fib(3) = 2 (1 + 1)
////				Fib(4) = 3 (1 + 2)
////				Fib(5) = 5 (2 + 3)
//		if (n==0) {
//			return 0;
//			
//					
//		}
//		if(n==1) {
//			return 1;
//		}
//		if(n>1) {
//			
//			return fib(n-1) + fib(n-2);
//		}
//		return 0;
//	}

