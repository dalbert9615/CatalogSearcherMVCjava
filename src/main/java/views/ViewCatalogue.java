package main.java.views;

import java.awt.event.ActionListener;

public interface ViewCatalogue {

	public void setCodi(String s);
	public String getCodi();
	
	public void setVisible(boolean v);
	
	public void addOyenteTeclaBuscar(ActionListener l);
	public void addOyenteTeclaClear(ActionListener l);
	
	public void setDescription(String s);
	public void setPreu(String s);
	public void setPreuIva(String s);
	public void setIva(String s);
}
