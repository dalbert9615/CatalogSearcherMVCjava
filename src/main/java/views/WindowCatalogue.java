package main.java.views;

import java.awt.event.ActionListener;
import javax.swing.*;

public class WindowCatalogue extends JFrame implements ViewCatalogue {
	private JTextField codiCaja, descriptionBox, preuCaja, preuIvaCaja, ivaCaja;
	private JButton buscar, clear;

	public WindowCatalogue() {
		super();
		this.init();
	}

	private void init() {
		this.setTitle("CSoI");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocation(0, 0);
		this.setResizable(false);
		this.setIconImage(new ImageIcon("src/main/resources/images/icon.png").getImage());

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.setBorder(BorderFactory.createEmptyBorder(14, 14, 14, 14));

		PanelFactory.CodiPanel codiPanel = PanelFactory.crearPanelCodi();
		PanelFactory.DatosPanel datosPanel = PanelFactory.crearPanelDatos();

		panel.add(codiPanel.panel);
		panel.add(datosPanel.panel);

		this.codiCaja = codiPanel.codiCaja;
		this.buscar = codiPanel.buscar;
		this.clear = codiPanel.clear;
		this.descriptionBox = datosPanel.descriptionBox;
		this.preuCaja = datosPanel.preuCaja;
		this.preuIvaCaja = datosPanel.preuIvaCaja;
		this.ivaCaja = datosPanel.ivaCaja;

		this.setContentPane(panel);
		this.pack();
	}

	@Override
	public void setCodi(String s) {
		this.codiCaja.setText(s);
	}

	@Override
	public String getCodi() {
		return this.codiCaja.getText();
	}

	@Override
	public void addOyenteTeclaBuscar(ActionListener l) {
		this.buscar.addActionListener(l);
	}

	@Override
	public void addOyenteTeclaClear(ActionListener l) {
		this.clear.addActionListener(l);
	}

	@Override
	public void setDescription(String s) {
		this.descriptionBox.setText(s);
	}

	@Override
	public void setPreu(String s) {
		this.preuCaja.setText(s);
	}

	@Override
	public void setPreuIva(String s) {
		this.preuIvaCaja.setText(s);
	}

	@Override
	public void setIva(String s) {
		this.ivaCaja.setText(s);
	}
}
