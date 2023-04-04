package quiz2;

import java.util.Scanner;

class Person {
	public String name;
	public String born_date;
	
	public Person(String name, String born_date) {
		this.name = name;
		this.born_date = born_date;
	}
	
	public void sleep() {
		System.out.println(name + " is fast asleep!");
	}
	
	public void displayP() {
		System.out.println("My name is "+ name + " and I was born on " + born_date);
	}
	
	public void pushinP() {
		sleep();
	}
}

class Mahasiswa extends Person{
	public String student_id; 
	public int point;
	
	public Mahasiswa(String name, String born_date, String student_id, int point) {
		super(name, born_date);
		this.student_id = student_id;
		this.point = point;
	}
	
	public void helpingDosen() {
		point += 10;
		System.out.println("I have helped out a dosen and gained 10 points.");
	}
	
	public void displayM() {
		super.displayP();
		System.out.println("My Student ID is " + student_id + " and I currently have " + point + " points.\n\n");
	}
	
	public void actionM() {
		super.sleep();
		helpingDosen();
	}
}

class Dosen extends Person{
	public String code_dosen;
	public int point;
	
	public Dosen(String name, String born_date, String code_dosen, int point) {
		super(name, born_date);
		this.code_dosen = code_dosen;
		this.point = point;
	}
	
	public void selfDev() {
		point += 10;
		System.out.println("I consider myself, self developed.");
	}
	
	public void teach() {
		point -= 3;
		System.out.println("I'm losing braincells teaching these kids fr2.");
	}
	
	public void p2m() {
		point += 5;
		System.out.println("Nothing like some good ol' P2M. Whatever that is.");
	}
	
	public void research() {
		point += 15;
		System.out.println("Research! Research! Research!");
	}
	
	public void otherWorks() {
		point += 7;
		System.out.println("The forgis is on the jeep.");
	}
	
	public void displayD() {
		super.displayP();
		System.out.println("My dosen code is " + code_dosen + " and I currently have " + point + " points.\n\n");
	}
	
	public void actionD() {
		super.sleep();
		selfDev();
		teach();
		p2m();
		research();
		otherWorks();
	}
}

public class Main {

	public static void main(String[] args) {
		
		Person p1 = new Person("Dave", "22nd of June 2003");
		Mahasiswa m1 = new Mahasiswa("Davey Jr.", "20th of April 2023", "2540103080", 0);
		Dosen d1 = new Dosen("David S the 3rd", "29th of February 2000", "DVES9", 100);
		
		Scanner sc = new Scanner(System.in);
		int select = 0;
		
		do {
			System.out.println("What will you do?");
			System.out.println("1. Person");
			System.out.println("2. Mahasiswa");
			System.out.println("3. Dosen");
			System.out.println("4. Exit");
			System.out.printf(">");
			select = sc.nextInt(); sc.nextLine();
			
			System.out.printf("\n\n");
			switch(select) {
			case 1:
				p1.displayP();
				p1.pushinP();
				select = 0;
				System.out.printf("\n\n\n\n");
				break;
				
			case 2:
				m1.displayM();
				m1.actionM();
				select = 0;
				System.out.printf("\n\n\n\n");
				break;
				
			case 3:
				d1.displayD();
				d1.actionD();
				select = 0;
				System.out.printf("\n\n\n\n");
				break;
				
			case 4:
				System.out.println("Bye!");
				break;
				
			default:
				System.out.println("Bruhh, pick again!");
				select = 0;
				System.out.printf("\n\n\n\n");
				break;
			}
			
		}while(select != 4);
	}

}
