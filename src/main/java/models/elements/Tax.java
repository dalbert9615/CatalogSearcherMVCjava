package main.java.models.elements;

public abstract class Tax {

	public Tax() {
		super();
	}

	abstract public double getValor();
	abstract public void setValor(double valor);
	abstract public String toString();
}