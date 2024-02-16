package main.java.database;

import java.io.*;
import main.java.models.elements.*;

public class DataLoaderTest {
    public static void loadDataFromFile(String fileName, Item[] items, Tax[] taxes) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int index = 0;
            boolean firstLine = true;
            while ((line = br.readLine()) != null && index < items.length) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String codigo = parts[0];
                    String descripcion = parts[1];
                    double precio = Double.parseDouble(parts[2]);
                    String tipoImpuesto = parts[3];

                    Tax tax;
                    switch (tipoImpuesto) {
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
                            throw new IllegalArgumentException("Tipo de impuesto desconocido: " + tipoImpuesto);
                    }

                    items[index] = new Item(codigo, descripcion, precio, tax);
                    taxes[index] = tax;
                    index++;
                } else {
                    System.err.println("Error en el formato de la línea: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
