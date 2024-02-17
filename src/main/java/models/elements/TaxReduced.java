package main.java.models.elements;

public class TaxReduced extends Tax{

private static double valor=0.10;
	
	public TaxReduced() {
		super();
	}

	@Override
	public double getValor() {
		return TaxReduced.valor;
	}
	
	@Override
	public void setValor(double valor) {
		TaxReduced.valor=valor;
	}

	@Override
	public String toString() {
		return 
				"IVA: "+TaxReduced.valor*100+"%"+"\n";
	}

}
