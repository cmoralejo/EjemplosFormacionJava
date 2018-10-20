package es.cmr.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CompradorBicis extends JFrame {

	private JPanel contenidoVentana;
	private JComboBox modelo;
	private JTextField cantidad;
	private JLabel texto;
	private JButton aceptar;
	private ActionListener listenerVentana;
	
	public static void main(String[] args) {
		new CompradorBicis();
	}

	JComboBox getModelo() {
		return modelo;
	}

	JTextField getCantidad() {
		return cantidad;
	}

	private void crearVentanaApp(int anchura, int altura) {
		// Set the size of the window to be big enough to accommodate all controls
		this.setSize(anchura, altura);

		// Display the window
		this.pack();

		this.setVisible(true);		
		
	}
	
	private JPanel crearContenidoVentana () {
		contenidoVentana = new JPanel(new GridLayout(2, 2));
		
		modelo = new JComboBox();
		modelo.addItem("Modelo 1");
		modelo.addItem("Modelo 2");
		modelo.addItem("Modelo 3");
		modelo.addItem("Modelo 4");		
		contenidoVentana.add(modelo);
		
		cantidad = new JTextField();
		contenidoVentana.add(cantidad);
		
		texto = new JLabel("Introduzca modelo y cantidad");
		contenidoVentana.add(texto);
						
		aceptar = new JButton("Aceptar");
		contenidoVentana.add(aceptar);
				
		return(contenidoVentana);
	}
	
	private void crearComportamientoVentana() {
		listenerVentana = new CompradorBicisEngine(this);
		aceptar.addActionListener(listenerVentana);
	}
	
	public CompradorBicis() {
				
		
		this.setContentPane(crearContenidoVentana());
		this.crearComportamientoVentana();
		this.crearVentanaApp(640, 480);
	}
	
}
