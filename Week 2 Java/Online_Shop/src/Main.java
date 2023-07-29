import Customer.Customer;
import Customer.WebCustomer;
import Customer.MobileCustomer;
import Enum.*;

import java.util.ArrayList;


public class Main {
	public static void main(String[] args) {
		//세일 서비스 객체 생성????

		//고객 객체 생성 방법 1
		WebCustomer webCustomer1 = new WebCustomer();
		webCustomer1.setName("홍길동");
		webCustomer1.setGrade(Grade.GOLD);
		webCustomer1.setDiscountMethod(DiscountMethod.Discount);
		//고객 객체 생성 방법 2
		MobileCustomer mobileCustomer1 = new MobileCustomer("손퐁구", Grade.SILVER, DiscountMethod.Bonus);

		//고객 리스트 생성, 추가
		ArrayList<Customer> customers = new ArrayList<>();
		customers.add(webCustomer1);
		customers.add(mobileCustomer1);
		customers.add(new WebCustomer("개성왕", Grade.BRONZE, DiscountMethod.Bonus));
		customers.add(new WebCustomer("깜지", Grade.BRONZE, DiscountMethod.Bonus));
		customers.add(new WebCustomer("리부트", Grade.BRONZE, DiscountMethod.Bonus));
		customers.add(new MobileCustomer("개성왕", Grade.BRONZE, DiscountMethod.Bonus));

		//가격 계산
		for(Customer customer : customers){
			customer.calculatePrice(10000);
			customer.printCustomerInfo();
		}
		System.out.println("====================");

		System.out.println(customers.get(5).getName() + " " + customers.get(2).getName()); //둘 다 이름이 개성왕임
		System.out.println(customers.get(5).equals(customers.get(2))); //비교할 대상은 사실 다른 객체지만 고객의 요구사항으로 이름이 같으면 같은 인물임
		System.out.println(customers.get(5).hashCode());
		System.out.println(customers.get(2).hashCode());
	}
}
