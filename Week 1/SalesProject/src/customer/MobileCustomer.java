package customer;

import service.BonusService;
import service.SaleService;

public class MobileCustomer extends Customer{


    public MobileCustomer() {

    }

    public MobileCustomer(String name, SaleService saleService) {
        super(name, saleService);
    }

    @Override
    public void printUserInfo() {
        System.out.println("접속 경로: Mobile");
        System.out.println("이름: " + super.getName());
        System.out.println("등급: " + super.getGrade());
        System.out.println("결제 방식: " + super.getSaleService());
        if(super.getSaleService() instanceof BonusService) System.out.println("포인트: " + ((BonusService) super.getSaleService()).getPoint());

    }
}
