package day1.encapsulation1;

public class Student {
  private String name ;
  private int id;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Student [name=" + name + ", id=" + id + "]";
} 
  
public Student(String name ,int id)
{ this.name =name ;
this.id =id;
	
}
  
}
