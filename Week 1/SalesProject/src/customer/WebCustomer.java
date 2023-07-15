package customer;

import service.SaleService;

public class WebCustomer extends Customer{


    public WebCustomer() {

    }

    public WebCustomer(String name, SaleService saleService) {
        super(name, saleService);
    }

    @Override
    public void printUserInfo() {
        System.out.println("접속 경로: Web");
        System.out.println("이름: " + super.getName());
        System.out.println("등급: " + super.getGrade());
        System.out.println("결제 방식: " + super.getSaleService());
    }
}
