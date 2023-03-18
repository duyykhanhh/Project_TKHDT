package MilkTeaStore;

public class Coffee extends Drink{
	public Coffee(ISizeStrategy size, IPriceStrategy pricePercentage, IFlavorStrategy flavor, boolean isOwnCup) {
		super(size, pricePercentage, flavor, isOwnCup);
		// TODO Auto-generated constructor stub
	}

	private boolean isIce;

	@Override
	public String getDiscription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
