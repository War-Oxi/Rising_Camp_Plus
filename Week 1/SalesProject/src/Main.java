import customer.Customer;
import customer.MobileCustomer;
import customer.WebCustomer;
import service.BonusService;
import service.DiscountService;
import service.Grade;
import service.SaleService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // 세일 서비스 객체 생성
        SaleService saleService1 = new BonusService(Grade.BRONZE);
        SaleService saleService2 = new BonusService(Grade.SILVER);
        SaleService saleService3 = new BonusService(Grade.GOLD);
        SaleService saleService4 = new DiscountService(Grade.BRONZE);
        SaleService saleService5 = new DiscountService(Grade.SILVER);
        SaleService saleService6 = new DiscountService(Grade.GOLD);



        // 고객 객체 생성
        Customer customer1 = new WebCustomer("이름1", saleService1);
        Customer customer2 = new WebCustomer("이름2", saleService2);
        Customer customer3 = new WebCustomer("이름3", saleService3);
        Customer customer4 = new WebCustomer("이름4", saleService4);
        Customer customer5 = new WebCustomer("이름5", saleService5);
        Customer customer6 = new WebCustomer("이름6", saleService6);
        Customer customer7 = new MobileCustomer("이름7", saleService1);
        Customer customer8 = new MobileCustomer("이름8", saleService2);
        Customer customer9 = new MobileCustomer("이름9", saleService3);
        Customer customer10 = new MobileCustomer("이름10", saleService4);
        Customer customer11 = new MobileCustomer("이름11", saleService5);
        Customer customer12 = new MobileCustomer("이름12", saleService6);


        // 고객 리스트 생성, 추가
        List<Customer> customerList = new ArrayList<>();

        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        customerList.add(customer5);
        customerList.add(customer6);
        customerList.add(customer7);
        customerList.add(customer8);
        customerList.add(customer9);
        customerList.add(customer10);
        customerList.add(customer11);
        customerList.add(customer12);


        // 고객 정보 조회 & 가격 계산
        int price = 10000;
        for (Customer customer : customerList) {
            System.out.println("=====================");
            customer.printUserInfo();
            System.out.println("결제 금액: " + customer.calculate(price));
        }

    }

}
