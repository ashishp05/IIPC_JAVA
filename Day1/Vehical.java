
public class Vehical {
	
	String Company;
	String Colour , FuelType;
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public String getColour() {
		return Colour;
	}
	public void setColour(String colour) {
		Colour = colour;
	}
	public String getFuelType() {
		return FuelType;
	}
	public void setFuelType(String fuelType) {
		FuelType = fuelType;
	}
	@Override
	public String toString() {
		return "Vehical [Company=" + Company + ", Colour=" + Colour + ", FuelType=" + FuelType + "]";
	}
 
	
}
