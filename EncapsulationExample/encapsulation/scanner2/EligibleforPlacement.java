package day1.encapsulation.scanner2;

public class EligibleforPlacement {
	
	public void eligible(Student s)
	{
		if(s.getAge() <18 )
		{
			s.setJob(false);
			System.out.println("this student not eligible for placement.");
		}
		else if(s.getGender().equalsIgnoreCase("female"))
		{
			s.setJob(true);
			System.out.println("this student is eligible All-Placement Drive role ");
			

		}
		else
		{
			if(s.getCgpa() <6.5)
			{
				s.setJob(false);
				System.out.println("this student not eligible for placement.");	
			}
			else if(s.getCgpa() >=6.5 && s.getCgpa() <7.0)
			{
				s.setJob(true);
				System.out.println("this student is eligible for only 3-Placement Drive role");
			}
			else if(s.getCgpa()>=7.0 && s.getCgpa()<8.0)
			{
				s.setJob(true);
				System.out.println("this student is eligible 5-Placement Drive role ");
			}
			else
			{
				s.setJob(true);
				System.out.println("this student is eligible All-Placement Drive role ");
				
			}
		}
	}

}
