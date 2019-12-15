package sample;

public class CoffeeMachine implements CoffeeMachineInterface {
	private DrinkType currentMode;
	private int sugarLevel; // [0 .. 5]
	private Cup cup;

	public CoffeeMachine() {
		this.currentMode = DrinkType.AMERICANO;
		this.sugarLevel = 3;
		this.cup = null;
	}

	@Override
	public void nextType() {
		if (currentMode.ordinal() != DrinkType.values().length - 1) {
			currentMode = DrinkType.values()[currentMode.ordinal() + 1];
		} else {
			currentMode = DrinkType.values()[0];
		}
	}

	@Override
	public void putInCup(Cup cup) {
		this.cup = cup;
	}

	@Override
	public void putOutCup() {
		this.cup = null;
	}

	@Override
	public boolean isCupInside() {
		if (this.cup != null){
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public DrinkType getCurrentMode() {
		System.out.println("Current mode is: " + currentMode);
		return currentMode;
	}

	@Override
	public int getSugarLevel() {
		System.out.println("Current sugar lvl: " + sugarLevel);
		return sugarLevel;
	}

	@Override
	public void incrementSugar() {
		if (sugarLevel < 5){
		sugarLevel ++;
		System.out.println("Sugar incremented +1");
		}
		else {
			System.out.println("Cannot increment");
		}
	}

	@Override
	public void decrementSugar() {
		if (sugarLevel > 0){
			sugarLevel --;
			System.out.println("Sugar decremented -1");
		}
		else {
			System.out.println("Cannot decrement");
		}
	}

	@Override
	public void makeCoffee() {
		if (isCupInside()){
			cup.fillUp(currentMode, sugarLevel);
		}
		else {
			System.out.println("Please insert the cup");
		}

	}
}
