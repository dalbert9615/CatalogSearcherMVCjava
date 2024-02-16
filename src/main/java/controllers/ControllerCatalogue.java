package main.java.controllers;

import java.awt.event.*;
import javax.swing.JOptionPane;

import main.java.database.DataLoaderTest;
import main.java.models.catalogue.ModelCatalogue;
import main.java.models.elements.Item;
import main.java.views.ViewCatalogue;

public class ControllerCatalogue {
	private ViewCatalogue vista;
	private ModelCatalogue modelo;

	public ControllerCatalogue(ViewCatalogue vista, ModelCatalogue modelo) {
		super();
		this.vista = vista;
		this.modelo = modelo;

		vista.addOyenteTeclaClear(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				teclaClearPulsada();
			}
		});

		vista.addOyenteTeclaBuscar(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				teclaBuscarPulsada();
			}
		});
	}

	protected void teclaClearPulsada() {
		this.vista.setDescription("Item");
		this.vista.setCodi("Codi");
		this.vista.setPreu("€");
		this.vista.setIva("%");
		this.vista.setPreuIva("€");
	}

	protected void teclaBuscarPulsada() {
		Item producto;
		producto = this.modelo.getProducte(this.vista.getCodi());
		if (producto == null) {
			JOptionPane.showMessageDialog(null, "Codi incorrecte", "Cuadro de dialogo", JOptionPane.ERROR_MESSAGE);
		} else {
			this.vista.setDescription(producto.getDescripcio());
			this.vista.setPreu(producto.getPreu() + "€");
			this.vista.setIva(Double.toString(producto.getIVA() * 100) + "%");
			this.vista.setPreuIva(Double.toString(producto.getPreuIva()) + "€");
		}
	}
}
