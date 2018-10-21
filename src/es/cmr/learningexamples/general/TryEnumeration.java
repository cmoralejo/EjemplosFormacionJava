package es.cmr.learningexamples.general;

public class TryEnumeration {

	enum DayWeek {Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday}
	
	public static void main (String args[]) {
		
		DayWeek day = DayWeek.Tuesday;
		
		System.out.println(day);
		
		System.out.println(day.equals(DayWeek.Monday)?"Monday":"Other day");
	}
}
