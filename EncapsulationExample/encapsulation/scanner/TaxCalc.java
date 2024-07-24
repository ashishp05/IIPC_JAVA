package day1.encapsulation.scanner;

public class TaxCalc {
	
 public void calculate(Person p)
 {
	 if(p.getAge() >= 65 || p.getGender().equalsIgnoreCase("female") )
	 {
		 p.setTax(0);
		 System.out.println("this person is tex free.");
	 }
	 else
	 {
		 if(p.getIncome()<=160000)
		 {
			 p.setTax(0);
			 System.out.println("this person is tex free.");
		 }
		 else if(p.getIncome() < 160000 && p.getIncome() >500000)
		 {
			 p.setTax((p.getIncome()-160000 )*10/100);
			 System.out.println("this person pays text 10%.");
		 }
		 else if(p.getIncome()>=500000 && p.getIncome()<800000)
		 {
			 p.setTax((p.getIncome()-160000 )*20/100);
			 System.out.println("this person pays text 20%."); 
		 }
		 else
		 {
			
			 p.setTax((p.getIncome()-160000 )*30/100);
			 System.out.println("this person pays text 30%."); 
		 }
	 }
 }

}
