package Calculadora;

public class Factorial_201212925 {
	
	String stamFactorial;
	float tamFactorial;

	public Factorial_201212925(){
	}
	
	//-----------Forma Recursiva
	
	public int Recursivo(int tamFactorial){
		if(tamFactorial < 0){
			return 0;
		}
		if(tamFactorial <= 0){
			return 1;
		}else{
			return tamFactorial * Recursivo(tamFactorial - 1);
		}
	}
	
}
