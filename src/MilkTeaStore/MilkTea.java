package MilkTeaStore;

public class MilkTea extends Drink{

	public MilkTea(ISizeStrategy size, IPriceStrategy pricePercentage, IFlavorStrategy flavor, boolean isOwnCup) {
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
