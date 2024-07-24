package day1.encapsulation.scanner;

import java.util.Scanner;

public class PersonTex {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter a Name here :");
	  String name = sc.next();
	  
	  System.out.println("Enter a Gender here :");
	  String gender = sc.next();
	  
	  System.out.println("Enter a age here :");
	  int age = sc.nextInt();
	  
	  System.out.println("Enter a income here :");
	  int income = sc.nextInt();
	  
	  Person p1 = new Person(name, gender, income, age, income);
	 TaxCalc tx1 = new TaxCalc();
      tx1.calculate(p1);
      System.out.println("Payable tax : "+p1.getTax());
      System.out.println(p1);
	}

}
