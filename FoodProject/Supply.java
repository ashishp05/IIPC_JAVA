package firstproject;

import java.util.Scanner;

public class Supply {
	
	private int Code;
	private String FoodName,Sticker,FoodType;
	
	public void GetType() {
		String s=Sticker.toLowerCase();
		System.out.println(s);
		if (s.equals("green")) {
			this.FoodType="Vegetarian";
		}
		else if(s.equals("yellow")) {
			this.FoodType="Contains Egg";
		}
		else if(s.equals("red")) {
			this.FoodType="Non Vegetarian";
		}
		else {
			this.FoodType="Unknown";
		}
	}
	
	public void FoodIn(){
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Code: ");
        Code = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Food Name: ");
        FoodName = sc.nextLine();
        
        System.out.print("Enter Sticker: ");
        Sticker = sc.nextLine();

        sc.close();
        GetType();
	}
	
	public void FoodOut() {
		System.out.println("Code: " + Code);
        System.out.println("Food Name: " + FoodName);
        System.out.println("Sticker: " + Sticker);
        System.out.println("Food Type: " + FoodType);
	}
}
