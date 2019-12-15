package sample;

public interface CupInterface {

	public void fillUp(DrinkType content, int sugarLevel);

	public void pourOut();

	public boolean isEmpty();

	public int getSugarLevel();
	
	public DrinkType getContent();

}
