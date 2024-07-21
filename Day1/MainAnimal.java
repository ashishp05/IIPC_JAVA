package firstproject;

public class MainAnimal {

	public static void main(String[] args) {
		
		Animal an = new Animal();
		an.setName("Amar");
		an.setFood_animal("All food");
		an.setType_animal("Human");
	 System.out.println("Name :"+ an.getName()+ " Food"+an.getFood_animal()+ " Type"+an.getType_animal());
		
	}

}
