package Calculadora;

public class DecBin_201212925 {
	
	public DecBin_201212925(){
		
	}
	
	public int DecABin(int Num) { 
		if (Num >= 2) { 
			return DecABin(Num/2)*10 + (Num%2); 
		} else { 
			return Num; 
		} 
	} 
}
