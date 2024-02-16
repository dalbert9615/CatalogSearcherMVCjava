package main.java.database;

import java.sql.*;
import java.util.Map;
import main.java.models.elements.*;
import java.io.*;
import java.util.Properties;

public class DataLoaderMySQL {

    private static final String PROPERTIES_FILE = "src/main/resources/config/db.properties";

    public static void cargarDatos(Map<String, Item> productos) {
        Properties props = new Properties();
        try (FileInputStream fis = new FileInputStream(PROPERTIES_FILE)) {
            props.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String dbUrl = props.getProperty("DB_URL");
        String user = props.getProperty("USER");
        String password = props.getProperty("PASSWORD");

        try (Connection connection = DriverManager.getConnection(dbUrl,user,password)) {
            String sql = "SELECT codigo, descripcion, precio, tipo_impuesto FROM productos";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    String codigo = resultSet.getString("codigo");
                    String descripcion = resultSet.getString("descripcion");
                    double precio = resultSet.getDouble("precio");
                    String tipo_impuesto = resultSet.getString("tipo_impuesto");

                    // Convertir el tipo de impuesto a un objeto Tax
                    Tax tax;
                    switch (tipo_impuesto) {
                        case "general":
                            tax = new TaxGeneral();
                            break;
                        case "reduced":
                            tax = new TaxReduced();
                            break;
                        case "super_reduced":
                            tax = new TaxSuperReduced();
                            break;
                        default:
                            throw new IllegalArgumentException("Tipo de impuesto desconocido: " + tipo_impuesto);
                    }

                    // Crear un nuevo Item y agregarlo al mapa
                    Item item = new Item(codigo, descripcion, precio, tax);
                    productos.put(codigo, item);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
