package virtualpetpackage;
import java.util.Scanner;

public class VirtualPetApp {
	
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		VirtualPet simba = new VirtualPet(54, 43, 31, 29, 37);
		
		int choice = 0;

		System.out.println("Simba the Dog");
		System.out.println("");
		display(simba);
		
		do {
			System.out.println("What do you want to do with Simba the dog");
			System.out.println("1. Feed Simba");
			System.out.println("2. Water Simba");
			System.out.println("3. Play with Simba");
			System.out.println("4. Put Simba to sleep");
			System.out.println("5. Take Simba out to the bathroom");
			System.out.println("6. Do nothing");
			System.out.println("");
			
			choice = input.nextInt();
			System.out.println("");
			
			
			if(choice == 1) {
				System.out.println("You feed Simba");
				simba.feed();
				display(simba);
			}
			
			else if(choice == 2) {
				System.out.println("You watered Simba");
				simba.water();
				display(simba);
			}
			
			else if(choice == 3) {
				System.out.println("You played with Simba");
				simba.play();
				display(simba);
			}
			
			else if(choice == 4) {
				System.out.println("You put Simba to sleep");
				simba.sleep();
				display(simba);
			}
			
			else if(choice == 5) {
				System.out.println("You take Simba out to the bathroom ");
				simba.bathroom();
				display(simba);
			}
			
			else if(choice == 6) {
				System.out.println("...");
				System.out.println("");
			}
			
			else {
				System.out.println("Please enter between 1 and 6");
			}
			
			System.out.println("******************************");
			simba.tick();
			display(simba);
			
		} while (choice != 6); 
		
	}
	
	public static void display(VirtualPet simba) {
		System.out.println("Hunger: " + simba.getHunger());
		System.out.println("Thirst: " + simba.getThirst());
		System.out.println("Boredom: " + simba.getBoredom());
		System.out.println("Tiredness: " + simba.getTiredness());
		System.out.println("Waste: " + simba.getWaste());
		System.out.println("");
	}


}
