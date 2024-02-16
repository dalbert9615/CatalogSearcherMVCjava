package main.java.models.elements;

public class TaxGeneral extends Tax{

	private static double valor=0.21;
	
	public TaxGeneral() {
		super();
	}

	public double getValor() {
		return TaxGeneral.valor;
	}
	
	public void setValor(double valor) {
		TaxGeneral.valor=valor;
	}

	public String toString() {
		return 
				"IVA: "+TaxGeneral.valor*100+"%"+"\n";
	}
}
