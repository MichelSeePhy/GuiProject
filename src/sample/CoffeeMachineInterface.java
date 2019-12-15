package sample;

public interface CoffeeMachineInterface {

	public void nextType();

	public void putInCup(Cup cup);

	public void putOutCup();

	public boolean isCupInside();

	public DrinkType getCurrentMode();

	public int getSugarLevel();

	public void incrementSugar();

	public void decrementSugar();
	
	public void makeCoffee();

}
