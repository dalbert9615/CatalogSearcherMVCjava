package main.java;

import java.util.HashMap;
import java.util.Map;
import javax.swing.SwingUtilities;
import main.java.controllers.ControllerCatalogue;
import main.java.database.DataLoaderMySQL;
import main.java.models.catalogue.*;
import main.java.models.elements.*;
import main.java.views.*;

public class Main {

	public static void main(String[] args) {

		Map<String, Item> items=new HashMap<String, Item>();
		/*more important
		 * load 'mysql-connector-j-8.3.0.jar' -> Referenced Libraries
		 * create db.properties with: DB_URL,USER,PASSWORD
		 * execute MySQL with 'database_items.sql'
		 */
		DataLoaderMySQL.cargarDatos(items);

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
