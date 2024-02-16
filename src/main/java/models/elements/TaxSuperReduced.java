package main.java.models.elements;

public class TaxSuperReduced extends Tax{

private static double valor=0.04;
	
	public TaxSuperReduced() {
		super();
	}

	public double getValor() {
		return TaxSuperReduced.valor;
	}
	
	public void setValor(double valor) {
		TaxSuperReduced.valor=valor;
	}

	public String toString() {
		return 
				"IVA: "+TaxSuperReduced.valor*100+"%"+"\n";
	}

}
