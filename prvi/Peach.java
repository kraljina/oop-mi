package hr.fer.oop.zad1;

class Peach extends Fruit {
	private int peachDiameter;
	
	public Peach(String species, int numberOfFruits, double productionPrice, int peachDiameter) {
		super(species, numberOfFruits, productionPrice);
		this.peachDiameter = peachDiameter;
	}

	public int getPeachDiameter() {
		return peachDiameter;
	}

	public void setPeachDiameter(int peachDiameter) {
		this.peachDiameter = peachDiameter;
	}

	@Override
	public double myMarketPrice() {
		if (peachDiameter >= 2 && peachDiameter <= 8) {
			return getProductionPrice() * 1.4 / getNumberOfFruits();
		}
		return getProductionPrice() * 1.3 / getNumberOfFruits();
	}
}
