package Customer;

import Enum.DiscountMethod;
import Enum.Grade;
public class MobileCustomer extends Customer {

	public MobileCustomer() {
		super();
	}

	public MobileCustomer(String name, Grade grade, DiscountMethod discountMethod) {
		super(name, grade, discountMethod);
	}
	public void printCustomerInfo(){
		System.out.println("====================");
		System.out.println("접속 경로: Mobile");
		System.out.println("이름: " + this.getName());
		System.out.println("등급: " + this.getGrade());
		System.out.println("결제 방식: " + this.getDiscountMethod());
		if(this.getDiscountMethod() == DiscountMethod.Bonus){
			System.out.println("보너스: " + super.getBonus());
			System.out.println("결제 금액: " + (super.getPrice() + super.getBonus()));
		} else if (this.getDiscountMethod() == DiscountMethod.Discount) {
			System.out.println("결제 금액: " + super.getPrice());
		}
	}
}

