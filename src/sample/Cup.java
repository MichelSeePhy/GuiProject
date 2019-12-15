package sample;

public class Cup implements CupInterface {
	private DrinkType content;
	private int sugarLevel;

	public Cup() {
		this.content = null;
		this.sugarLevel = 0;
	}

	@Override
	public void fillUp(DrinkType content, int sugarLevel) {
		this.content = content;
		this.sugarLevel = sugarLevel;


	}

	@Override
	public void pourOut() {
		this.content = null;
		this.sugarLevel = 0;
	}

	@Override
	public boolean isEmpty() {
		if (this.content == null){
			return true;
		}
		else {
		return false;
		}
	}

	@Override
	public int getSugarLevel() {
		System.out.println("Sugar level is: " + sugarLevel);
		return sugarLevel;
	}

	@Override
	public DrinkType getContent() {
		System.out.println("Cup holds: " + content);
		return content;
	}
}
