package classes_methods_attributes.student_note.entities;

public class Student {
	
	public String name;
	public double note1;
	public double note2;
	public double note3;
	public double average;
	
	
	public double result() {
		return note1 + note2 + note3;
	}
	
	public String passedOrNot() {
		
		if (note1 <= 30 && note2 <= 35 && note3 <= 35) {
			if (result() >= 60) {
				return "Passou!\nNota: "+result();
			} else {
				return "Não passou :( "
						+ "\nFaltou: "+(60 - result())+" pts"
								+ "\nNota: "+result();
			}
		} else {
			return "Notas inválidas";
		}
	}
	
}


