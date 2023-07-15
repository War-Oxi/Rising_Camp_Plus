package Enum;

public enum DiscountMethod {
	Bonus("보너스 결제 방식"),
	Discount("할인 결제 방식");

	final String DiscountMethod;

	DiscountMethod(String discountMethod) {
		this.DiscountMethod = discountMethod;
	}

	public String getDiscountMethod() {
		return DiscountMethod;
	}
}
