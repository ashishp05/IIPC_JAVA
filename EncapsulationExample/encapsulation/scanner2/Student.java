package day1.encapsulation.scanner2;

public class Student {
  private String name ;
  private String gender;
  private int id ;
  private int age ;
  private double cgpa ;
  private boolean job ;
  
   public Student(String name ,String gender ,int id ,int age ,double cgpa)
   {
	   this.name = name;
	   this.gender = gender;
	   this.id = id;
	   this.age = age;
	   this.cgpa = cgpa ;
	   
   }
   public double getCgpa()
   {
	   return cgpa;
	   
   }
   
   public void setCgpa(double cgpa)
   {
	   this.cgpa = cgpa;
   }
   public String getName()
   {
	   return name;
	  
   }
   public void setName(String name)
   {
	   this.name = name;
   }

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public boolean isJob() {
	return job;
}

public void setJob(boolean job) {
	this.job = job;
}

@Override
public String toString() {
	return "Student [name=" + name + ", gender=" + gender + ", id=" + id + ", age=" + age + ", cgpa=" + cgpa + ", job="
			+ job + "]";
}
   
}
