package BuilderL06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
//    	Sandwich sandwich =new Sandwich.SandwichBuilder()
//    			.setBread("Regular Bread")
//    			.setFilling("Grilled Chicken")
//    			.setAccompaniment("Cheese").build();
//    	System.out.println(sandwich.toString());
//    	
//    	Sandwich sandwich1 =new Sandwich.SandwichBuilder()
//    			.setBread("Toasted Bread")
//    			.setFilling("Fried Egg")
//    			.setAccompaniment("Sauce").build();
//    	System.out.println(sandwich1.toString());
    	
        Sandwich.SandwichBuilder builder = new Sandwich.SandwichBuilder();
        
        SandwichDirector director = new SandwichDirector(builder);

        
        Sandwich chickenSandwich = director.constructChickenSandwich();
    

        
       
        // Customer orders an egg sandwich
        Sandwich eggSandwich = director.constructEggSandwich();
        System.out.println(eggSandwich);
        System.out.println("1.ChickenSandwich\n2.EggSandwich\n3.custom");
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();
        String input1=scanner.nextLine();
        
        switch (input) {
		case 1: {
			System.out.println(chickenSandwich);	
			break;
		}
		case 2:{
			System.out.println(eggSandwich);
			break;
		}
		case 3:{
			System.out.println("Bread:");
			String bradString=scanner.nextLine();
			System.out.println("Filling:");
			String fillString=scanner.nextLine();
			System.out.println("Accompaniment:");
			String aString=scanner.nextLine();
			Sandwich customSandwich = director.constructCustomSandwich(bradString, fillString, aString);
			System.out.println(customSandwich);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + input);
		}
        
    }
}