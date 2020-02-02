package virtualpetpackage;

public class VirtualPet {
	
	private int hunger;
	private int thirst;
	private int boredom;
	private int tiredness;
	private int waste;
	
	public int getHunger() {
		return hunger;
	}
	
	public int getThirst() {
		return thirst;
	}
	
	public int getBoredom() {
		return boredom;
	}
	
	public int getTiredness() {
		return tiredness;
	}
	
	public int getWaste() {
		return waste;
	}
	
	public VirtualPet(int hunger, int thirst, int boredom, int tiredness, int waste) {
		this.hunger = hunger; // hunger = 54
		this.thirst = thirst; // thirst = 43
		this.boredom = boredom; // boredom = 31
		this.tiredness = tiredness; // tiredness = 29
		this.waste = waste; // waste = 37
	}
	
	public void feed() {
		hunger = hunger - 10;
		thirst = thirst + 8;
		tiredness = tiredness + 4;
		waste = waste + 6;
	}
	
	public void water() {
		thirst = thirst - 15;
		hunger = hunger - 2;
		waste = waste + 3;
	} 
	
	public void play() {
		boredom = boredom - 13;
		tiredness = tiredness + 8;
		thirst = thirst + 5;
		hunger = hunger + 3;
	}
	
	public void sleep() {
		tiredness = tiredness - 12;
		hunger = hunger + 3;
		thirst = thirst + 6;
		waste = waste + 4;
	}
	
	public void bathroom() {
		waste =  waste - 9;
	}
	
	public void tick() {
		hunger = hunger + 12;
		thirst = thirst + 15;
		tiredness = tiredness + 10;
		waste = waste + 8;
	}

}
