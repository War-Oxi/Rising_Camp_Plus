package Customer;

import Enum.DiscountMethod;
import Enum.Grade;
import java.util.Objects;

abstract public class Customer implements Discount {
	private String name;
	private Grade grade;
	private DiscountMethod discountMethod;
	private int price;
	private int bonus;

	public Customer(){}
	public Customer(String name, Grade grade, DiscountMethod discountMethod) {
		this.name = name;
		this.grade = grade;
		this.discountMethod = discountMethod;
	}

	abstract public void printCustomerInfo();
	public void calculatePrice(int price) {
		this.price = price - calculateDiscount(price);
		calculateDiscount(price);
	}

	@Override
	public int calculateDiscount(int price) {
		bonus = (int)(price * this.getGrade().getDiscountRate());
		return (int)(price * this.getGrade().getDiscountRate());
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	public boolean equals(Customer customer) {
		return this.hashCode() == customer.hashCode();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public DiscountMethod getDiscountMethod() {
		return discountMethod;
	}

	public void setDiscountMethod(DiscountMethod discountMethod) {
		this.discountMethod = discountMethod;
	}

	public int getPrice() {
		return price;
	}

	public int getBonus() {
		return bonus;
	}

}


