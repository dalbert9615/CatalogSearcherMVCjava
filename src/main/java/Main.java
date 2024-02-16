package main.java;

import javax.swing.SwingUtilities;
import main.java.controllers.ControllerCatalogue;
import main.java.database.DataLoaderTest;
import main.java.models.catalogue.*;
import main.java.models.elements.*;
import main.java.views.*;

public class Main {

	public static void main(String[] args) {

		Item[] items = new Item[10];
		Tax[] taxes = new Tax[10];
		DataLoaderTest.loadDataFromFile("src/main/resources/dataTest/data.csv", items, taxes);

		WindowCatalogue catalogue = new WindowCatalogue();
		ViewCatalogue view = new WindowCatalogue();
		ModelCatalogue model = new Catalogue(items);
		ControllerCatalogue controller = new ControllerCatalogue(view, model);

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				view.setVisible(true);
			}
		});
	}
}
