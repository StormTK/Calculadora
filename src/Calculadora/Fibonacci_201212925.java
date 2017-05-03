package Calculadora;

public class Fibonacci_201212925 {
	
	int numfibonacci;
	
	public Fibonacci_201212925(){

	}
	
	public int ResolverFibo(int numfibonacci){ 
		if ((numfibonacci == 0)){ 
			return 0;
		}
		if ((numfibonacci == 2) || (numfibonacci == 1)){ 
			return 1;
		}else{
			return ResolverFibo(numfibonacci - 1) + ResolverFibo(numfibonacci - 2);
		}
	} 
	
}