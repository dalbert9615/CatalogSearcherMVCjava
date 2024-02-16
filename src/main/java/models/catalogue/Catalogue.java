package main.java.models.catalogue;

import main.java.models.elements.Item;

public class Catalogue implements ModelCatalogue{

	private Item[] productes;
	
	public Catalogue(Item[] productes) {
		this.productes=productes;
	}

	public Item getProducte(String codi) {
		
		for(int i=0; i<productes.length;i++) {
			if(productes[i].getCodi().equals(codi)) {
				return productes[i];
			}
		}
		return null;
	}
}
