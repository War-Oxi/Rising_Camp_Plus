package Enum;

public enum Grade {
	BRONZE(0.1),
	SILVER(0.2),
	GOLD(0.3);

	final double discountRate;

	Grade(double discountRate) {
		this.discountRate = discountRate;
	}

	public double getDiscountRate() {
		return discountRate;
	}
}
