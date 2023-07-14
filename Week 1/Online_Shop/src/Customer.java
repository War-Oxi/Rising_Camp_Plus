import java.util.Objects;

abstract public class Customer implements Discount{
	private String name;
	private Grade grade;
	private DiscountMethod discountMethod;

	abstract void printCustomerInfo();
	abstract int calculatePrice(int price);

	public Customer(){}
	public Customer(String name, Grade grade, DiscountMethod discountMethod) {
		this.name = name;
		this.grade = grade;
		this.discountMethod = discountMethod;
	}

//	public boolean equals(Object obj) {
//		if (this == obj) return true;
//		if (obj == null || getClass() != obj.getClass()) return false;
//		Customer customer = (Customer) obj;
//		return Objects.equals(name, customer.name);
//	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	public boolean equals(Object obj) {
		return this.hashCode() == obj.hashCode();
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
}


enum Grade{
	BRONZE(0.1),
	SILVER(0.2),
	GOLD(0.3);

	final double discountRate;
	Grade(double discountRate) {
		this.discountRate =  discountRate;
	}

	public double getDiscountRate() {
		return discountRate;
	}
}

enum DiscountMethod{
	Bonus("보너스 결제 방식"),
	Discount("할인 결제 방식");

	final String DiscountMethod;
	DiscountMethod(String discountMethod){
		this.DiscountMethod = discountMethod;
	}

	public String getDiscountMethod(){
		return DiscountMethod;
	}
}
