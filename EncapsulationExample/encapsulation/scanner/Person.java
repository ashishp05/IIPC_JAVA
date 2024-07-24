package day1.encapsulation.scanner;

public class Person {
 private String name ;
 private String gender;
 private int income;
 private int age ;
 private int tax;
 
 
public Person(String name, String gender, int income, int age, int tax) {
	super();
	this.name = name;
	this.gender = gender;
	this.income = income;
	this.age = age;
	this.tax = tax;
}


public String getName()
{ return name;
	 
}
public void setName(String name)
{
	this.name = name ;
}

public String getGender() {
	return gender;
}


public void setGender(String gender) {
	this.gender = gender;
}


public int getIncome() {
	return income;
}


public void setIncome(int income) {
	this.income = income;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public int getTax() {
	return tax;
}


public void setTax(int tax) {
	this.tax = tax;
}


@Override
public String toString() {
	return "Person [name=" + name + ", gender=" + gender + ", income=" + income + ", age=" + age + ", tax=" + tax + "]";
}
 
 

   
 
 
}
