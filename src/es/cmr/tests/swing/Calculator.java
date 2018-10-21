package es.cmr.tests.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame {

	private JTextField displayField;
	private JPanel windowContent;
	private JButton button0;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton buttonPoint;
	private JButton buttonEqual;
	private JButton buttonMult;
	private JButton buttonMinus;
	private JButton buttonSum;
	private JButton buttonDiv;
	private JPanel p1;
	boolean nuevaOperacion = false;
	byte operador;
	private double primerOperando;
	private double segundoOperando;
	private double resultado;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculator();

	}

	String getTextDisplayField() {
		return displayField.getText();
	}

	void setTextDisplayField(String displayField) {
		this.displayField.setText(displayField);
	}
	
	
	public Calculator() {
		// TODO Auto-generated constructor stub

		windowContent = new JPanel();

		// Set the layout manager for this panel
		BorderLayout bl = new BorderLayout();
		windowContent.setLayout(bl);

		// Create the display field and place it in the
		// North area of the window

		displayField = new JTextField();
		windowContent.add("North", displayField);

		// Create buttons using constructor of the
		// class JButton that takes the label of the
		// button as a parameter

		button0 = new JButton("0");
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		buttonPoint = new JButton(".");
		buttonEqual = new JButton("=");
		buttonSum = new JButton("+");
		buttonMinus = new JButton("-");
		buttonMult = new JButton("*");
		buttonDiv = new JButton("/");

		// Create the panel with the GridLayout with 12 buttons –
		// 10 numeric ones, period, and the equal sign

		p1 = new JPanel();
		GridLayout gl = new GridLayout(4, 4);
		p1.setLayout(gl);

		// Add window controls to the panel p1
		p1.add(button1);
		p1.add(button2);
		p1.add(button3);
		p1.add(buttonSum);
		p1.add(button4);
		p1.add(button5);
		p1.add(button6);
		p1.add(buttonMinus);
		p1.add(button7);
		p1.add(button8);
		p1.add(button9);
		p1.add(buttonMult);
		p1.add(button0);
		p1.add(buttonPoint);
		p1.add(buttonEqual);
		p1.add(buttonDiv);
		
		
		ActionListener cc = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String textoBoton = null;
				Object evento = e.getSource(); 
				if (evento instanceof JButton) {
					textoBoton = ((JButton) evento).getText();
					
					if (nuevaOperacion) {
						setTextDisplayField(null);
						nuevaOperacion=false;
					}
					
					switch(textoBoton) {
					case "+":
						primerOperando = Double.parseDouble(getTextDisplayField());
						operador =1;
						setTextDisplayField(null);
						break;

					case "-":
						primerOperando = Double.parseDouble(getTextDisplayField());
						operador =2;
						setTextDisplayField(null);
						break;

					case "*":
						primerOperando = Double.parseDouble(getTextDisplayField());
						operador =3;
						setTextDisplayField(null);
						break;

					case "/":
						primerOperando = Double.parseDouble(getTextDisplayField());
						operador =4;
						setTextDisplayField(null);
						break;

					case "=":
						if (!getTextDisplayField().equals("")) {
							segundoOperando = Double.parseDouble(getTextDisplayField());
							switch (operador) {
								case 1:
									resultado = primerOperando + segundoOperando;
									break;
								case 2:
									resultado = primerOperando - segundoOperando;
									break;
								case 3:
									resultado = primerOperando * segundoOperando;
									break;
								case 4:
									resultado = primerOperando / segundoOperando;
									break;
							}
							setTextDisplayField(resultado+"");
							nuevaOperacion = true;
						}

						break;
						
					default:
						setTextDisplayField(getTextDisplayField()+textoBoton);
						break;
					}
					
				}
				else if (evento instanceof JTextField) {
					
				}
	
			}
		};
			
				
		
		
		button0.addActionListener(cc);
		button1.addActionListener(cc);
		button2.addActionListener(cc);
		button3.addActionListener(cc);
		button4.addActionListener(cc);
		button5.addActionListener(cc);
		button6.addActionListener(cc);
		button7.addActionListener(cc);
		button8.addActionListener(cc);
		button9.addActionListener(cc);
		
		buttonSum.addActionListener(cc);
		buttonMinus.addActionListener(cc);
		buttonMult.addActionListener(cc);
		buttonDiv.addActionListener(cc);
		buttonPoint.addActionListener(cc);
		buttonEqual.addActionListener(cc);
		
		// Add the panel p1 to the center of the window
		windowContent.add("Center", p1);

	
		// Create the frame and set its content pane
		JFrame frame = new JFrame("Calculator");


		(frame.getWindows())[1].addWindowListener(new WindowAdapter() {
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(e.getWindow(), "Cerrando", "Mensaje",JOptionPane.INFORMATION_MESSAGE);
			}		
		});

		
		frame.setContentPane(windowContent);

		
		// Set the size of the window to be big enough to accommodate all controls
		frame.setSize(640, 480);

		// Display the window
		frame.pack();

		frame.setVisible(true);		
		

		
	}
	
}
