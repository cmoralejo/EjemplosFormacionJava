package es.cmr.enums;

public class TryEnumeration {

	enum DiaSemana {Lunes,Martes,Mi�rcoles,Jueves,Viernes,S�bado,Domingo}
	
	public static void main (String args[]) {
		
		DiaSemana dia = DiaSemana.Martes;
		
		System.out.println(dia);
		
		System.out.println(dia.equals(DiaSemana.Lunes)?"Lunes":"Otro");
	}
}
