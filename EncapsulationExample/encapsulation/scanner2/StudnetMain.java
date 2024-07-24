package day1.encapsulation.scanner2;

import java.util.Scanner;

public class StudnetMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name here :");
		String name = sc.next();
		
		System.out.println("Enter name Gender :");
		String gender = sc.next();
		
		
		System.out.println("Enter ID here :");
		int id = sc.nextInt();
		
		System.out.println("Enter Age here :");
		int age = sc.nextInt();
		
		System.out.println("Enter CGPA here :");
		double cgpa = sc.nextDouble();
		
		Student s1 = new Student(name, gender, id, age, cgpa);
		EligibleforPlacement p1 = new EligibleforPlacement();
		p1.eligible(s1);
		
		System.out.println(s1);
		
	}

}
