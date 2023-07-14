public class MobileCustomer extends Customer {
	int price;
	int bonus;
	MobileCustomer(){
		super();
	};
	MobileCustomer (String name, Grade grade, DiscountMethod discountMethod){
		super(name, grade, discountMethod);
	}
	@Override
	void printCustomerInfo() {
		System.out.println("====================");
		System.out.println("접속 경로: Mobile");
		System.out.println("이름: " + super.getName());
		System.out.println("등급: " + super.getGrade());
		System.out.println("결제 방식: " + super.getDiscountMethod());
		if(super.getDiscountMethod() == DiscountMethod.Bonus){
			System.out.println("보너스: " + bonus);
			System.out.println("결제 금액: " + (price + bonus));
		} else if (super.getDiscountMethod() == DiscountMethod.Discount) {
			System.out.println("결제 금액: " + price);
		}
	}

	@Override
	int calculatePrice(int price) {
		this.price = price - calculateDiscount(price);
		return price - calculateDiscount(price);
	}

	@Override
	public int calculateDiscount(int price) {
		bonus = (int)(price * super.getGrade().getDiscountRate());
		return (int)(price * super.getGrade().getDiscountRate());
	}
}
