package es.cmr.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

class CompradorBicisEngine implements ActionListener{
	private CompradorBicis cb;
	private JOptionPane jop;
	private String modeloBici;
	private int cantidadBicis;
	
	CompradorBicisEngine(CompradorBicis cb) {
		this.cb=cb;
		jop = new JOptionPane();
	}

private void mostrarMensaje(String titulo, String texto) {
	
	jop.showConfirmDialog(this.cb,texto,titulo, JOptionPane.PLAIN_MESSAGE);
				
}
	
private void procesarPedido(int cantidadBicis,String modeloBici)	throws CompraNovalidaModelo2Exception,CompraNovalidaModelo3Exception {

	if ((cantidadBicis > 10) && modeloBici.contentEquals("Modelo 2")) {
		throw new CompraNovalidaModelo2Exception("ha intentado comprar más de 10 modelo 2");
	}
	else if ((cantidadBicis > 20) && modeloBici.contentEquals("Modelo 3")) {
		throw new CompraNovalidaModelo3Exception("ha intentado comprar más de 20 modelo 3");
	}

}
	
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	String mensaje;
	String titulo;
	
	modeloBici = cb.getModelo().getSelectedItem().toString();
	
	if (!cb.getCantidad().getText().isEmpty())
	{
		cantidadBicis = Integer.parseInt(cb.getCantidad().getText());
		mensaje = "Modelo bici: " + modeloBici + " , Cantidad: " + cantidadBicis;
		titulo = "Compra hecha";
	}
	else
	{
		mensaje = "Introduzca una cantidad";
		titulo = "Error";
	}
	
	try {
		procesarPedido(cantidadBicis,modeloBici);	
	}
	catch (CompraNovalidaModelo2Exception | CompraNovalidaModelo3Exception e) {
		if (e  instanceof CompraNovalidaModelo2Exception) {
			titulo = "Compra No Valida Modelo 2";
		} else if (e  instanceof CompraNovalidaModelo3Exception) {
			titulo = "Compra No Valida Modelo 3";
		}
			
		mensaje = e.getMessage();
		

	}
	
	mostrarMensaje(titulo,mensaje);		
	
	

	
	
	
	
}



}
