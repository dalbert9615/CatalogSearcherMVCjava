package main.java.models.elements;

public class TaxGeneral extends Tax{

	private static double valor=0.21;
	
	public TaxGeneral() {
		super();
	}

	@Override
	public double getValor() {
		return TaxGeneral.valor;
	}
	
	@Override
	public void setValor(double valor) {
		TaxGeneral.valor=valor;
	}

	@Override
	public String toString() {
		return 
				"IVA: "+TaxGeneral.valor*100+"%"+"\n";
	}
}
