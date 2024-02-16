package main.java.views;

import javax.swing.*;

public class PanelFactory {
    public static class CodiPanel {
        protected JPanel panel;
        protected JTextField codiCaja;
        protected JButton buscar;
        protected JButton clear;
    }

    public static class DatosPanel {
        protected JPanel panel;
        protected JTextField descriptionBox;
        protected JTextField preuCaja;
        protected JTextField preuIvaCaja;
        protected JTextField ivaCaja;
    }

    public static CodiPanel crearPanelCodi() {
        CodiPanel codiPanel = new CodiPanel();
        codiPanel.panel = new JPanel();
        codiPanel.panel.setLayout(new BoxLayout(codiPanel.panel, BoxLayout.Y_AXIS));
        codiPanel.panel.setBorder(BorderFactory.createEmptyBorder(14, 14, 14, 14));
        codiPanel.panel.setBorder(BorderFactory.createTitledBorder("Enter ID"));

        codiPanel.codiCaja = new JTextField("Id", 10);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(4, 14, 4, 14));
        panel.add(new JLabel("Id"));
        panel.add(Box.createHorizontalStrut(11));
        panel.add(codiPanel.codiCaja);
        codiPanel.panel.add(panel);

        codiPanel.buscar = new JButton("SEARCH");
        codiPanel.clear = new JButton("CLEAR");
        JPanel botonesPanel = new JPanel();
        botonesPanel.setLayout(new BoxLayout(botonesPanel, BoxLayout.X_AXIS));
        botonesPanel.setBorder(BorderFactory.createEmptyBorder(4, 14, 4, 14));
        botonesPanel.add(codiPanel.buscar);
        botonesPanel.add(Box.createHorizontalStrut(5));
        botonesPanel.add(codiPanel.clear);
        codiPanel.panel.add(botonesPanel);

        return codiPanel;
    }

    public static DatosPanel crearPanelDatos() {
        DatosPanel datosPanel = new DatosPanel();
        datosPanel.panel = new JPanel();
        datosPanel.panel.setLayout(new BoxLayout(datosPanel.panel, BoxLayout.Y_AXIS));
        datosPanel.panel.setBorder(BorderFactory.createEmptyBorder(14, 14, 14, 14));
        datosPanel.panel.setBorder(BorderFactory.createTitledBorder("Info Id"));

        datosPanel.descriptionBox = new JTextField("Item");
        datosPanel.preuCaja = new JTextField("€");
        datosPanel.preuIvaCaja = new JTextField("€");
        datosPanel.ivaCaja = new JTextField("%");

        JPanel descriptionBox = new JPanel();
        descriptionBox.setLayout(new BoxLayout(descriptionBox, BoxLayout.X_AXIS));
        descriptionBox.setBorder(BorderFactory.createEmptyBorder(4, 14, 4, 14));
        descriptionBox.add(new JLabel("Item"));
        descriptionBox.add(Box.createHorizontalStrut(34));
        descriptionBox.add(datosPanel.descriptionBox);
        datosPanel.panel.add(descriptionBox);

        JPanel preuPanel = new JPanel();
        preuPanel.setLayout(new BoxLayout(preuPanel, BoxLayout.X_AXIS));
        preuPanel.setBorder(BorderFactory.createEmptyBorder(4, 14, 4, 14));
        preuPanel.add(new JLabel("PVP"));
        preuPanel.add(Box.createHorizontalStrut(34));
        preuPanel.add(datosPanel.preuCaja);
        datosPanel.panel.add(preuPanel);

        JPanel preuivaPanel = new JPanel();
        preuivaPanel.setLayout(new BoxLayout(preuivaPanel, BoxLayout.X_AXIS));
        preuivaPanel.setBorder(BorderFactory.createEmptyBorder(4, 14, 4, 14));
        preuivaPanel.add(new JLabel("PVP+IVA"));
        preuivaPanel.add(Box.createHorizontalStrut(8));
        preuivaPanel.add(datosPanel.preuIvaCaja);
        datosPanel.panel.add(preuivaPanel);

        JPanel ivaPanel = new JPanel();
        ivaPanel.setLayout(new BoxLayout(ivaPanel, BoxLayout.X_AXIS));
        ivaPanel.setBorder(BorderFactory.createEmptyBorder(4, 14, 4, 14));
        ivaPanel.add(new JLabel("IVA"));
        ivaPanel.add(Box.createHorizontalStrut(39));
        ivaPanel.add(datosPanel.ivaCaja);
        datosPanel.panel.add(ivaPanel);

        return datosPanel;
    }
}
