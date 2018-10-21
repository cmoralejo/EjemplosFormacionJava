/**
 * @author Carlos Moralejo Romo
 */
package es.cmr.tests.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

class BycicleBuyerEngine implements ActionListener{
	private TryBycicleBuyer cb;
	private JOptionPane jop;
	private String modeloBici;
	private int cantidadBicis;
	
	BycicleBuyerEngine(TryBycicleBuyer cb) {
		this.cb=cb;
		jop = new JOptionPane();
	}

private void mostrarMensaje(String titulo, String texto) {
	
	jop.showConfirmDialog(this.cb,texto,titulo, JOptionPane.PLAIN_MESSAGE);
				
}
	
private void procesarPedido(int cantidadBicis,String modeloBici)	throws BuyNotAllowedModel2Exception,BuyNotAllowedModel3Exception {

	if ((cantidadBicis > 10) && modeloBici.contentEquals("Modelo 2")) {
		throw new BuyNotAllowedModel2Exception("ha intentado comprar más de 10 modelo 2");
	}
	else if ((cantidadBicis > 20) && modeloBici.contentEquals("Modelo 3")) {
		throw new BuyNotAllowedModel3Exception("ha intentado comprar más de 20 modelo 3");
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
	catch (BuyNotAllowedModel2Exception | BuyNotAllowedModel3Exception e) {
		if (e  instanceof BuyNotAllowedModel2Exception) {
			titulo = "Compra No Valida Modelo 2";
		} else if (e  instanceof BuyNotAllowedModel3Exception) {
			titulo = "Compra No Valida Modelo 3";
		}
			
		mensaje = e.getMessage();
		

	}
	
	mostrarMensaje(titulo,mensaje);		
	
	

	
	
	
	
}



}
