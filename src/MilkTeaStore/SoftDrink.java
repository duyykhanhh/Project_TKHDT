package MilkTeaStore;

public class SoftDrink extends Drink{

	public SoftDrink(ISizeStrategy size, IPriceStrategy pricePercentage, IFlavorStrategy flavor, boolean isOwnCup) {
		super(size, pricePercentage, flavor, isOwnCup);
		// TODO Auto-generated constructor stub
	}

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
