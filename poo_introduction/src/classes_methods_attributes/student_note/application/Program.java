package classes_methods_attributes.student_note.application;

import java.util.Scanner;

import classes_methods_attributes.student_note.entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student studant = new Student();
		
		System.out.println("Nome do Aluno: ");
		studant.name = sc.next();
		System.out.println("Nota 1: ");
		studant.note1 = sc.nextDouble();
		System.out.println("Nota 2: ");
		studant.note2 = sc.nextDouble();
		System.out.println("Nota 3: ");
		studant.note3 = sc.nextDouble();
		
		System.out.println(studant.passedOrNot());
		
		
		sc.close();
	}

}
