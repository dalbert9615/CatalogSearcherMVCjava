package main.java.models.elements;

public class TaxSuperReduced extends Tax{

private static double valor=0.04;
	
	public TaxSuperReduced() {
		super();
	}

	@Override
	public double getValor() {
		return TaxSuperReduced.valor;
	}
	
	@Override
	public void setValor(double valor) {
		TaxSuperReduced.valor=valor;
	}

	@Override
	public String toString() {
		return 
				"IVA: "+TaxSuperReduced.valor*100+"%"+"\n";
	}

}
