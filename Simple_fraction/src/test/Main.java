package test;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("ça marche:");
		int un=1;
		int deux=2;
		Fraction frac=new Fraction(un,deux);
		String affiche= frac.Affichage();
		System.out.println(affiche);
	
	}
	
	}


