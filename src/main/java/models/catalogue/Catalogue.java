package main.java.models.catalogue;

import java.util.Map;

import main.java.models.elements.Item;

public class Catalogue implements ModelCatalogue{

	//private Item[] productes;
	private Map<String, Item> productos;
	
	public Catalogue(Map<String, Item> productos) {
		this.productos=productos;
	}

	public Item getProducte(String codi) {
		return productos.get(codi);
	}
	
	public boolean afegirProducte (Item producte) {
		if(!productos.containsValue(producte)) {//si no lo contiene, anade
			productos.put(producte.getCodi(),producte);
			return true;
		}
		else return false;
	}
	
	public boolean eliminarProducte (String codi) {
		if(productos.containsKey(codi)) {//si lo contiene, elimina
			productos.remove(codi);
			return true;
		}
		else return false;
	}
	
	public boolean modificarPreuBrut (String codi, Double preu) {
		if(productos.containsKey(codi)) {//si lo contiene, modifica
			productos.get(codi).setPreu(preu);
			return true;
		}
		else return false;
	}
}
