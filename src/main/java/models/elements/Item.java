package main.java.models.elements;

public class Item {
	private String codi;
	private String descripcio;
	private double preu;
	private Tax valorIva;

	public Item(String codi, String descripcio, double preu, Tax valorIva) {
		super();
		this.setCodi(codi);
		this.setDescripcio(descripcio);
		this.setPreu(preu);
		this.valorIva = valorIva;
	}

	public Item() {
	}

	public String getCodi() {
		return codi;
	}

	public void setCodi(String codi) {
		this.codi = codi;
	}

	public String getDescripcio() {
		return descripcio;
	}

	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}

	public double getPreu() {
		return preu;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}


	public double getPreuIva() {
		return preu + preu * this.getIVA();
	}

	public double getIVA() {
		return this.valorIva.getValor();
	}

	public void setIVA(double valor) {
		this.valorIva.setValor(valor);
	}

}
