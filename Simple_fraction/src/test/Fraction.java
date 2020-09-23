package test;

public class Fraction {
	public int H;
	public int B;
	
	Fraction(int un, int deux){
		this.H= un; 
		this.B=deux; 
	}
	public String Affichage() {
		return Integer.toString(this.H)+"/"+Integer.toString(this.B);
	}


}


#SimpleFraction
