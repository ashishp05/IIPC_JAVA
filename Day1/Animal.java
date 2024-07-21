package firstproject;

public class Animal {

	String name, type_animal , food_animal;
	
	public void setName(String name)
	{
		this.name = name ;
	}
	public String getName()
	{
		return name;
	}
	public String getType_animal() {
		return type_animal;
	}
	public void setType_animal(String type_animal) {
		this.type_animal = type_animal;
	}
	public String getFood_animal() {
		return food_animal;
	}
	public void setFood_animal(String food_animal) {
		this.food_animal = food_animal;
	}
	
//	void setValue()
//	{
//		name = "Dog";
//		type_animal ="Domestic";
//		food_animal = "Rotii mix";
//	}
//	
//	void getValue()
//	{
//		String n=name;
//	   String	s = type_animal;
//	 String 	f= food_animal;
//		
//		System.out.println("name"+n+" "+"Type"+s+" "+"food"+f);
//	}
}
