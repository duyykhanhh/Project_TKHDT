package MilkTeaStore;

public abstract class Drink {
	private ISizeStrategy size;
	private IPriceStrategy pricePercentage;
	private IFlavorStrategy flavor;
	private boolean isOwnCup;
	
	public Drink(ISizeStrategy size, IPriceStrategy pricePercentage, IFlavorStrategy flavor, boolean isOwnCup) {
		super();
		this.size = size;
		this.pricePercentage = pricePercentage;
		this.flavor = flavor;
		this.isOwnCup = isOwnCup;
	}
	
	public Drink() {
		super();
	}

	public abstract String getDiscription();
	
	public abstract double getPrice();
	
}
