
public class MainClass {

	public static void main(String[] args) {
		
		Vehical v1 = new Vehical();
		v1.setCompany("Hundai");
		v1.setColour("White");
		v1.setFuelType("Pertol");
		
		System.out.println("Vehical's company "+ v1.getCompany() + " colour "+v1.getColour()+" and fuel type is "+v1.getFuelType());
		
		Vehical v2 = new Vehical();
		v2.setCompany("Hundai");
		v2.setColour("Black");
		v2.setFuelType("Deasel");
		
		
		System.out.println("Vehical's company "+ v2.getCompany() + " colour "+v2.getColour()+" and fuel type is "+v2.getFuelType());
		System.out.println(v1.toString());
		
	}

}
